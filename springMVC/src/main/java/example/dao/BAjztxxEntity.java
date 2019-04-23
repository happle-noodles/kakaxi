package example.dao;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "B_AJZTXX", schema = "COURTINTETIM_SFXY", catalog = "")
public class BAjztxxEntity {
    private long ajbs;
    private Short scfy;
    private Byte kplb;
    private String ah;
    private Integer ajdxyx;
    private Byte ajjzjd;
    private Byte ajly;
    private Integer ajsj;
    private Long ajslf;
    private Integer bgbsyy;
    private Byte bhzsyy;
    private Byte brkyy;
    private Byte byslyy;
    private Byte byzxly;
    private Short cbr;
    private String cbrmc;
    private String cbspt;
    private String cbsptmc;
    private Byte csxbs;
    private Short csxts;
    private Byte csxyy;
    private Byte cxbglx;
    private Byte cxqs;
    private Byte cxycddcl;
    private String dsrmc;
    private String dsrssdw;
    private Byte estjsy;
    private Short fdlaqx;
    private Short fdsxts;
    private Byte fhcsyy;
    private Byte fssclx;
    private Byte gksl;
    private Byte gpyy;
    private Byte gxyj;
    private Byte hyjafs;
    private String hytcyjs;
    private String hytcymc;
    private Short jaay;
    private Long jabdje;
    private Byte jafs;
    private Time jarq;
    private Byte jasy;
    private Long jdpcje;
    private Byte jdzsly;
    private Byte jysyjycx;
    private Time jyzptrq;
    private Short jyzptspr;
    private Short jyzptyy;
    private Short laay;
    private String labm;
    private Integer labmbs;
    private Short lacqts;
    private Time laqxjmrq;
    private String larmc;
    private Time larq;
    private Time lasprq;
    private Byte pcfs;
    private Byte ptcxjys;
    private Long qsbdje;
    private Short sadjr;
    private Byte satj;
    private Byte scjdlx;
    private Short scr;
    private Time scrq;
    private Short scyj;
    private Byte sfsqtj;
    private Long sjdwje;
    private Short sjlats;
    private Short sjslts;
    private String sjymc;
    private Time sljsrq;
    private Short spr;
    private Short spyj;
    private Long sqbdje;
    private Long ssbdje;
    private Byte ssfw;
    private Byte sslx;
    private Byte ssxz;
    private Time sxjmrq;
    private Time sxqsrq;
    private Time sxrq;
    private Byte sycx;
    private Byte tqxzpc;
    private Short xzglfw;
    private String ysah;
    private String ysfydm;
    private String ysfymc;
    private String ysjafs;
    private String ysjarq;
    private String yslarq;
    private Long zdlxje;
    private Byte zhzx;
    private Byte zjsy;
    private Short zlcxslhzxfy;
    private Byte zsfs;
    private Byte zslx;
    private Byte zsscajzlb;
    private Byte zstjsy;
    private Byte zxfs;
    private Byte zzsy;
    private Short gxbz;
    private Short far;
    private String farmc;
    private Time fasj;
    private Byte ssyy;
    private Byte jyysxx;
    private Byte jysqbqxx;
    private Short ycts;
    private Short kcts;
    private Short syts;
    private Byte ajlb;
    private Short zzts;
    private Short sjybs;
    private String spzzcy;
    private String cxmm;
    private Byte xesc;
    private Byte tslcaj;
    private Time cjrq;
    private Long ztajbs;
    private Byte zwfz;
    private Byte qzyl;
    private Byte scaj;
    private Byte mscc;
    private Byte ylabs;
    private String ylaah;
    private Long sqbqajbs;
    private Byte yszt;
    private Short ysfy;
    private Byte fdmsss;
    private Byte sgsl;
    private Byte tbcx;
    private Byte qdzstj;
    private String zssy;
    private Byte slcx;
    private Byte laj;
    private Byte fzkplb;
    private String jafsmc;
    private Byte sfktsl;
    private Short laayJb;
    private String laaymcJb;
    private Short jaayJb;
    private String jaaymcJb;
    private Short jafsjb;
    private Byte sfsx;
    private Byte cpwssfsw;
    private String cpwsbswyy;
    private Byte zxsszjlb;
    private String sxah;
    private String laaybz;
    private String jaaybz;
    private String sljg;
    private String fzah;
    private Byte wbrygwajxx;
    private Byte sfjyxx;
    private Byte xzjgsfbs;
    private String djr;
    private Byte cdlx;
    private Byte sjsx;
    private Byte fsqj;
    private Byte yscdlx;
    private Byte zxlcjd;
    private String zxlcjdxx;
    private Byte zsscajly;
    private Byte sfss;
    private Byte sqjglx;
    private Long xzxwzl;
    private Byte xzbzwzl;
    private Short fgzl;
    private String fgzlmc;
    private Byte sfkxzqh;
    private Byte sdzl;
    private Byte swqx;
    private Byte sgatqx;
    private String newajbs;
    private Byte zxbdzl;
    private Byte bygklc;
    private Byte wjaws;
    private String bygklcyy;
    private String wjawsyy;
    private Byte xzjgfzrsfdt;
    private Byte cxjssxyy;
    private Byte pjjg;
    private String stm;
    private Byte szzcqss;

    @Id
    @Column(name = "AJBS", nullable = false, precision = 0)
    public long getAjbs() {
        return ajbs;
    }

    public void setAjbs(long ajbs) {
        this.ajbs = ajbs;
    }

    @Basic
    @Column(name = "SCFY", nullable = true, precision = 0)
    public Short getScfy() {
        return scfy;
    }

    public void setScfy(Short scfy) {
        this.scfy = scfy;
    }

    @Basic
    @Column(name = "KPLB", nullable = true, precision = 0)
    public Byte getKplb() {
        return kplb;
    }

    public void setKplb(Byte kplb) {
        this.kplb = kplb;
    }

    @Basic
    @Column(name = "AH", nullable = true, length = 50)
    public String getAh() {
        return ah;
    }

    public void setAh(String ah) {
        this.ah = ah;
    }

    @Basic
    @Column(name = "AJDXYX", nullable = true, precision = 0)
    public Integer getAjdxyx() {
        return ajdxyx;
    }

    public void setAjdxyx(Integer ajdxyx) {
        this.ajdxyx = ajdxyx;
    }

    @Basic
    @Column(name = "AJJZJD", nullable = true, precision = 0)
    public Byte getAjjzjd() {
        return ajjzjd;
    }

    public void setAjjzjd(Byte ajjzjd) {
        this.ajjzjd = ajjzjd;
    }

    @Basic
    @Column(name = "AJLY", nullable = true, precision = 0)
    public Byte getAjly() {
        return ajly;
    }

    public void setAjly(Byte ajly) {
        this.ajly = ajly;
    }

    @Basic
    @Column(name = "AJSJ", nullable = true, precision = 0)
    public Integer getAjsj() {
        return ajsj;
    }

    public void setAjsj(Integer ajsj) {
        this.ajsj = ajsj;
    }

    @Basic
    @Column(name = "AJSLF", nullable = true, precision = 0)
    public Long getAjslf() {
        return ajslf;
    }

    public void setAjslf(Long ajslf) {
        this.ajslf = ajslf;
    }

    @Basic
    @Column(name = "BGBSYY", nullable = true, precision = 0)
    public Integer getBgbsyy() {
        return bgbsyy;
    }

    public void setBgbsyy(Integer bgbsyy) {
        this.bgbsyy = bgbsyy;
    }

    @Basic
    @Column(name = "BHZSYY", nullable = true, precision = 0)
    public Byte getBhzsyy() {
        return bhzsyy;
    }

    public void setBhzsyy(Byte bhzsyy) {
        this.bhzsyy = bhzsyy;
    }

