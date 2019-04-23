var leftTreeNodes=[{"id":"yefg","name":"员额法官"},{"id":"fgzl","name":"法官助理"},{"id":"sjy","name":"书记员"}
,{"id":"sfjsyfjry","name":"司法技术、法警"}];

var sfData=[{"id":1,"name":"是"},{"id":2,"name":"否"}];
var yxData=[{"id":1,"name":"有效"},{"id":2,"name":"无效"}];

mini.parse();
var scfy=window.parent.scfy;

var controlNumber = 0;//用于减少onBeforeselect里的方法重复执行一次.此变量非常重要
var beforeIndex = 0;//切换数据表格列前的列index.用于切换行时如果校验失败,返回原行.此变量非常重要
var control = "";//总体控制变量.此变量非常重要.

var bzdysj=true;//启用自定义时间
var contextPath = "/" + window.location.pathname.split("/")[1];
var qssj ="";
var jssj = "";
var tjjzrq = 0;//统计截止日期
var year = 0;//今天日期
var month = 0;//今天日期
var day = 0;//今天日期
var list=[];
var timeId="";//时间范围值类似"2$2015-1"
/**
 * 
 * @param e
 * @returns
 */
function onRenderer(e){
	var obj = mini.get(e.field);
	var data = obj.data;
	if (typeof (data) == "undefined" || data == '') {
		return "";
	}
	for (var i = 0; i < data.length; i++) {
        var g = data[i];
        if (g.id == e.value) {
        	return g.name;
        }
    }
    return "";
}

/**
 * 
 * @param e
 * @returns
 */
function onRendererEx(e){
	var obj = mini.get(e.field+"Ex");
	var data = obj.data;
	if (typeof (data) == "undefined" || data == '') {
		return "";
	}
	for (var i = 0; i < data.length; i++) {
        var g = data[i];
        if (g.id == e.value) {
        	return g.name;
        }
    }
    return "";
}

////////////////////////////////////////////////////////////////////////
//鼠标按下事件
function onRowmousedown(e){	
	//form.setEnabled(true);   	
	var selected = grid.getSelected();
	if(typeof (selected) == "undefined" || selected == ''){//如果是鼠标第一次点击datagrid列,前提是未有选中列
		control = "firstmouse";
	}else if(grid.indexOf(e.record) == grid.indexOf(selected)){//如果是鼠标再次点击同一datagrid列
		control = "againmouse";
	}else if(grid.indexOf(e.record) != grid.indexOf(selected)){//如果是鼠标切换点击datagrid列,前提是已有选中列
		beforeIndex = grid.indexOf(selected);//selected内容是上一行信息.
	}
}

//行选中前发生
function onBeforeselect(e){
	if(control != "firstmouse" && control != "againmouse"){//如果是第一次点击表格列(之前未选中任何表格列)  或  再次点击同一行.则不进行表单校验.
		//alert("刚开始进来前是"+controlNumber);
		controlNumber = controlNumber + 1 ;//因为这个方法执行2遍.只要鼠标点击某行,就执行2遍,点击新增按钮执行一遍
		//----------鼠标点击切换行----------(要保存)
		//onrowmousedown  onbeforeselect  onbeforedeselect   onbeforeselect  onselect

		//----------选中行 新增切换行----------(要保存)
		//onbeforedeselect  onbeforeselect onselect
		
		//alert("进来后是"+controlNumber);
		//鼠标切换保存
		//alert(controlNumber);
    	if(controlNumber % 2 == 0 ){
        	/*去掉换行保存的功能
    		form.validate();
        	if (form.isValid() == false) {//表单校验不通过的话.
	        	e.cancel = true;//阻止选中下一行
	            grid.setSelected(grid.getRow(beforeIndex));//选中原行.
	            alert("信息录入不全");
	        }else{
	        	save("mouse");
	        }*/
	        //alert("进来后的数字"+controlNumber+"是2的倍数");
	    }else{
	    	controlNumber = controlNumber + 1 ;
	    	//alert("进来后的数字不是2的倍数,加1变成2的倍数"+controlNumber);
	    }
	}
	control = "";//这样做的目的是为了.你第一次点击或再次点击之后 .做了别的事情.control里存的还是之前的firstmouse againmouse changemouse
}

function onBeforedeselect(e){
	controlNumber = controlNumber + 1;//只有选中行 点击新增切换行,才调用此方法.目的是为了控制controlNumber为偶数时.调用保存方法.
}

//datagrid第一次加载数据事件
function onLoad(e){
	if(grid.data.length>0){//如果第一次加载.datagrid有数据.则选中第一行.
        //alert(grid.data);
		grid.select(0);
		form.setEnabled(true);
	}else{//否则设置表单不可编辑.
		form.reset();
		form.setEnabled(false);
	}	
}

