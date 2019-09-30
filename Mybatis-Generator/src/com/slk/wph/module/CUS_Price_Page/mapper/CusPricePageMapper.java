package com.slk.wph.module.CUS_Price_Page.mapper;

import com.slk.wph.module.CUS_Price_Page.po.CusPricePage;
import com.slk.wph.module.CUS_Price_Page.po.CusPricePageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusPricePageMapper {
    int countByExample(CusPricePageExample example);

    int deleteByExample(CusPricePageExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusPricePage record);

    int insertSelective(CusPricePage record);

    List<CusPricePage> selectByExample(CusPricePageExample example);

    CusPricePage selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusPricePage record, @Param("example") CusPricePageExample example);

    int updateByExample(@Param("record") CusPricePage record, @Param("example") CusPricePageExample example);

    int updateByPrimaryKeySelective(CusPricePage record);

    int updateByPrimaryKey(CusPricePage record);
}