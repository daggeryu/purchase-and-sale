package com.pas.service.impl;

import com.github.pagehelper.PageHelper;
import com.pas.mapper.SpinfoMapper;
import com.pas.pojo.Gysname;
import com.pas.pojo.TbSpinfo;
import com.pas.service.SpinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SpifoServiceImpl implements SpinfoService {

    @Autowired
    private SpinfoMapper spinfoMapper;
    @Override
    public List<TbSpinfo> findAll(int page,int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        return spinfoMapper.findAll();
    }

    @Override
    public void save(TbSpinfo spinfo) {
        spinfoMapper.save(spinfo);
    }

    @Override
    public void delsp(String id) {
        spinfoMapper.delsp(id);
    }

    @Override
    public List<Gysname> findByGysname() {
        return spinfoMapper.findByGysname();
    }

    @Override
    public String addGys(String name) {
        List<Gysname> Gysname = spinfoMapper.findByGysname();
        int x= 0;//判断供应商名称是否重复

        for (int i = 0; i < Gysname.size(); i++) {
            if (Gysname.get(i).getName().equals(name)){
                x++;
            }
        }
        if (x==0 ){
            if (!name.equals("")){
                spinfoMapper.addGys(name);
            }
        }
        return "";
    }

    @Override
    public List<Gysname> findAllGys() {
        return spinfoMapper.findAllGys();
    }

    @Override
    public void delgysname(String id) {
        spinfoMapper.delgysname(id);
    }


}
