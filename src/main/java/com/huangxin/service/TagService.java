package com.huangxin.service;

import com.huangxin.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangxin
 * @date 2020/12/14-17:24
 */
public interface TagService {

    //保存标签
    Tag saveTag(Tag tag);
    //通过id获取标签
    Tag getTag(Long id);
    //通过name获取标签
    Tag getTagByName(String name);
    //分页查询
    Page<Tag> listTag(Pageable pageable);
    //获取所有tag
    List<Tag> listTag();
    //按标签数量由大到小排序，共size个tag
    List<Tag> listTagTop(Integer size);
    //通过多个id获取tag
    List<Tag> listTag(String ids);
    //更新标签
    Tag updateTag(Long id,Tag tag);
    //删除标签
    void deleteTag(Long id);
}
