package insweb.mapper;

import com.kongwu.insweb.entity.WorkOrder;
import com.kongwu.insweb.entity.WorkOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkOrderMapper {
    int countByExample(WorkOrderExample example);

    int deleteByExample(WorkOrderExample example);

    int insert(WorkOrder record);

    int insertSelective(WorkOrder record);

    List<WorkOrder> selectByExampleWithBLOBs(WorkOrderExample example);

    List<WorkOrder> selectByExample(WorkOrderExample example);

    int updateByExampleSelective(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    int updateByExample(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);
}