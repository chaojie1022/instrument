package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.CustomerAssets;
import com.kongwu.insweb.entity.CustomerAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerAssetsMapper {
    int countByExample(CustomerAssetsExample example);

    int deleteByExample(CustomerAssetsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerAssets record);

    int insertSelective(CustomerAssets record);

    List<CustomerAssets> selectByExampleWithBLOBs(CustomerAssetsExample example);

    List<CustomerAssets> selectByExample(CustomerAssetsExample example);

    CustomerAssets selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerAssets record, @Param("example") CustomerAssetsExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomerAssets record, @Param("example") CustomerAssetsExample example);

    int updateByExample(@Param("record") CustomerAssets record, @Param("example") CustomerAssetsExample example);

    int updateByPrimaryKeySelective(CustomerAssets record);

    int updateByPrimaryKeyWithBLOBs(CustomerAssets record);

    int updateByPrimaryKey(CustomerAssets record);
}