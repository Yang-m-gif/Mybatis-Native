package com.slk.wph.module.CUS_Setting_Todo.mapper;

import com.slk.wph.module.CUS_Setting_Todo.po.CusSettingTodo;
import com.slk.wph.module.CUS_Setting_Todo.po.CusSettingTodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusSettingTodoMapper {
    int countByExample(CusSettingTodoExample example);

    int deleteByExample(CusSettingTodoExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusSettingTodo record);

    int insertSelective(CusSettingTodo record);

    List<CusSettingTodo> selectByExample(CusSettingTodoExample example);

    CusSettingTodo selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusSettingTodo record, @Param("example") CusSettingTodoExample example);

    int updateByExample(@Param("record") CusSettingTodo record, @Param("example") CusSettingTodoExample example);

    int updateByPrimaryKeySelective(CusSettingTodo record);

    int updateByPrimaryKey(CusSettingTodo record);
}