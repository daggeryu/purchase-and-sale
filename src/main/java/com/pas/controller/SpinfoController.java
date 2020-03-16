package com.pas.controller;

import com.github.pagehelper.PageInfo;
import com.pas.pojo.Gysname;
import com.pas.pojo.TbSpinfo;
import com.pas.service.SpinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/spinfo")
public class SpinfoController {
    @Autowired
    private SpinfoService spinfoService;

//    //查询全部产品 未分页
//    @RequestMapping("/findAll.do")
//    public ModelAndView findAll() throws Exception {
//        ModelAndView mv = new ModelAndView();
//        List<TbSpinfo> ps = spinfoService.findAll();
//        mv.addObject("spList", ps);
//        mv.setViewName("spinfo-list");
//        return mv;
//    }

    //查询全部产品
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(
            @RequestParam(name = "page", required = true, defaultValue = "1") int page,
            @RequestParam(name = "size", required = true, defaultValue = "10") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<TbSpinfo> ps = spinfoService.findAll(page, size);
        //PageInfo就是一个分页Bean
        PageInfo pageInfo=new PageInfo(ps);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("spinfo-list");
        return mv;
    }

    //零件添加
    @RequestMapping("/save.do")
    public String save(TbSpinfo spinfo) throws Exception {
        spinfoService.save(spinfo);
        return "redirect:findAll.do";
    }

    /**
     * 根据id删除零件信息
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping("/delsp.do")
    public void delsp(HttpServletRequest request,HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        spinfoService.delsp(id);
    }


    @RequestMapping("/bygysname.do")
    public ModelAndView findByGysname() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Gysname> ps = spinfoService.findByGysname();
        mv.addObject("gysnameList", ps);
        mv.setViewName("spinfo-add");
        return mv;
    }
    @RequestMapping("/addgys.do")
    public String addGys(HttpServletRequest request) throws Exception {
        String name = request.getParameter("name");
        String s = spinfoService.addGys(name);
        return "redirect:findAllGys.do";
    }
    @RequestMapping("/findAllGys.do")
    public ModelAndView addGys() throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Gysname> ps = spinfoService.findAllGys();
        mv.addObject("gysList", ps);
        mv.setViewName("gysname-add");
        return mv;
    }

    @RequestMapping("/delgysname.do")
    public String delspname(HttpServletRequest request) throws Exception {
        String id = request.getParameter("id");
        spinfoService.delgysname(id);
        return "redirect:findAllGys.do";
    }
}
