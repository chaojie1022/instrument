package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.InstrumentParts;
import com.kongwu.insweb.entity.InstrumentPartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstrumentPartsMapper {
    int countByExample(InstrumentPartsExample example);

    int deleteByExample(InstrumentPartsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstrumentParts record);

    int insertSelective(InstrumentParts record);

    List<InstrumentParts> selectByExampleWithBLOBs(InstrumentPartsExample example);

    List<InstrumentParts> selectByExample(InstrumentPartsExample example);

    InstrumentParts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstrumentParts record, @Param("example") InstrumentPartsExample example);

    int updateByExampleWithBLOBs(@Param("record") InstrumentParts record, @Param("example") InstrumentPartsExample example);

    int updateByExample(@Param("record") InstrumentParts record, @Param("example") InstrumentPartsExample example);

    int updateByPrimaryKeySelective(InstrumentParts record);

    int updateByPrimaryKeyWithBLOBs(InstrumentParts record);

    int updateByPrimaryKey(InstrumentParts record);
}