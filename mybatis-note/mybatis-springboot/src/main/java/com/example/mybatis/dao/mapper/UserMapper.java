package com.example.mybatis.dao.mapper;

import com.example.mybatis.dao.base.BaseMapper;
import com.example.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 开始mapper扫描
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}