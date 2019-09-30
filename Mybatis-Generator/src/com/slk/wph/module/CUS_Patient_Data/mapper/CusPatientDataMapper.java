package com.slk.wph.module.CUS_Patient_Data.mapper;

import com.slk.wph.module.CUS_Patient_Data.po.CusPatientData;
import com.slk.wph.module.CUS_Patient_Data.po.CusPatientDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusPatientDataMapper {
    int countByExample(CusPatientDataExample example);

    int deleteByExample(CusPatientDataExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusPatientData record);

    int insertSelective(CusPatientData record);

    List<CusPatientData> selectByExample(CusPatientDataExample example);

    CusPatientData selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusPatientData record, @Param("example") CusPatientDataExample example);

    int updateByExample(@Param("record") CusPatientData record, @Param("example") CusPatientDataExample example);

    int updateByPrimaryKeySelective(CusPatientData record);

    int updateByPrimaryKey(CusPatientData record);
}