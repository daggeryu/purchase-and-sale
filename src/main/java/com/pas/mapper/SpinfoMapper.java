package com.pas.mapper;

import com.pas.pojo.Gysname;
import com.pas.pojo.TbSpinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SpinfoMapper {

    //查询所有的产品信息
    @Select("select * from tb_spinfo")
    public List<TbSpinfo> findAll() throws Exception;
    @Insert("insert into tb_spinfo(spname,cd,gg,ph,gysname) values(#{spname},#{cd},#{gg},#{ph},#{gysname})")
    void save(TbSpinfo spinfo);
    @Delete("delete from tb_spinfo where id = #{id}")
    void delsp(String id);

    @Select("select name from gysname")
    List<Gysname> findByGysname();
    @Insert("insert into gysname(name) values (#{gysname})")
    void addGys(String name);

    @Select("select * from gysname")
    List<Gysname> findAllGys();
    @Delete("delete from gysname where id = #{id}")
    void delgysname(String id);
}