    @Basic
    @Column(name = "BRKYY", nullable = true, precision = 0)
    public Byte getBrkyy() {
        return brkyy;
    }

    public void setBrkyy(Byte brkyy) {
        this.brkyy = brkyy;
    }

    @Basic
    @Column(name = "BYSLYY", nullable = true, precision = 0)
    public Byte getByslyy() {
        return byslyy;
    }

    public void setByslyy(Byte byslyy) {
        this.byslyy = byslyy;
    }

    @Basic
    @Column(name = "BYZXLY", nullable = true, precision = 0)
    public Byte getByzxly() {
        return byzxly;
    }

    public void setByzxly(Byte byzxly) {
        this.byzxly = byzxly;
    }

    @Basic
    @Column(name = "CBR", nullable = true, precision = 0)
    public Short getCbr() {
        return cbr;
    }

    public void setCbr(Short cbr) {
        this.cbr = cbr;
    }

    @Basic
    @Column(name = "CBRMC", nullable = true, length = 40)
    public String getCbrmc() {
        return cbrmc;
    }

    public void setCbrmc(String cbrmc) {
        this.cbrmc = cbrmc;
    }

    @Basic
    @Column(name = "CBSPT", nullable = true, length = 40)
    public String getCbspt() {
        return cbspt;
    }

    public void setCbspt(String cbspt) {
        this.cbspt = cbspt;
    }

    @Basic
    @Column(name = "CBSPTMC", nullable = true, length = 50)
    public String getCbsptmc() {
        return cbsptmc;
    }

    public void setCbsptmc(String cbsptmc) {
        this.cbsptmc = cbsptmc;
    }

    @Basic
    @Column(name = "CSXBS", nullable = true, precision = 0)
    public Byte getCsxbs() {
        return csxbs;
    }

    public void setCsxbs(Byte csxbs) {
        this.csxbs = csxbs;
    }

    @Basic
    @Column(name = "CSXTS", nullable = true, precision = 0)
    public Short getCsxts() {
        return csxts;
    }

    public void setCsxts(Short csxts) {
        this.csxts = csxts;
    }

    @Basic
    @Column(name = "CSXYY", nullable = true, precision = 0)
    public Byte getCsxyy() {
        return csxyy;
    }

    public void setCsxyy(Byte csxyy) {
        this.csxyy = csxyy;
    }

    @Basic
    @Column(name = "CXBGLX", nullable = true, precision = 0)
    public Byte getCxbglx() {
        return cxbglx;
    }

    public void setCxbglx(Byte cxbglx) {
        this.cxbglx = cxbglx;
    }

    @Basic
    @Column(name = "CXQS", nullable = true, precision = 0)
    public Byte getCxqs() {
        return cxqs;
    }

    public void setCxqs(Byte cxqs) {
        this.cxqs = cxqs;
    }

    @Basic
    @Column(name = "CXYCDDCL", nullable = true, precision = 0)
    public Byte getCxycddcl() {
        return cxycddcl;
    }

    public void setCxycddcl(Byte cxycddcl) {
        this.cxycddcl = cxycddcl;
    }

    @Basic
    @Column(name = "DSRMC", nullable = true, length = 1000)
    public String getDsrmc() {
        return dsrmc;
    }

    public void setDsrmc(String dsrmc) {
        this.dsrmc = dsrmc;
    }

    @Basic
    @Column(name = "DSRSSDW", nullable = true, length = 1000)
    public String getDsrssdw() {
        return dsrssdw;
    }

    public void setDsrssdw(String dsrssdw) {
        this.dsrssdw = dsrssdw;
    }

    @Basic
    @Column(name = "ESTJSY", nullable = true, precision = 0)
    public Byte getEstjsy() {
        return estjsy;
    }

    public void setEstjsy(Byte estjsy) {
        this.estjsy = estjsy;
    }

    @Basic
    @Column(name = "FDLAQX", nullable = true, precision = 0)
    public Short getFdlaqx() {
        return fdlaqx;
    }

    public void setFdlaqx(Short fdlaqx) {
        this.fdlaqx = fdlaqx;
    }

    @Basic
    @Column(name = "FDSXTS", nullable = true, precision = 0)
    public Short getFdsxts() {
        return fdsxts;
    }

    public void setFdsxts(Short fdsxts) {
        this.fdsxts = fdsxts;
    }

    @Basic
    @Column(name = "FHCSYY", nullable = true, precision = 0)
    public Byte getFhcsyy() {
        return fhcsyy;
    }

    public void setFhcsyy(Byte fhcsyy) {
        this.fhcsyy = fhcsyy;
    }

    @Basic
    @Column(name = "FSSCLX", nullable = true, precision = 0)
    public Byte getFssclx() {
        return fssclx;
    }

    public void setFssclx(Byte fssclx) {
        this.fssclx = fssclx;
    }

    @Basic
    @Column(name = "GKSL", nullable = true, precision = 0)
    public Byte getGksl() {
        return gksl;
    }

    public void setGksl(Byte gksl) {
        this.gksl = gksl;
    }

    @Basic
    @Column(name = "GPYY", nullable = true, precision = 0)
    public Byte getGpyy() {
        return gpyy;
    }

    public void setGpyy(Byte gpyy) {
        this.gpyy = gpyy;
    }

    @Basic
    @Column(name = "GXYJ", nullable = true, precision = 0)
    public Byte getGxyj() {
        return gxyj;
    }

    public void setGxyj(Byte gxyj) {
        this.gxyj = gxyj;
    }

    @Basic
    @Column(name = "HYJAFS", nullable = true, precision = 0)
    public Byte getHyjafs() {
        return hyjafs;
    }

    public void setHyjafs(Byte hyjafs) {
        this.hyjafs = hyjafs;
    }

    @Basic
    @Column(name = "HYTCYJS", nullable = true, length = 150)
    public String getHytcyjs() {
        return hytcyjs;
    }

    public void setHytcyjs(String hytcyjs) {
        this.hytcyjs = hytcyjs;
    }

    @Basic
    @Column(name = "HYTCYMC", nullable = true, length = 250)
    public String getHytcymc() {
        return hytcymc;
    }

    public void setHytcymc(String hytcymc) {
        this.hytcymc = hytcymc;
    }

    @Basic
    @Column(name = "JAAY", nullable = true, precision = 0)
    public Short getJaay() {
        return jaay;
    }

    public void setJaay(Short jaay) {
        this.jaay = jaay;
    }

    @Basic
    @Column(name = "JABDJE", nullable = true, precision = 0)
    public Long getJabdje() {
        return jabdje;
    }

    public void setJabdje(Long jabdje) {
        this.jabdje = jabdje;
    }

    @Basic
    @Column(name = "JAFS", nullable = true, precision = 0)
    public Byte getJafs() {
        return jafs;
    }

    public void setJafs(Byte jafs) {
        this.jafs = jafs;
    }

    @Basic
    @Column(name = "JARQ", nullable = true)
    public Time getJarq() {
        return jarq;
    }

    public void setJarq(Time jarq) {
        this.jarq = jarq;
    }

    @Basic
    @Column(name = "JASY", nullable = true, precision = 0)
    public Byte getJasy() {
        return jasy;
    }

    public void setJasy(Byte jasy) {
        this.jasy = jasy;
    }

    @Basic
    @Column(name = "JDPCJE", nullable = true, precision = 0)
    public Long getJdpcje() {
        return jdpcje;
    }

    public void setJdpcje(Long jdpcje) {
        this.jdpcje = jdpcje;
    }

    @Basic
    @Column(name = "JDZSLY", nullable = true, precision = 0)
    public Byte getJdzsly() {
        return jdzsly;
    }

    public void setJdzsly(Byte jdzsly) {
        this.jdzsly = jdzsly;
    }

