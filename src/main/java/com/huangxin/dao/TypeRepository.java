package com.huangxin.dao;

import com.huangxin.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author huangxin
 * @date 2020/12/12-15:59
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    Type findByName(String name);



    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
