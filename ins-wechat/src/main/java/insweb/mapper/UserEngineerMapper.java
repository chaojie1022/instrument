package insweb.mapper;

import com.kongwu.insweb.entity.UserEngineer;
import com.kongwu.insweb.entity.UserEngineerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEngineerMapper {
    int countByExample(UserEngineerExample example);

    int deleteByExample(UserEngineerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserEngineer record);

    int insertSelective(UserEngineer record);

    List<UserEngineer> selectByExample(UserEngineerExample example);

    UserEngineer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserEngineer record, @Param("example") UserEngineerExample example);

    int updateByExample(@Param("record") UserEngineer record, @Param("example") UserEngineerExample example);

    int updateByPrimaryKeySelective(UserEngineer record);

    int updateByPrimaryKey(UserEngineer record);
}