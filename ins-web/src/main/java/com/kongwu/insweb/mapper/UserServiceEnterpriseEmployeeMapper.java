package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.UserServiceEnterpriseEmployee;
import com.kongwu.insweb.entity.UserServiceEnterpriseEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserServiceEnterpriseEmployeeMapper {
    int countByExample(UserServiceEnterpriseEmployeeExample example);

    int deleteByExample(UserServiceEnterpriseEmployeeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserServiceEnterpriseEmployee record);

    int insertSelective(UserServiceEnterpriseEmployee record);

    List<UserServiceEnterpriseEmployee> selectByExample(UserServiceEnterpriseEmployeeExample example);

    UserServiceEnterpriseEmployee selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserServiceEnterpriseEmployee record, @Param("example") UserServiceEnterpriseEmployeeExample example);

    int updateByExample(@Param("record") UserServiceEnterpriseEmployee record, @Param("example") UserServiceEnterpriseEmployeeExample example);

    int updateByPrimaryKeySelective(UserServiceEnterpriseEmployee record);

    int updateByPrimaryKey(UserServiceEnterpriseEmployee record);
}