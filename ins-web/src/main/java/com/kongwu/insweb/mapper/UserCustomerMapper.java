package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.UserCustomer;
import com.kongwu.insweb.entity.UserCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCustomerMapper {
    int countByExample(UserCustomerExample example);

    int deleteByExample(UserCustomerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCustomer record);

    int insertSelective(UserCustomer record);

    List<UserCustomer> selectByExample(UserCustomerExample example);

    UserCustomer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCustomer record, @Param("example") UserCustomerExample example);

    int updateByExample(@Param("record") UserCustomer record, @Param("example") UserCustomerExample example);

    int updateByPrimaryKeySelective(UserCustomer record);

    int updateByPrimaryKey(UserCustomer record);
}