    @Basic
    @Column(name = "JYSYJYCX", nullable = true, precision = 0)
    public Byte getJysyjycx() {
        return jysyjycx;
    }

    public void setJysyjycx(Byte jysyjycx) {
        this.jysyjycx = jysyjycx;
    }

    @Basic
    @Column(name = "JYZPTRQ", nullable = true)
    public Time getJyzptrq() {
        return jyzptrq;
    }

    public void setJyzptrq(Time jyzptrq) {
        this.jyzptrq = jyzptrq;
    }

    @Basic
    @Column(name = "JYZPTSPR", nullable = true, precision = 0)
    public Short getJyzptspr() {
        return jyzptspr;
    }

    public void setJyzptspr(Short jyzptspr) {
        this.jyzptspr = jyzptspr;
    }

    @Basic
    @Column(name = "JYZPTYY", nullable = true, precision = 0)
    public Short getJyzptyy() {
        return jyzptyy;
    }

    public void setJyzptyy(Short jyzptyy) {
        this.jyzptyy = jyzptyy;
    }

    @Basic
    @Column(name = "LAAY", nullable = true, precision = 0)
    public Short getLaay() {
        return laay;
    }

    public void setLaay(Short laay) {
        this.laay = laay;
    }

    @Basic
    @Column(name = "LABM", nullable = true, length = 40)
    public String getLabm() {
        return labm;
    }

    public void setLabm(String labm) {
        this.labm = labm;
    }

    @Basic
    @Column(name = "LABMBS", nullable = true, precision = 0)
    public Integer getLabmbs() {
        return labmbs;
    }

    public void setLabmbs(Integer labmbs) {
        this.labmbs = labmbs;
    }

    @Basic
    @Column(name = "LACQTS", nullable = true, precision = 0)
    public Short getLacqts() {
        return lacqts;
    }

    public void setLacqts(Short lacqts) {
        this.lacqts = lacqts;
    }

    @Basic
    @Column(name = "LAQXJMRQ", nullable = true)
    public Time getLaqxjmrq() {
        return laqxjmrq;
    }

    public void setLaqxjmrq(Time laqxjmrq) {
        this.laqxjmrq = laqxjmrq;
    }

    @Basic
    @Column(name = "LARMC", nullable = true, length = 40)
    public String getLarmc() {
        return larmc;
    }

    public void setLarmc(String larmc) {
        this.larmc = larmc;
    }

    @Basic
    @Column(name = "LARQ", nullable = true)
    public Time getLarq() {
        return larq;
    }

    public void setLarq(Time larq) {
        this.larq = larq;
    }

    @Basic
    @Column(name = "LASPRQ", nullable = true)
    public Time getLasprq() {
        return lasprq;
    }

    public void setLasprq(Time lasprq) {
        this.lasprq = lasprq;
    }

    @Basic
    @Column(name = "PCFS", nullable = true, precision = 0)
    public Byte getPcfs() {
        return pcfs;
    }

    public void setPcfs(Byte pcfs) {
        this.pcfs = pcfs;
    }

    @Basic
    @Column(name = "PTCXJYS", nullable = true, precision = 0)
    public Byte getPtcxjys() {
        return ptcxjys;
    }

    public void setPtcxjys(Byte ptcxjys) {
        this.ptcxjys = ptcxjys;
    }

    @Basic
    @Column(name = "QSBDJE", nullable = true, precision = 0)
    public Long getQsbdje() {
        return qsbdje;
    }

    public void setQsbdje(Long qsbdje) {
        this.qsbdje = qsbdje;
    }

    @Basic
    @Column(name = "SADJR", nullable = true, precision = 0)
    public Short getSadjr() {
        return sadjr;
    }

    public void setSadjr(Short sadjr) {
        this.sadjr = sadjr;
    }

    @Basic
    @Column(name = "SATJ", nullable = true, precision = 0)
    public Byte getSatj() {
        return satj;
    }

    public void setSatj(Byte satj) {
        this.satj = satj;
    }

    @Basic
    @Column(name = "SCJDLX", nullable = true, precision = 0)
    public Byte getScjdlx() {
        return scjdlx;
    }

    public void setScjdlx(Byte scjdlx) {
        this.scjdlx = scjdlx;
    }

    @Basic
    @Column(name = "SCR", nullable = true, precision = 0)
    public Short getScr() {
        return scr;
    }

    public void setScr(Short scr) {
        this.scr = scr;
    }

    @Basic
    @Column(name = "SCRQ", nullable = true)
    public Time getScrq() {
        return scrq;
    }

    public void setScrq(Time scrq) {
        this.scrq = scrq;
    }

    @Basic
    @Column(name = "SCYJ", nullable = true, precision = 0)
    public Short getScyj() {
        return scyj;
    }

    public void setScyj(Short scyj) {
        this.scyj = scyj;
    }

    @Basic
    @Column(name = "SFSQTJ", nullable = true, precision = 0)
    public Byte getSfsqtj() {
        return sfsqtj;
    }

    public void setSfsqtj(Byte sfsqtj) {
        this.sfsqtj = sfsqtj;
    }

    @Basic
    @Column(name = "SJDWJE", nullable = true, precision = 0)
    public Long getSjdwje() {
        return sjdwje;
    }

    public void setSjdwje(Long sjdwje) {
        this.sjdwje = sjdwje;
    }

    @Basic
    @Column(name = "SJLATS", nullable = true, precision = 0)
    public Short getSjlats() {
        return sjlats;
    }

    public void setSjlats(Short sjlats) {
        this.sjlats = sjlats;
    }

    @Basic
    @Column(name = "SJSLTS", nullable = true, precision = 0)
    public Short getSjslts() {
        return sjslts;
    }

    public void setSjslts(Short sjslts) {
        this.sjslts = sjslts;
    }

    @Basic
    @Column(name = "SJYMC", nullable = true, length = 200)
    public String getSjymc() {
        return sjymc;
    }

    public void setSjymc(String sjymc) {
        this.sjymc = sjymc;
    }

    @Basic
    @Column(name = "SLJSRQ", nullable = true)
    public Time getSljsrq() {
        return sljsrq;
    }

    public void setSljsrq(Time sljsrq) {
        this.sljsrq = sljsrq;
    }

    @Basic
    @Column(name = "SPR", nullable = true, precision = 0)
    public Short getSpr() {
        return spr;
    }

    public void setSpr(Short spr) {
        this.spr = spr;
    }

    @Basic
    @Column(name = "SPYJ", nullable = true, precision = 0)
    public Short getSpyj() {
        return spyj;
    }

    public void setSpyj(Short spyj) {
        this.spyj = spyj;
    }

    @Basic
    @Column(name = "SQBDJE", nullable = true, precision = 0)
    public Long getSqbdje() {
        return sqbdje;
    }

    public void setSqbdje(Long sqbdje) {
        this.sqbdje = sqbdje;
    }

    @Basic
    @Column(name = "SSBDJE", nullable = true, precision = 0)
    public Long getSsbdje() {
        return ssbdje;
    }

    public void setSsbdje(Long ssbdje) {
        this.ssbdje = ssbdje;
    }

    @Basic
    @Column(name = "SSFW", nullable = true, precision = 0)
    public Byte getSsfw() {
        return ssfw;
    }

    public void setSsfw(Byte ssfw) {
        this.ssfw = ssfw;
    }

    @Basic
    @Column(name = "SSLX", nullable = true, precision = 0)
    public Byte getSslx() {
        return sslx;
    }

    public void setSslx(Byte sslx) {
        this.sslx = sslx;
    }

    @Basic
    @Column(name = "SSXZ", nullable = true, precision = 0)
    public Byte getSsxz() {
        return ssxz;
    }

    public void setSsxz(Byte ssxz) {
        this.ssxz = ssxz;
    }

