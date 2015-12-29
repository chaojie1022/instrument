package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.OrderInstrument;
import com.kongwu.insweb.entity.OrderInstrumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderInstrumentMapper {
    int countByExample(OrderInstrumentExample example);

    int deleteByExample(OrderInstrumentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderInstrument record);

    int insertSelective(OrderInstrument record);

    List<OrderInstrument> selectByExample(OrderInstrumentExample example);

    OrderInstrument selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderInstrument record, @Param("example") OrderInstrumentExample example);

    int updateByExample(@Param("record") OrderInstrument record, @Param("example") OrderInstrumentExample example);

    int updateByPrimaryKeySelective(OrderInstrument record);

    int updateByPrimaryKey(OrderInstrument record);
}