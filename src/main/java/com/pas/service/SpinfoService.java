package com.pas.service;

import com.pas.pojo.Gysname;
import com.pas.pojo.TbSpinfo;

import java.util.List;

public interface SpinfoService {
    //查询所有零件信息
    List<TbSpinfo> findAll(int page,int size) throws Exception;
    //零件添加保存
    void save(TbSpinfo spinfo);
    //删除当个零件
    void delsp(String id);
    //查询所有的供应商名称,方便添加,选择供应商
    List<Gysname> findByGysname();
    //添加供应商
    String addGys(String name);

    List<Gysname> findAllGys();

    void delgysname(String id);
}
