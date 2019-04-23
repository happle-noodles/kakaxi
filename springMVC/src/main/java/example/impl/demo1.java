package example.impl;

import example.dao.BAjztxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface demo1 extends JpaRepository<BAjztxxEntity, Long> {

    public List<BAjztxxEntity> findAllByScfy(Integer scfy);
}
