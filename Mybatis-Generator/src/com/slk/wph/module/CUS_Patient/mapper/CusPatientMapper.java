package com.slk.wph.module.CUS_Patient.mapper;

import com.slk.wph.module.CUS_Patient.po.CusPatient;
import com.slk.wph.module.CUS_Patient.po.CusPatientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusPatientMapper {
    int countByExample(CusPatientExample example);

    int deleteByExample(CusPatientExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusPatient record);

    int insertSelective(CusPatient record);

    List<CusPatient> selectByExample(CusPatientExample example);

    CusPatient selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusPatient record, @Param("example") CusPatientExample example);

    int updateByExample(@Param("record") CusPatient record, @Param("example") CusPatientExample example);

    int updateByPrimaryKeySelective(CusPatient record);

    int updateByPrimaryKey(CusPatient record);
}