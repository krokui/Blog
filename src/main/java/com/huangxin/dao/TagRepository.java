package com.huangxin.dao;

import com.huangxin.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author huangxin
 * @date 2020/12/14-17:16
 */
public interface TagRepository extends JpaRepository<Tag,Long> {

    Tag findByName(String name);

    @Query("select  t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
