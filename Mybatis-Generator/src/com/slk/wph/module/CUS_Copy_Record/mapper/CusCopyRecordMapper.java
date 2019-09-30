package com.slk.wph.module.CUS_Copy_Record.mapper;

import com.slk.wph.module.CUS_Copy_Record.po.CusCopyRecord;
import com.slk.wph.module.CUS_Copy_Record.po.CusCopyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusCopyRecordMapper {
    int countByExample(CusCopyRecordExample example);

    int deleteByExample(CusCopyRecordExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusCopyRecord record);

    int insertSelective(CusCopyRecord record);

    List<CusCopyRecord> selectByExample(CusCopyRecordExample example);

    CusCopyRecord selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusCopyRecord record, @Param("example") CusCopyRecordExample example);

    int updateByExample(@Param("record") CusCopyRecord record, @Param("example") CusCopyRecordExample example);

    int updateByPrimaryKeySelective(CusCopyRecord record);

    int updateByPrimaryKey(CusCopyRecord record);
}