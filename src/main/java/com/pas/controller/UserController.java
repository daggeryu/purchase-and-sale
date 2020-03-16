package com.pas.controller;


import com.pas.pojo.UserInfo;
import com.pas.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    //用户添加
    @RequestMapping("/save.do")
    public String save(UserInfo userInfo) throws Exception {
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<UserInfo> userList = userService.findAll();
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getStatus()==1){
                userList.get(i).setStatusStr("可以登录");
            }else {
                userList.get(i).setStatusStr("不可登录");
            }

        }
        mv.addObject("userList", userList);
        mv.setViewName("user-list");
        return mv;
    }
}