    @Basic
    @Column(name = "SXJMRQ", nullable = true)
    public Time getSxjmrq() {
        return sxjmrq;
    }

    public void setSxjmrq(Time sxjmrq) {
        this.sxjmrq = sxjmrq;
    }

    @Basic
    @Column(name = "SXQSRQ", nullable = true)
    public Time getSxqsrq() {
        return sxqsrq;
    }

    public void setSxqsrq(Time sxqsrq) {
        this.sxqsrq = sxqsrq;
    }

    @Basic
    @Column(name = "SXRQ", nullable = true)
    public Time getSxrq() {
        return sxrq;
    }

    public void setSxrq(Time sxrq) {
        this.sxrq = sxrq;
    }

    @Basic
    @Column(name = "SYCX", nullable = true, precision = 0)
    public Byte getSycx() {
        return sycx;
    }

    public void setSycx(Byte sycx) {
        this.sycx = sycx;
    }

    @Basic
    @Column(name = "TQXZPC", nullable = true, precision = 0)
    public Byte getTqxzpc() {
        return tqxzpc;
    }

    public void setTqxzpc(Byte tqxzpc) {
        this.tqxzpc = tqxzpc;
    }

    @Basic
    @Column(name = "XZGLFW", nullable = true, precision = 0)
    public Short getXzglfw() {
        return xzglfw;
    }

    public void setXzglfw(Short xzglfw) {
        this.xzglfw = xzglfw;
    }

    @Basic
    @Column(name = "YSAH", nullable = true, length = 500)
    public String getYsah() {
        return ysah;
    }

    public void setYsah(String ysah) {
        this.ysah = ysah;
    }

    @Basic
    @Column(name = "YSFYDM", nullable = true, length = 100)
    public String getYsfydm() {
        return ysfydm;
    }

    public void setYsfydm(String ysfydm) {
        this.ysfydm = ysfydm;
    }

    @Basic
    @Column(name = "YSFYMC", nullable = true, length = 500)
    public String getYsfymc() {
        return ysfymc;
    }

    public void setYsfymc(String ysfymc) {
        this.ysfymc = ysfymc;
    }

    @Basic
    @Column(name = "YSJAFS", nullable = true, length = 250)
    public String getYsjafs() {
        return ysjafs;
    }

    public void setYsjafs(String ysjafs) {
        this.ysjafs = ysjafs;
    }

    @Basic
    @Column(name = "YSJARQ", nullable = true, length = 250)
    public String getYsjarq() {
        return ysjarq;
    }

    public void setYsjarq(String ysjarq) {
        this.ysjarq = ysjarq;
    }

    @Basic
    @Column(name = "YSLARQ", nullable = true, length = 250)
    public String getYslarq() {
        return yslarq;
    }

    public void setYslarq(String yslarq) {
        this.yslarq = yslarq;
    }

    @Basic
    @Column(name = "ZDLXJE", nullable = true, precision = 0)
    public Long getZdlxje() {
        return zdlxje;
    }

    public void setZdlxje(Long zdlxje) {
        this.zdlxje = zdlxje;
    }

    @Basic
    @Column(name = "ZHZX", nullable = true, precision = 0)
    public Byte getZhzx() {
        return zhzx;
    }

    public void setZhzx(Byte zhzx) {
        this.zhzx = zhzx;
    }

    @Basic
    @Column(name = "ZJSY", nullable = true, precision = 0)
    public Byte getZjsy() {
        return zjsy;
    }

    public void setZjsy(Byte zjsy) {
        this.zjsy = zjsy;
    }

    @Basic
    @Column(name = "ZLCXSLHZXFY", nullable = true, precision = 0)
    public Short getZlcxslhzxfy() {
        return zlcxslhzxfy;
    }

    public void setZlcxslhzxfy(Short zlcxslhzxfy) {
        this.zlcxslhzxfy = zlcxslhzxfy;
    }

    @Basic
    @Column(name = "ZSFS", nullable = true, precision = 0)
    public Byte getZsfs() {
        return zsfs;
    }

    public void setZsfs(Byte zsfs) {
        this.zsfs = zsfs;
    }

    @Basic
    @Column(name = "ZSLX", nullable = true, precision = 0)
    public Byte getZslx() {
        return zslx;
    }

    public void setZslx(Byte zslx) {
        this.zslx = zslx;
    }

    @Basic
    @Column(name = "ZSSCAJZLB", nullable = true, precision = 0)
    public Byte getZsscajzlb() {
        return zsscajzlb;
    }

    public void setZsscajzlb(Byte zsscajzlb) {
        this.zsscajzlb = zsscajzlb;
    }

    @Basic
    @Column(name = "ZSTJSY", nullable = true, precision = 0)
    public Byte getZstjsy() {
        return zstjsy;
    }

    public void setZstjsy(Byte zstjsy) {
        this.zstjsy = zstjsy;
    }

    @Basic
    @Column(name = "ZXFS", nullable = true, precision = 0)
    public Byte getZxfs() {
        return zxfs;
    }

    public void setZxfs(Byte zxfs) {
        this.zxfs = zxfs;
    }

    @Basic
    @Column(name = "ZZSY", nullable = true, precision = 0)
    public Byte getZzsy() {
        return zzsy;
    }

    public void setZzsy(Byte zzsy) {
        this.zzsy = zzsy;
    }

    @Basic
    @Column(name = "GXBZ", nullable = true, precision = 0)
    public Short getGxbz() {
        return gxbz;
    }

    public void setGxbz(Short gxbz) {
        this.gxbz = gxbz;
    }

    @Basic
    @Column(name = "FAR", nullable = true, precision = 0)
    public Short getFar() {
        return far;
    }

    public void setFar(Short far) {
        this.far = far;
    }

    @Basic
    @Column(name = "FARMC", nullable = true, length = 40)
    public String getFarmc() {
        return farmc;
    }

    public void setFarmc(String farmc) {
        this.farmc = farmc;
    }

    @Basic
    @Column(name = "FASJ", nullable = true)
    public Time getFasj() {
        return fasj;
    }

    public void setFasj(Time fasj) {
        this.fasj = fasj;
    }

    @Basic
    @Column(name = "SSYY", nullable = true, precision = 0)
    public Byte getSsyy() {
        return ssyy;
    }

    public void setSsyy(Byte ssyy) {
        this.ssyy = ssyy;
    }

    @Basic
    @Column(name = "JYYSXX", nullable = true, precision = 0)
    public Byte getJyysxx() {
        return jyysxx;
    }

    public void setJyysxx(Byte jyysxx) {
        this.jyysxx = jyysxx;
    }

    @Basic
    @Column(name = "JYSQBQXX", nullable = true, precision = 0)
    public Byte getJysqbqxx() {
        return jysqbqxx;
    }

    public void setJysqbqxx(Byte jysqbqxx) {
        this.jysqbqxx = jysqbqxx;
    }

    @Basic
    @Column(name = "YCTS", nullable = true, precision = 0)
    public Short getYcts() {
        return ycts;
    }

    public void setYcts(Short ycts) {
        this.ycts = ycts;
    }

    @Basic
    @Column(name = "KCTS", nullable = true, precision = 0)
    public Short getKcts() {
        return kcts;
    }

    public void setKcts(Short kcts) {
        this.kcts = kcts;
    }

    @Basic
    @Column(name = "SYTS", nullable = true, precision = 0)
    public Short getSyts() {
        return syts;
    }

    public void setSyts(Short syts) {
        this.syts = syts;
    }

    @Basic
    @Column(name = "AJLB", nullable = true, precision = 0)
    public Byte getAjlb() {
        return ajlb;
    }

    public void setAjlb(Byte ajlb) {
        this.ajlb = ajlb;
    }

    @Basic
    @Column(name = "ZZTS", nullable = true, precision = 0)
    public Short getZzts() {
        return zzts;
    }