function onTimeClick(){
	onButtonDate(mini.get("sjqj"),400,580);
}

/*功能：启用时间控件选择
*制作人：杨元胜
*日期：2015-12-16
**/   
function qyZdysjKj(){
    if(!bzdysj){
  	   mini.get("qssj").disable();
  	   mini.get("jssj").disable();
     }
}

/*功能：时间控件发生变化，调整自定义控件
*制作人：杨元胜
*日期：2018-12-16
**/   
function timeChanged(){
	if(bzdysj){
		timeId="0$9999-0";
		mini.get("sjqj").setText("自定义时间区间");
	}
}

/*功能：初始化时间控件
 *制作人：杨元胜
 *日期：2015-8-16
 **/
function init(scfy){
    qssj = mini.get("qssj");
    jssj = mini.get("jssj");
	$.ajax({
	 	url: contextPath+"/CommonAction/queryDate",
	    type: "post",
	    data:{submitData:scfy},
	    async:false,
	    success: function (result) {
	    	 if(result=="-1"){
	    	 	mini.alert("统计截止日期未配置，请核实!");
	    	 }else{
	    	 	var result_ = result.split("@");
	    	 	tjjzrq = result_[0];
	    	 	year = result_[1];
	    	 	month = result_[2];
	    	 	day = result_[3];
	    	 	var YEARS = [];
	    	 	for(var i=2017;i<=year;i++){
	    	 		//全年度
	    	 		var map_nd = {};
	    	 		map_nd.id="1$"+i+"-0";
	    	 		map_nd.name=i+"年度";
	    	 		map_nd.pid="-1";
	    	 		list.push(map_nd);
	    	 		var nYf=12;
	    	 		if(i==parseInt(year)){
	    	 			nYf=parseInt(month)+1;
	    	 		}
	    	 		for(var j=1;j<=nYf;j++){
	    	 			if(j==13){
	    	 				var map_nd = {};
	    	    	 		map_nd.id="1$"+(i+1)+"-0";
	    	    	 		map_nd.name=(parseInt(i)+1)+"年度";
	    	    	 		map_nd.pid="-1";
	    	    	 		list.push(map_nd);
	    	 				var map_yf={};
		    	 			map_yf.id="2$"+(parseInt(i)+1)+"-"+1;
		    	 			map_yf.name="11-"+12+"月份";
		    	 			map_yf.pid="1$"+(i+1)+"-0";
		    	 			list.push(map_yf);
	    	 			}else if(j==12){
	    	 				continue;
	    	 			}
	    	 			else{
		    	 			var map_yf={};
		    	 			map_yf.id="2$"+i+"-"+j;
		    	 			if(j==1){
		    	 				map_yf.name="11-"+12+"月份";
		    	 			}
		    	 			else{
		    	 				map_yf.name="11-"+(j-1)+"月份";
		    	 			}
		    	 			map_yf.pid="1$"+i+"-0";
			    	 		list.push(map_yf);
	    	 			}
	    	 		}
	    	 	}
	    	 	var map_zdy = {};
		 		map_zdy.id="0$9999-0";//9999是4位占位符
		 		map_zdy.name="自定义时间区间";
		 		map_zdy.pid="-1";
		 		map_zdy.isLeaf=false;
		 		map_zdy.asyncLoad=false;
		 		list.push(map_zdy);
		 		if(month==12){
		    	 	mini.get("sjqj").setValue(list[list.length-2].id);
		    	 	mini.get("sjqj").setText((parseInt(year)+1)+"年度"+list[list.length-2].name);
		    	 	if(day>tjjzrq-1){	 
		    	 		qssj.setValue(year+"-11-"+tjjzrq); 
		    	 		jssj.setValue((parseInt(year))+"-12-"+(parseInt(tjjzrq)-1));
		    	 	}else{
		    	 		jssj.setValue((parseInt(year))+"-12-"+day);
		    	 		qssj.setValue(year+"-11-"+tjjzrq); 
		    	 	}
		    		timeId=list[list.length-2].id;
		 		}
		 		else{
		 			mini.get("sjqj").setValue(list[list.length-2].id);
		 			if(month=="11"){
		 				mini.get("sjqj").setText(list[list.length-13].name);
		 				timeId=list[list.length-13].id;
		 			}else{
		 				mini.get("sjqj").setText(year+"年度"+list[list.length-2].name);
		 				timeId=list[list.length-2].id;
		 			}
		    	 	if(day>tjjzrq-1){	 		 
		    	 		jssj.setValue(year+"-"+month+"-"+(parseInt(tjjzrq)-1));
		    	 		qssj.setValue((parseInt(year)-1)+"-11-"+tjjzrq); 
		    	 	}else{
		    	 		jssj.setValue(year+"-"+month+"-"+day);
		    	 		qssj.setValue((parseInt(year)-1)+"-11-"+tjjzrq); 
		    	 	}
		 		}
	    	 }
	    }
	})
}


