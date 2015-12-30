package insweb.mapper;

import com.kongwu.insweb.entity.RoleUserRel;
import com.kongwu.insweb.entity.RoleUserRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleUserRelMapper {
    int countByExample(RoleUserRelExample example);

    int deleteByExample(RoleUserRelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleUserRel record);

    int insertSelective(RoleUserRel record);

    List<RoleUserRel> selectByExample(RoleUserRelExample example);

    RoleUserRel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleUserRel record, @Param("example") RoleUserRelExample example);

    int updateByExample(@Param("record") RoleUserRel record, @Param("example") RoleUserRelExample example);

    int updateByPrimaryKeySelective(RoleUserRel record);

    int updateByPrimaryKey(RoleUserRel record);
}