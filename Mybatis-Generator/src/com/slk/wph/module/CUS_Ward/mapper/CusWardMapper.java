package com.slk.wph.module.CUS_Ward.mapper;

import com.slk.wph.module.CUS_Ward.po.CusWard;
import com.slk.wph.module.CUS_Ward.po.CusWardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusWardMapper {
    int countByExample(CusWardExample example);

    int deleteByExample(CusWardExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusWard record);

    int insertSelective(CusWard record);

    List<CusWard> selectByExample(CusWardExample example);

    CusWard selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusWard record, @Param("example") CusWardExample example);

    int updateByExample(@Param("record") CusWard record, @Param("example") CusWardExample example);

    int updateByPrimaryKeySelective(CusWard record);

    int updateByPrimaryKey(CusWard record);
}