    public void setZzts(Short zzts) {
        this.zzts = zzts;
    }

    @Basic
    @Column(name = "SJYBS", nullable = true, precision = 0)
    public Short getSjybs() {
        return sjybs;
    }

    public void setSjybs(Short sjybs) {
        this.sjybs = sjybs;
    }

    @Basic
    @Column(name = "SPZZCY", nullable = true, length = 200)
    public String getSpzzcy() {
        return spzzcy;
    }

    public void setSpzzcy(String spzzcy) {
        this.spzzcy = spzzcy;
    }

    @Basic
    @Column(name = "CXMM", nullable = true, length = 50)
    public String getCxmm() {
        return cxmm;
    }

    public void setCxmm(String cxmm) {
        this.cxmm = cxmm;
    }

    @Basic
    @Column(name = "XESC", nullable = true, precision = 0)
    public Byte getXesc() {
        return xesc;
    }

    public void setXesc(Byte xesc) {
        this.xesc = xesc;
    }

    @Basic
    @Column(name = "TSLCAJ", nullable = true, precision = 0)
    public Byte getTslcaj() {
        return tslcaj;
    }

    public void setTslcaj(Byte tslcaj) {
        this.tslcaj = tslcaj;
    }

    @Basic
    @Column(name = "CJRQ", nullable = true)
    public Time getCjrq() {
        return cjrq;
    }

    public void setCjrq(Time cjrq) {
        this.cjrq = cjrq;
    }

    @Basic
    @Column(name = "ZTAJBS", nullable = true, precision = 0)
    public Long getZtajbs() {
        return ztajbs;
    }

    public void setZtajbs(Long ztajbs) {
        this.ztajbs = ztajbs;
    }

    @Basic
    @Column(name = "ZWFZ", nullable = true, precision = 0)
    public Byte getZwfz() {
        return zwfz;
    }

    public void setZwfz(Byte zwfz) {
        this.zwfz = zwfz;
    }

    @Basic
    @Column(name = "QZYL", nullable = true, precision = 0)
    public Byte getQzyl() {
        return qzyl;
    }

    public void setQzyl(Byte qzyl) {
        this.qzyl = qzyl;
    }

    @Basic
    @Column(name = "SCAJ", nullable = true, precision = 0)
    public Byte getScaj() {
        return scaj;
    }

    public void setScaj(Byte scaj) {
        this.scaj = scaj;
    }

    @Basic
    @Column(name = "MSCC", nullable = true, precision = 0)
    public Byte getMscc() {
        return mscc;
    }

    public void setMscc(Byte mscc) {
        this.mscc = mscc;
    }

    @Basic
    @Column(name = "YLABS", nullable = true, precision = 0)
    public Byte getYlabs() {
        return ylabs;
    }

    public void setYlabs(Byte ylabs) {
        this.ylabs = ylabs;
    }

    @Basic
    @Column(name = "YLAAH", nullable = true, length = 50)
    public String getYlaah() {
        return ylaah;
    }

    public void setYlaah(String ylaah) {
        this.ylaah = ylaah;
    }

    @Basic
    @Column(name = "SQBQAJBS", nullable = true, precision = 0)
    public Long getSqbqajbs() {
        return sqbqajbs;
    }

    public void setSqbqajbs(Long sqbqajbs) {
        this.sqbqajbs = sqbqajbs;
    }

    @Basic
    @Column(name = "YSZT", nullable = true, precision = 0)
    public Byte getYszt() {
        return yszt;
    }

    public void setYszt(Byte yszt) {
        this.yszt = yszt;
    }

    @Basic
    @Column(name = "YSFY", nullable = true, precision = 0)
    public Short getYsfy() {
        return ysfy;
    }

    public void setYsfy(Short ysfy) {
        this.ysfy = ysfy;
    }

    @Basic
    @Column(name = "FDMSSS", nullable = true, precision = 0)
    public Byte getFdmsss() {
        return fdmsss;
    }

    public void setFdmsss(Byte fdmsss) {
        this.fdmsss = fdmsss;
    }

    @Basic
    @Column(name = "SGSL", nullable = true, precision = 0)
    public Byte getSgsl() {
        return sgsl;
    }

    public void setSgsl(Byte sgsl) {
        this.sgsl = sgsl;
    }

    @Basic
    @Column(name = "TBCX", nullable = true, precision = 0)
    public Byte getTbcx() {
        return tbcx;
    }

    public void setTbcx(Byte tbcx) {
        this.tbcx = tbcx;
    }

    @Basic
    @Column(name = "QDZSTJ", nullable = true, precision = 0)
    public Byte getQdzstj() {
        return qdzstj;
    }

    public void setQdzstj(Byte qdzstj) {
        this.qdzstj = qdzstj;
    }

    @Basic
    @Column(name = "ZSSY", nullable = true, length = 300)
    public String getZssy() {
        return zssy;
    }

    public void setZssy(String zssy) {
        this.zssy = zssy;
    }

    @Basic
    @Column(name = "SLCX", nullable = true, precision = 0)
    public Byte getSlcx() {
        return slcx;
    }

    public void setSlcx(Byte slcx) {
        this.slcx = slcx;
    }

    @Basic
    @Column(name = "LAJ", nullable = true, precision = 0)
    public Byte getLaj() {
        return laj;
    }

    public void setLaj(Byte laj) {
        this.laj = laj;
    }

    @Basic
    @Column(name = "FZKPLB", nullable = true, precision = 0)
    public Byte getFzkplb() {
        return fzkplb;
    }

    public void setFzkplb(Byte fzkplb) {
        this.fzkplb = fzkplb;
    }

    @Basic
    @Column(name = "JAFSMC", nullable = true, length = 200)
    public String getJafsmc() {
        return jafsmc;
    }

    public void setJafsmc(String jafsmc) {
        this.jafsmc = jafsmc;
    }

    @Basic
    @Column(name = "SFKTSL", nullable = true, precision = 0)
    public Byte getSfktsl() {
        return sfktsl;
    }

    public void setSfktsl(Byte sfktsl) {
        this.sfktsl = sfktsl;
    }

    @Basic
    @Column(name = "LAAY_JB", nullable = true, precision = 0)
    public Short getLaayJb() {
        return laayJb;
    }

    public void setLaayJb(Short laayJb) {
        this.laayJb = laayJb;
    }

    @Basic
    @Column(name = "LAAYMC_JB", nullable = true, length = 200)
    public String getLaaymcJb() {
        return laaymcJb;
    }

    public void setLaaymcJb(String laaymcJb) {
        this.laaymcJb = laaymcJb;
    }

    @Basic
    @Column(name = "JAAY_JB", nullable = true, precision = 0)
    public Short getJaayJb() {
        return jaayJb;
    }

    public void setJaayJb(Short jaayJb) {
        this.jaayJb = jaayJb;
    }

    @Basic
    @Column(name = "JAAYMC_JB", nullable = true, length = 200)
    public String getJaaymcJb() {
        return jaaymcJb;
    }

    public void setJaaymcJb(String jaaymcJb) {
        this.jaaymcJb = jaaymcJb;
    }

    @Basic
    @Column(name = "JAFSJB", nullable = true, precision = 0)
    public Short getJafsjb() {
        return jafsjb;
    }

    public void setJafsjb(Short jafsjb) {
        this.jafsjb = jafsjb;
    }

    @Basic
    @Column(name = "SFSX", nullable = true, precision = 0)
    public Byte getSfsx() {
        return sfsx;
    }

    public void setSfsx(Byte sfsx) {
        this.sfsx = sfsx;
    }

    @Basic
    @Column(name = "CPWSSFSW", nullable = true, precision = 0)
    public Byte getCpwssfsw() {
        return cpwssfsw;
    }

