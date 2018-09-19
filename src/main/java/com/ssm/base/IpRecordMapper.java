package com.ssm.base;

import org.springframework.stereotype.Repository;

import com.ssm.domain.IpRecord;
@Repository
public interface IpRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IpRecord record);

    int insertSelective(IpRecord record);

    IpRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IpRecord record);

    int updateByPrimaryKey(IpRecord record);
}