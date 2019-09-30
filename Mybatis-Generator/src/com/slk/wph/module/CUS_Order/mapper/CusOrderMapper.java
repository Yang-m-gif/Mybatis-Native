package com.slk.wph.module.CUS_Order.mapper;

import com.slk.wph.module.CUS_Order.po.CusOrder;
import com.slk.wph.module.CUS_Order.po.CusOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusOrderMapper {
    int countByExample(CusOrderExample example);

    int deleteByExample(CusOrderExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusOrder record);

    int insertSelective(CusOrder record);

    List<CusOrder> selectByExample(CusOrderExample example);

    CusOrder selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusOrder record, @Param("example") CusOrderExample example);

    int updateByExample(@Param("record") CusOrder record, @Param("example") CusOrderExample example);

    int updateByPrimaryKeySelective(CusOrder record);

    int updateByPrimaryKey(CusOrder record);
}