    public void setCpwssfsw(Byte cpwssfsw) {
        this.cpwssfsw = cpwssfsw;
    }

    @Basic
    @Column(name = "CPWSBSWYY", nullable = true, length = 200)
    public String getCpwsbswyy() {
        return cpwsbswyy;
    }

    public void setCpwsbswyy(String cpwsbswyy) {
        this.cpwsbswyy = cpwsbswyy;
    }

    @Basic
    @Column(name = "ZXSSZJLB", nullable = true, precision = 0)
    public Byte getZxsszjlb() {
        return zxsszjlb;
    }

    public void setZxsszjlb(Byte zxsszjlb) {
        this.zxsszjlb = zxsszjlb;
    }

    @Basic
    @Column(name = "SXAH", nullable = true, length = 50)
    public String getSxah() {
        return sxah;
    }

    public void setSxah(String sxah) {
        this.sxah = sxah;
    }

    @Basic
    @Column(name = "LAAYBZ", nullable = true, length = 200)
    public String getLaaybz() {
        return laaybz;
    }

    public void setLaaybz(String laaybz) {
        this.laaybz = laaybz;
    }

    @Basic
    @Column(name = "JAAYBZ", nullable = true, length = 200)
    public String getJaaybz() {
        return jaaybz;
    }

    public void setJaaybz(String jaaybz) {
        this.jaaybz = jaaybz;
    }

    @Basic
    @Column(name = "SLJG", nullable = true, length = 500)
    public String getSljg() {
        return sljg;
    }

    public void setSljg(String sljg) {
        this.sljg = sljg;
    }

    @Basic
    @Column(name = "FZAH", nullable = true, length = 50)
    public String getFzah() {
        return fzah;
    }

    public void setFzah(String fzah) {
        this.fzah = fzah;
    }

    @Basic
    @Column(name = "WBRYGWAJXX", nullable = true, precision = 0)
    public Byte getWbrygwajxx() {
        return wbrygwajxx;
    }

    public void setWbrygwajxx(Byte wbrygwajxx) {
        this.wbrygwajxx = wbrygwajxx;
    }

    @Basic
    @Column(name = "SFJYXX", nullable = true, precision = 0)
    public Byte getSfjyxx() {
        return sfjyxx;
    }

    public void setSfjyxx(Byte sfjyxx) {
        this.sfjyxx = sfjyxx;
    }

    @Basic
    @Column(name = "XZJGSFBS", nullable = true, precision = 0)
    public Byte getXzjgsfbs() {
        return xzjgsfbs;
    }

    public void setXzjgsfbs(Byte xzjgsfbs) {
        this.xzjgsfbs = xzjgsfbs;
    }

    @Basic
    @Column(name = "DJR", nullable = true, length = 50)
    public String getDjr() {
        return djr;
    }

    public void setDjr(String djr) {
        this.djr = djr;
    }

    @Basic
    @Column(name = "CDLX", nullable = true, precision = 0)
    public Byte getCdlx() {
        return cdlx;
    }

    public void setCdlx(Byte cdlx) {
        this.cdlx = cdlx;
    }

    @Basic
    @Column(name = "SJSX", nullable = true, precision = 0)
    public Byte getSjsx() {
        return sjsx;
    }

    public void setSjsx(Byte sjsx) {
        this.sjsx = sjsx;
    }

    @Basic
    @Column(name = "FSQJ", nullable = true, precision = 0)
    public Byte getFsqj() {
        return fsqj;
    }

    public void setFsqj(Byte fsqj) {
        this.fsqj = fsqj;
    }

    @Basic
    @Column(name = "YSCDLX", nullable = true, precision = 0)
    public Byte getYscdlx() {
        return yscdlx;
    }

    public void setYscdlx(Byte yscdlx) {
        this.yscdlx = yscdlx;
    }

    @Basic
    @Column(name = "ZXLCJD", nullable = true, precision = 0)
    public Byte getZxlcjd() {
        return zxlcjd;
    }

    public void setZxlcjd(Byte zxlcjd) {
        this.zxlcjd = zxlcjd;
    }

    @Basic
    @Column(name = "ZXLCJDXX", nullable = true, length = 550)
    public String getZxlcjdxx() {
        return zxlcjdxx;
    }

    public void setZxlcjdxx(String zxlcjdxx) {
        this.zxlcjdxx = zxlcjdxx;
    }

    @Basic
    @Column(name = "ZSSCAJLY", nullable = true, precision = 0)
    public Byte getZsscajly() {
        return zsscajly;
    }

    public void setZsscajly(Byte zsscajly) {
        this.zsscajly = zsscajly;
    }

    @Basic
    @Column(name = "SFSS", nullable = true, precision = 0)
    public Byte getSfss() {
        return sfss;
    }

    public void setSfss(Byte sfss) {
        this.sfss = sfss;
    }

    @Basic
    @Column(name = "SQJGLX", nullable = true, precision = 0)
    public Byte getSqjglx() {
        return sqjglx;
    }

    public void setSqjglx(Byte sqjglx) {
        this.sqjglx = sqjglx;
    }

    @Basic
    @Column(name = "XZXWZL", nullable = true, precision = 0)
    public Long getXzxwzl() {
        return xzxwzl;
    }

    public void setXzxwzl(Long xzxwzl) {
        this.xzxwzl = xzxwzl;
    }

    @Basic
    @Column(name = "XZBZWZL", nullable = true, precision = 0)
    public Byte getXzbzwzl() {
        return xzbzwzl;
    }

    public void setXzbzwzl(Byte xzbzwzl) {
        this.xzbzwzl = xzbzwzl;
    }

    @Basic
    @Column(name = "FGZL", nullable = true, precision = 0)
    public Short getFgzl() {
        return fgzl;
    }

    public void setFgzl(Short fgzl) {
        this.fgzl = fgzl;
    }

    @Basic
    @Column(name = "FGZLMC", nullable = true, length = 80)
    public String getFgzlmc() {
        return fgzlmc;
    }

    public void setFgzlmc(String fgzlmc) {
        this.fgzlmc = fgzlmc;
    }

    @Basic
    @Column(name = "SFKXZQH", nullable = true, precision = 0)
    public Byte getSfkxzqh() {
        return sfkxzqh;
    }

    public void setSfkxzqh(Byte sfkxzqh) {
        this.sfkxzqh = sfkxzqh;
    }

    @Basic
    @Column(name = "SDZL", nullable = true, precision = 0)
    public Byte getSdzl() {
        return sdzl;
    }

    public void setSdzl(Byte sdzl) {
        this.sdzl = sdzl;
    }

    @Basic
    @Column(name = "SWQX", nullable = true, precision = 0)
    public Byte getSwqx() {
        return swqx;
    }

    public void setSwqx(Byte swqx) {
        this.swqx = swqx;
    }

    @Basic
    @Column(name = "SGATQX", nullable = true, precision = 0)
    public Byte getSgatqx() {
        return sgatqx;
    }

    public void setSgatqx(Byte sgatqx) {
        this.sgatqx = sgatqx;
    }

    @Basic
    @Column(name = "NEWAJBS", nullable = true, length = 18)
    public String getNewajbs() {
        return newajbs;
    }

    public void setNewajbs(String newajbs) {
        this.newajbs = newajbs;
    }

    @Basic
    @Column(name = "ZXBDZL", nullable = true, precision = 0)
    public Byte getZxbdzl() {
        return zxbdzl;
    }

    public void setZxbdzl(Byte zxbdzl) {
        this.zxbdzl = zxbdzl;
    }

    @Basic
    @Column(name = "BYGKLC", nullable = true, precision = 0)
    public Byte getBygklc() {
        return bygklc;
    }

    public void setBygklc(Byte bygklc) {
        this.bygklc = bygklc;
    }

