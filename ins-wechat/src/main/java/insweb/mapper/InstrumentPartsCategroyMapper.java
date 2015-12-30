package insweb.mapper;

import com.kongwu.insweb.entity.InstrumentPartsCategroy;
import com.kongwu.insweb.entity.InstrumentPartsCategroyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstrumentPartsCategroyMapper {
    int countByExample(InstrumentPartsCategroyExample example);

    int deleteByExample(InstrumentPartsCategroyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InstrumentPartsCategroy record);

    int insertSelective(InstrumentPartsCategroy record);

    List<InstrumentPartsCategroy> selectByExampleWithBLOBs(InstrumentPartsCategroyExample example);

    List<InstrumentPartsCategroy> selectByExample(InstrumentPartsCategroyExample example);

    InstrumentPartsCategroy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InstrumentPartsCategroy record, @Param("example") InstrumentPartsCategroyExample example);

    int updateByExampleWithBLOBs(@Param("record") InstrumentPartsCategroy record, @Param("example") InstrumentPartsCategroyExample example);

    int updateByExample(@Param("record") InstrumentPartsCategroy record, @Param("example") InstrumentPartsCategroyExample example);

    int updateByPrimaryKeySelective(InstrumentPartsCategroy record);

    int updateByPrimaryKeyWithBLOBs(InstrumentPartsCategroy record);

    int updateByPrimaryKey(InstrumentPartsCategroy record);
}