function onButtonDate(obj,width,height) {
	var btnEdit = obj;
	mini.open({
		url : contextPath+"/views/CommPage/SelectDateWindow.jsp?id_value="+btnEdit.value,
		showMaxButton : false,
		title : "统计时间列表",
		width : width,
		height : height,
		allowResize: false,
        allowDrag:false,
		onload: function () {
			var iframe = this.getIFrameEl();
	        iframe.contentWindow.SetData(list);
        },
		ondestroy : function(action) {
			if (action == "ok") {
			 	var iframe = this.getIFrameEl();
             	var data = iframe.contentWindow.GetData();
             	data = mini.clone(data);
             	//点击年度时,将名称  年度改为全年度
             	var id=data.id;
             	timeId=id;
             	var id1=id.substring(2,6);
             	var id2=id.substring(0,1);
             	var id3=id.substring(7,id.leght);
             	btnEdit.setValue(data.id);
             	if(id2=="1"){
             		btnEdit.setText(id1+"全年度");
             	}else if(id2=="0"){
             		btnEdit.setText(data.name);
             	}else{
             		btnEdit.setText(id1+"年度"+data.name);
             	}
             	//自定义
             	if(id1=="9999"){
             		mini.open({
						url : contextPath+"/views/CommPage/SelectDateZiDiYiWindow.jsp?id_value="+btnEdit.value,
						showMaxButton : false,
						title : "自定义时间区间",
						width : "350",
						height : "350",
						allowResize: false,
				        allowDrag:false,
						onload: function () {
							var iframe = this.getIFrameEl();
							var map={};
							map.year=year;
							map.month=month;
							map.day=day;
					       	iframe.contentWindow.SetData(map);
				        },
						ondestroy : function(action) {
							if (action == "ok") {
							 	var iframe = this.getIFrameEl();
				             	var data = iframe.contentWindow.GetData();
				             	data = mini.clone(data);
			             		qssj.setValue(data.qssj);
	             				jssj.setValue(data.zzsj);
							}
						}
					});
             	}else if(id1==year || id1>year ){//当前年份
             		if(id2==1){
             			qssj.setValue((parseInt(id1)-1)+"-11-"+tjjzrq);
             			if(month<12){
             				if( day>tjjzrq-1){
             					jssj.setValue(year+"-"+month+"-"+(parseInt(tjjzrq)-1));
             				}
             				else{
             					jssj.setValue(year+"-"+month+"-"+day);
             				}
             			}else{      				
         					if(id1>year){
         						jssj.setValue(year+"-12-"+day);
         					}
         					else{
         						jssj.setValue(year+"-11-25");
         					}    			         				
             			}
             		}else if(id2==2){
             			qssj.setValue((parseInt(id1)-1)+"-11-"+tjjzrq);
             			if(id3==1){
             				if(month==12){
             					if(day<tjjzrq){
                     				jssj.setValue((parseInt(id1)-1)+"-12-"+day);
                     			}
                    			else{
                     				jssj.setValue((parseInt(id1)-1)+"-12-"+(parseInt(tjjzrq)-1));
                     			}
             				}
             				else {
             					jssj.setValue((parseInt(id1)-1)+"-12-"+(parseInt(tjjzrq)-1));
             				}
             			}else{      				
             				if((parseInt(month)+1)==id3 && day<tjjzrq){
                 				jssj.setValue(year+"-"+(parseInt(id3)-1)+"-"+day);
                 			}
                			else{
                 				jssj.setValue(year+"-"+(parseInt(id3)-1)+"-"+(parseInt(tjjzrq)-1));
                 			}			         				
             			}
             		}    	
             	}
             	else
             	{
             		qssj.setValue((parseInt(id1)-1)+"-11-"+tjjzrq);
             		if(id2==1){
             			jssj.setValue(id1+"-11-"+(tjjzrq-1));
             		}
             		else if(id3==1){
             			jssj.setValue((parseInt(id1)-1)+"-12-"+tjjzrq);
             		}else{
             			jssj.setValue(id1+"-"+(parseInt(id3)-1)+"-"+(tjjzrq-1));
             		}
             	}    		 
			} 
		}
	});
}