    @Basic
    @Column(name = "WJAWS", nullable = true, precision = 0)
    public Byte getWjaws() {
        return wjaws;
    }

    public void setWjaws(Byte wjaws) {
        this.wjaws = wjaws;
    }

    @Basic
    @Column(name = "BYGKLCYY", nullable = true, length = 200)
    public String getBygklcyy() {
        return bygklcyy;
    }

    public void setBygklcyy(String bygklcyy) {
        this.bygklcyy = bygklcyy;
    }

    @Basic
    @Column(name = "WJAWSYY", nullable = true, length = 200)
    public String getWjawsyy() {
        return wjawsyy;
    }

    public void setWjawsyy(String wjawsyy) {
        this.wjawsyy = wjawsyy;
    }

    @Basic
    @Column(name = "XZJGFZRSFDT", nullable = true, precision = 0)
    public Byte getXzjgfzrsfdt() {
        return xzjgfzrsfdt;
    }

    public void setXzjgfzrsfdt(Byte xzjgfzrsfdt) {
        this.xzjgfzrsfdt = xzjgfzrsfdt;
    }

    @Basic
    @Column(name = "CXJSSXYY", nullable = true, precision = 0)
    public Byte getCxjssxyy() {
        return cxjssxyy;
    }

    public void setCxjssxyy(Byte cxjssxyy) {
        this.cxjssxyy = cxjssxyy;
    }

    @Basic
    @Column(name = "PJJG", nullable = true, precision = 0)
    public Byte getPjjg() {
        return pjjg;
    }

    public void setPjjg(Byte pjjg) {
        this.pjjg = pjjg;
    }

    @Basic
    @Column(name = "STM", nullable = true, length = 100)
    public String getStm() {
        return stm;
    }

    public void setStm(String stm) {
        this.stm = stm;
    }

    @Basic
    @Column(name = "SZZCQSS", nullable = true, precision = 0)
    public Byte getSzzcqss() {
        return szzcqss;
    }

