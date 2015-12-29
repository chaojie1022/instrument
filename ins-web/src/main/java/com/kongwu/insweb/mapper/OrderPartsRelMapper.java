package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.OrderPartsRel;
import com.kongwu.insweb.entity.OrderPartsRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPartsRelMapper {
    int countByExample(OrderPartsRelExample example);

    int deleteByExample(OrderPartsRelExample example);

    int insert(OrderPartsRel record);

    int insertSelective(OrderPartsRel record);

    List<OrderPartsRel> selectByExample(OrderPartsRelExample example);

    int updateByExampleSelective(@Param("record") OrderPartsRel record, @Param("example") OrderPartsRelExample example);

    int updateByExample(@Param("record") OrderPartsRel record, @Param("example") OrderPartsRelExample example);
}