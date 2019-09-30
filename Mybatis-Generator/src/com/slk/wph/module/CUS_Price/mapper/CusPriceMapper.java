package com.slk.wph.module.CUS_Price.mapper;

import com.slk.wph.module.CUS_Price.po.CusPrice;
import com.slk.wph.module.CUS_Price.po.CusPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusPriceMapper {
    int countByExample(CusPriceExample example);

    int deleteByExample(CusPriceExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusPrice record);

    int insertSelective(CusPrice record);

    List<CusPrice> selectByExample(CusPriceExample example);

    CusPrice selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusPrice record, @Param("example") CusPriceExample example);

    int updateByExample(@Param("record") CusPrice record, @Param("example") CusPriceExample example);

    int updateByPrimaryKeySelective(CusPrice record);

    int updateByPrimaryKey(CusPrice record);
}