    public void setSzzcqss(Byte szzcqss) {
        this.szzcqss = szzcqss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BAjztxxEntity that = (BAjztxxEntity) o;
        return ajbs == that.ajbs &&
                Objects.equals(scfy, that.scfy) &&
                Objects.equals(kplb, that.kplb) &&
                Objects.equals(ah, that.ah) &&
                Objects.equals(ajdxyx, that.ajdxyx) &&
                Objects.equals(ajjzjd, that.ajjzjd) &&
                Objects.equals(ajly, that.ajly) &&
                Objects.equals(ajsj, that.ajsj) &&
                Objects.equals(ajslf, that.ajslf) &&
                Objects.equals(bgbsyy, that.bgbsyy) &&
                Objects.equals(bhzsyy, that.bhzsyy) &&
                Objects.equals(brkyy, that.brkyy) &&
                Objects.equals(byslyy, that.byslyy) &&
                Objects.equals(byzxly, that.byzxly) &&
                Objects.equals(cbr, that.cbr) &&
                Objects.equals(cbrmc, that.cbrmc) &&
                Objects.equals(cbspt, that.cbspt) &&
                Objects.equals(cbsptmc, that.cbsptmc) &&
                Objects.equals(csxbs, that.csxbs) &&
                Objects.equals(csxts, that.csxts) &&
                Objects.equals(csxyy, that.csxyy) &&
                Objects.equals(cxbglx, that.cxbglx) &&
                Objects.equals(cxqs, that.cxqs) &&
                Objects.equals(cxycddcl, that.cxycddcl) &&
                Objects.equals(dsrmc, that.dsrmc) &&
                Objects.equals(dsrssdw, that.dsrssdw) &&
                Objects.equals(estjsy, that.estjsy) &&
                Objects.equals(fdlaqx, that.fdlaqx) &&
                Objects.equals(fdsxts, that.fdsxts) &&
                Objects.equals(fhcsyy, that.fhcsyy) &&
                Objects.equals(fssclx, that.fssclx) &&
                Objects.equals(gksl, that.gksl) &&
                Objects.equals(gpyy, that.gpyy) &&
                Objects.equals(gxyj, that.gxyj) &&
                Objects.equals(hyjafs, that.hyjafs) &&
                Objects.equals(hytcyjs, that.hytcyjs) &&
                Objects.equals(hytcymc, that.hytcymc) &&
                Objects.equals(jaay, that.jaay) &&
                Objects.equals(jabdje, that.jabdje) &&
                Objects.equals(jafs, that.jafs) &&
                Objects.equals(jarq, that.jarq) &&
                Objects.equals(jasy, that.jasy) &&
                Objects.equals(jdpcje, that.jdpcje) &&
                Objects.equals(jdzsly, that.jdzsly) &&
                Objects.equals(jysyjycx, that.jysyjycx) &&
                Objects.equals(jyzptrq, that.jyzptrq) &&
                Objects.equals(jyzptspr, that.jyzptspr) &&
                Objects.equals(jyzptyy, that.jyzptyy) &&
                Objects.equals(laay, that.laay) &&
                Objects.equals(labm, that.labm) &&
                Objects.equals(labmbs, that.labmbs) &&
                Objects.equals(lacqts, that.lacqts) &&
                Objects.equals(laqxjmrq, that.laqxjmrq) &&
                Objects.equals(larmc, that.larmc) &&
                Objects.equals(larq, that.larq) &&
                Objects.equals(lasprq, that.lasprq) &&
                Objects.equals(pcfs, that.pcfs) &&
                Objects.equals(ptcxjys, that.ptcxjys) &&
                Objects.equals(qsbdje, that.qsbdje) &&
                Objects.equals(sadjr, that.sadjr) &&
                Objects.equals(satj, that.satj) &&
                Objects.equals(scjdlx, that.scjdlx) &&
                Objects.equals(scr, that.scr) &&
                Objects.equals(scrq, that.scrq) &&
                Objects.equals(scyj, that.scyj) &&
                Objects.equals(sfsqtj, that.sfsqtj) &&
                Objects.equals(sjdwje, that.sjdwje) &&
                Objects.equals(sjlats, that.sjlats) &&
                Objects.equals(sjslts, that.sjslts) &&
                Objects.equals(sjymc, that.sjymc) &&
                Objects.equals(sljsrq, that.sljsrq) &&
                Objects.equals(spr, that.spr) &&
                Objects.equals(spyj, that.spyj) &&
                Objects.equals(sqbdje, that.sqbdje) &&
                Objects.equals(ssbdje, that.ssbdje) &&
                Objects.equals(ssfw, that.ssfw) &&
                Objects.equals(sslx, that.sslx) &&
                Objects.equals(ssxz, that.ssxz) &&
                Objects.equals(sxjmrq, that.sxjmrq) &&
                Objects.equals(sxqsrq, that.sxqsrq) &&
                Objects.equals(sxrq, that.sxrq) &&
                Objects.equals(sycx, that.sycx) &&
                Objects.equals(tqxzpc, that.tqxzpc) &&
                Objects.equals(xzglfw, that.xzglfw) &&
                Objects.equals(ysah, that.ysah) &&
                Objects.equals(ysfydm, that.ysfydm) &&
                Objects.equals(ysfymc, that.ysfymc) &&
                Objects.equals(ysjafs, that.ysjafs) &&
                Objects.equals(ysjarq, that.ysjarq) &&
                Objects.equals(yslarq, that.yslarq) &&
                Objects.equals(zdlxje, that.zdlxje) &&
                Objects.equals(zhzx, that.zhzx) &&
                Objects.equals(zjsy, that.zjsy) &&
                Objects.equals(zlcxslhzxfy, that.zlcxslhzxfy) &&
                Objects.equals(zsfs, that.zsfs) &&
                Objects.equals(zslx, that.zslx) &&
                Objects.equals(zsscajzlb, that.zsscajzlb) &&
                Objects.equals(zstjsy, that.zstjsy) &&
                Objects.equals(zxfs, that.zxfs) &&
                Objects.equals(zzsy, that.zzsy) &&
                Objects.equals(gxbz, that.gxbz) &&
                Objects.equals(far, that.far) &&
                Objects.equals(farmc, that.farmc) &&
                Objects.equals(fasj, that.fasj) &&
                Objects.equals(ssyy, that.ssyy) &&
                Objects.equals(jyysxx, that.jyysxx) &&
                Objects.equals(jysqbqxx, that.jysqbqxx) &&
                Objects.equals(ycts, that.ycts) &&
                Objects.equals(kcts, that.kcts) &&
                Objects.equals(syts, that.syts) &&
                Objects.equals(ajlb, that.ajlb) &&
                Objects.equals(zzts, that.zzts) &&
                Objects.equals(sjybs, that.sjybs) &&
                Objects.equals(spzzcy, that.spzzcy) &&
                Objects.equals(cxmm, that.cxmm) &&
                Objects.equals(xesc, that.xesc) &&
                Objects.equals(tslcaj, that.tslcaj) &&
                Objects.equals(cjrq, that.cjrq) &&
                Objects.equals(ztajbs, that.ztajbs) &&
                Objects.equals(zwfz, that.zwfz) &&
                Objects.equals(qzyl, that.qzyl) &&
                Objects.equals(scaj, that.scaj) &&
                Objects.equals(mscc, that.mscc) &&
                Objects.equals(ylabs, that.ylabs) &&
                Objects.equals(ylaah, that.ylaah) &&
                Objects.equals(sqbqajbs, that.sqbqajbs) &&
                Objects.equals(yszt, that.yszt) &&
                Objects.equals(ysfy, that.ysfy) &&
                Objects.equals(fdmsss, that.fdmsss) &&
                Objects.equals(sgsl, that.sgsl) &&
                Objects.equals(tbcx, that.tbcx) &&
                Objects.equals(qdzstj, that.qdzstj) &&
                Objects.equals(zssy, that.zssy) &&
                Objects.equals(slcx, that.slcx) &&
                Objects.equals(laj, that.laj) &&
                Objects.equals(fzkplb, that.fzkplb) &&
                Objects.equals(jafsmc, that.jafsmc) &&
                Objects.equals(sfktsl, that.sfktsl) &&
                Objects.equals(laayJb, that.laayJb) &&
                Objects.equals(laaymcJb, that.laaymcJb) &&
                Objects.equals(jaayJb, that.jaayJb) &&
                Objects.equals(jaaymcJb, that.jaaymcJb) &&
                Objects.equals(jafsjb, that.jafsjb) &&
                Objects.equals(sfsx, that.sfsx) &&
                Objects.equals(cpwssfsw, that.cpwssfsw) &&
                Objects.equals(cpwsbswyy, that.cpwsbswyy) &&
                Objects.equals(zxsszjlb, that.zxsszjlb) &&
                Objects.equals(sxah, that.sxah) &&
                Objects.equals(laaybz, that.laaybz) &&
                Objects.equals(jaaybz, that.jaaybz) &&
                Objects.equals(sljg, that.sljg) &&
                Objects.equals(fzah, that.fzah) &&
                Objects.equals(wbrygwajxx, that.wbrygwajxx) &&
                Objects.equals(sfjyxx, that.sfjyxx) &&
                Objects.equals(xzjgsfbs, that.xzjgsfbs) &&
                Objects.equals(djr, that.djr) &&
                Objects.equals(cdlx, that.cdlx) &&
                Objects.equals(sjsx, that.sjsx) &&
                Objects.equals(fsqj, that.fsqj) &&
                Objects.equals(yscdlx, that.yscdlx) &&
                Objects.equals(zxlcjd, that.zxlcjd) &&
                Objects.equals(zxlcjdxx, that.zxlcjdxx) &&
                Objects.equals(zsscajly, that.zsscajly) &&
                Objects.equals(sfss, that.sfss) &&
                Objects.equals(sqjglx, that.sqjglx) &&
                Objects.equals(xzxwzl, that.xzxwzl) &&
                Objects.equals(xzbzwzl, that.xzbzwzl) &&
                Objects.equals(fgzl, that.fgzl) &&
                Objects.equals(fgzlmc, that.fgzlmc) &&
                Objects.equals(sfkxzqh, that.sfkxzqh) &&
                Objects.equals(sdzl, that.sdzl) &&
                Objects.equals(swqx, that.swqx) &&
                Objects.equals(sgatqx, that.sgatqx) &&
                Objects.equals(newajbs, that.newajbs) &&
                Objects.equals(zxbdzl, that.zxbdzl) &&
                Objects.equals(bygklc, that.bygklc) &&
                Objects.equals(wjaws, that.wjaws) &&
                Objects.equals(bygklcyy, that.bygklcyy) &&
                Objects.equals(wjawsyy, that.wjawsyy) &&
                Objects.equals(xzjgfzrsfdt, that.xzjgfzrsfdt) &&
                Objects.equals(cxjssxyy, that.cxjssxyy) &&
                Objects.equals(pjjg, that.pjjg) &&
                Objects.equals(stm, that.stm) &&
                Objects.equals(szzcqss, that.szzcqss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ajbs, scfy, kplb, ah, ajdxyx, ajjzjd, ajly, ajsj, ajslf, bgbsyy, bhzsyy, brkyy, byslyy, byzxly, cbr, cbrmc, cbspt, cbsptmc, csxbs, csxts, csxyy, cxbglx, cxqs, cxycddcl, dsrmc, dsrssdw, estjsy, fdlaqx, fdsxts, fhcsyy, fssclx, gksl, gpyy, gxyj, hyjafs, hytcyjs, hytcymc, jaay, jabdje, jafs, jarq, jasy, jdpcje, jdzsly, jysyjycx, jyzptrq, jyzptspr, jyzptyy, laay, labm, labmbs, lacqts, laqxjmrq, larmc, larq, lasprq, pcfs, ptcxjys, qsbdje, sadjr, satj, scjdlx, scr, scrq, scyj, sfsqtj, sjdwje, sjlats, sjslts, sjymc, sljsrq, spr, spyj, sqbdje, ssbdje, ssfw, sslx, ssxz, sxjmrq, sxqsrq, sxrq, sycx, tqxzpc, xzglfw, ysah, ysfydm, ysfymc, ysjafs, ysjarq, yslarq, zdlxje, zhzx, zjsy, zlcxslhzxfy, zsfs, zslx, zsscajzlb, zstjsy, zxfs, zzsy, gxbz, far, farmc, fasj, ssyy, jyysxx, jysqbqxx, ycts, kcts, syts, ajlb, zzts, sjybs, spzzcy, cxmm, xesc, tslcaj, cjrq, ztajbs, zwfz, qzyl, scaj, mscc, ylabs, ylaah, sqbqajbs, yszt, ysfy, fdmsss, sgsl, tbcx, qdzstj, zssy, slcx, laj, fzkplb, jafsmc, sfktsl, laayJb, laaymcJb, jaayJb, jaaymcJb, jafsjb, sfsx, cpwssfsw, cpwsbswyy, zxsszjlb, sxah, laaybz, jaaybz, sljg, fzah, wbrygwajxx, sfjyxx, xzjgsfbs, djr, cdlx, sjsx, fsqj, yscdlx, zxlcjd, zxlcjdxx, zsscajly, sfss, sqjglx, xzxwzl, xzbzwzl, fgzl, fgzlmc, sfkxzqh, sdzl, swqx, sgatqx, newajbs, zxbdzl, bygklc, wjaws, bygklcyy, wjawsyy, xzjgfzrsfdt, cxjssxyy, pjjg, stm, szzcqss);
    }
}
