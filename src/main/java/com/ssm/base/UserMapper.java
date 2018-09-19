package com.ssm.base;

import com.ssm.dataSource.DataSourceType;
import com.ssm.dataSource.DataSources;
import com.ssm.dataSource.DataSourse;
import com.ssm.domain.VZyUserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;




@Repository
@Resource
public interface UserMapper {

	public VZyUserInfo getUserById(@Param("userId") long userId);

	public List<VZyUserInfo> getUserList(@Param("listIds") List<Long> listIds);

	public int deleteUserById(@Param("id") long id);

	public int deleteUserByAccount(@Param("account") String account);

	public int deleteUserByUnionId(@Param("unionId") String unionId);

	public int bindMobile(@Param("id") long id, @Param("mobile") String mobile);

	public int changeBindMobile(@Param("id") long id, @Param("mobile") String mobile, @Param("newMobile") String newMobile);
    
}
