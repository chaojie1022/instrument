package com.kongwu.insweb.mapper;

import com.kongwu.insweb.entity.InstrumentCategroy;
import com.kongwu.insweb.entity.InstrumentCategroyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstrumentCategroyMapper {
    int countByExample(InstrumentCategroyExample example);

    int deleteByExample(InstrumentCategroyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstrumentCategroy record);

    int insertSelective(InstrumentCategroy record);

    List<InstrumentCategroy> selectByExampleWithBLOBs(InstrumentCategroyExample example);

    List<InstrumentCategroy> selectByExample(InstrumentCategroyExample example);

    InstrumentCategroy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstrumentCategroy record, @Param("example") InstrumentCategroyExample example);

    int updateByExampleWithBLOBs(@Param("record") InstrumentCategroy record, @Param("example") InstrumentCategroyExample example);

    int updateByExample(@Param("record") InstrumentCategroy record, @Param("example") InstrumentCategroyExample example);

    int updateByPrimaryKeySelective(InstrumentCategroy record);

    int updateByPrimaryKeyWithBLOBs(InstrumentCategroy record);

    int updateByPrimaryKey(InstrumentCategroy record);
}