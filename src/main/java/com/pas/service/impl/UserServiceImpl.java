package com.pas.service.impl;


import com.pas.mapper.UserMapper;
import com.pas.pojo.UserInfo;
import com.pas.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        try {
            userInfo = userMapper.findByUsername(username);
//            userInfo.setStatus(1);
            System.out.println(userInfo.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //处理自己的用户对象封装成UserDetails
        User user = new User(userInfo.getUsername(), userInfo.getPass(), userInfo.getStatus() == 0 ? false : true, true, true, true, getAuthority());
        return user;
    }
    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority() {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
            list.add(new SimpleGrantedAuthority("ROLE_USER"));
        return list;
    }

    @Override
    public List<UserInfo> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void save(UserInfo userInfo) {
        userMapper.save(userInfo);
    }
}
