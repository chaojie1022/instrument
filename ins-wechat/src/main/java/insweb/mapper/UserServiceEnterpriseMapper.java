package insweb.mapper;

import com.kongwu.insweb.entity.UserServiceEnterprise;
import com.kongwu.insweb.entity.UserServiceEnterpriseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserServiceEnterpriseMapper {
    int countByExample(UserServiceEnterpriseExample example);

    int deleteByExample(UserServiceEnterpriseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserServiceEnterprise record);

    int insertSelective(UserServiceEnterprise record);

    List<UserServiceEnterprise> selectByExample(UserServiceEnterpriseExample example);

    UserServiceEnterprise selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserServiceEnterprise record, @Param("example") UserServiceEnterpriseExample example);

    int updateByExample(@Param("record") UserServiceEnterprise record, @Param("example") UserServiceEnterpriseExample example);

    int updateByPrimaryKeySelective(UserServiceEnterprise record);

    int updateByPrimaryKey(UserServiceEnterprise record);
}