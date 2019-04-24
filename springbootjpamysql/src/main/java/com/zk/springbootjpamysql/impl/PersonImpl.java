package com.zk.springbootjpamysql.impl;


import com.zk.springbootjpamysql.entity.BBasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonImpl extends JpaRepository<BBasicEntity,Long> {
}
