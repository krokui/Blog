package com.huangxin.service;

import com.huangxin.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author huangxin
 * @date 2020/12/12-15:56
 */
public interface TypeService {

    //保存类型
    Type saveType(Type type);
    //通过id获取类型
    Type getType(Long id);
    //通过name获取类型
    Type getTypeByName(String name);
    //分页查询
    Page<Type> listType(Pageable pageable);
    //获取全部type
    List<Type> listType();
    //按类型数量由大到小排序，共size个type
    List<Type> listTypeTop(Integer size);
    //修改类型
    Type updateType(Long id,Type type);
    //删除类型
    void deleteType(Long id);
}
