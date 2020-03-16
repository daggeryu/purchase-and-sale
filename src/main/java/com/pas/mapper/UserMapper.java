package com.pas.mapper;

import com.pas.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from userinfo where username=#{username}")
    public UserInfo findByUsername(String username);
    @Select("select * from userinfo")
    List<UserInfo> findAll();
    @Insert("insert into userinfo(name,username,pass,status,phone) values(#{name},#{username},#{pass},#{status},#{phone})")
    void save(UserInfo userInfo);
}
