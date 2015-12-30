package insweb.mapper;

import com.kongwu.insweb.entity.UserOperator;
import com.kongwu.insweb.entity.UserOperatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperatorMapper {
    int countByExample(UserOperatorExample example);

    int deleteByExample(UserOperatorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserOperator record);

    int insertSelective(UserOperator record);

    List<UserOperator> selectByExample(UserOperatorExample example);

    UserOperator selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserOperator record, @Param("example") UserOperatorExample example);

    int updateByExample(@Param("record") UserOperator record, @Param("example") UserOperatorExample example);

    int updateByPrimaryKeySelective(UserOperator record);

    int updateByPrimaryKey(UserOperator record);
}