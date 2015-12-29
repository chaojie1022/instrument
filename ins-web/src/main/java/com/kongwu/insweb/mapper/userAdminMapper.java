package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.userAdmin;
import com.kongwu.insweb.entity.userAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userAdminMapper {
    int countByExample(userAdminExample example);

    int deleteByExample(userAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(userAdmin record);

    int insertSelective(userAdmin record);

    List<userAdmin> selectByExample(userAdminExample example);

    userAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") userAdmin record, @Param("example") userAdminExample example);

    int updateByExample(@Param("record") userAdmin record, @Param("example") userAdminExample example);

    int updateByPrimaryKeySelective(userAdmin record);

    int updateByPrimaryKey(userAdmin record);
}