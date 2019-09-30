package com.slk.wph.module.CUS_Discharged_Todo.mapper;

import com.slk.wph.module.CUS_Discharged_Todo.po.CusDischargedTodo;
import com.slk.wph.module.CUS_Discharged_Todo.po.CusDischargedTodoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CusDischargedTodoMapper {
    int countByExample(CusDischargedTodoExample example);

    int deleteByExample(CusDischargedTodoExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(CusDischargedTodo record);

    int insertSelective(CusDischargedTodo record);

    List<CusDischargedTodo> selectByExample(CusDischargedTodoExample example);

    CusDischargedTodo selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") CusDischargedTodo record, @Param("example") CusDischargedTodoExample example);

    int updateByExample(@Param("record") CusDischargedTodo record, @Param("example") CusDischargedTodoExample example);

    int updateByPrimaryKeySelective(CusDischargedTodo record);

    int updateByPrimaryKey(CusDischargedTodo record);
}