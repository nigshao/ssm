package com.ssm.base;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssm.domain.User;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record) throws SQLException;

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     * 根据userId修改用户信息
     * @param user
     * @return
     */
    int update(User user) throws SQLException;
    
    /**
     * 根据用户编号查询用户信息
     * @param userId
     * @return
     */
    User findByUserId(String userId);
    
    //通过手机号和密码获取用户信息
  	List<User> getUsersByMobile(@Param("loginId") String loginId, @Param("password") String password) throws SQLException;
  	
  	//通过手机号查询userId
  	String selectIdByLoginId(@Param("loginId") String loginId)throws SQLException;
    
    /**
     * 根据parentId 和type查询数量
     * @param parentId
     * @param type
     * @return
     */

	int getCountByparentId(Map<String, Object> map);
	/**
	 * 分页查询用户集合
	 * @param map
	 * @return
	 */
	List<User> getUserlist(Map<String, Object> map);
	/**
	 * 批量删除用户
	 * @param idList
	 * @return
	 */
	int updateIsDeleteByIds(List<String> idList);
	/**
	 * 根据loginId获取数量
	 * @param loginId
	 * @return
	 */
	int getCountByLoginId(String loginId);
	/**
	 * 根据loginId获取
	 * @param loginId
	 * @return
	 */
	User findByLoginId(String loginId);
	/**
	 * 根据parentId删除
	 * @param parentId
	 * @return
	 */
	int deleleByParId(String parentId);
	/**
	 * 根据ids来获取user集合
	 * @param idList
	 * @return
	 */
	List<User> getByIds(List<String> idList);
	/**
	 * 判断银卡是否已近用过
	 * @param idcard
	 * @return
	 */
	int getIdCard(String idcard);
}
