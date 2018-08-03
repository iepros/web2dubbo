package com.xfma.mapper;

import org.apache.ibatis.annotations.Param;

import com.xfma.pojo.User;

public interface UserMapper {

	public User getUserByName(@Param("name") String name);
}
