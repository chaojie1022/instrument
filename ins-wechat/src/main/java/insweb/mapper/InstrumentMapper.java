package insweb.mapper;

import com.kongwu.insweb.entity.Instrument;
import com.kongwu.insweb.entity.InstrumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstrumentMapper {
    int countByExample(InstrumentExample example);

    int deleteByExample(InstrumentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Instrument record);

    int insertSelective(Instrument record);

    List<Instrument> selectByExampleWithBLOBs(InstrumentExample example);

    List<Instrument> selectByExample(InstrumentExample example);

    Instrument selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Instrument record, @Param("example") InstrumentExample example);

    int updateByExampleWithBLOBs(@Param("record") Instrument record, @Param("example") InstrumentExample example);

    int updateByExample(@Param("record") Instrument record, @Param("example") InstrumentExample example);

    int updateByPrimaryKeySelective(Instrument record);

    int updateByPrimaryKeyWithBLOBs(Instrument record);

    int updateByPrimaryKey(Instrument record);
}