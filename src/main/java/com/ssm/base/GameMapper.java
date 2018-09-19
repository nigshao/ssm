package com.ssm.base;

import com.ssm.dataSource.DataSourceType;
import com.ssm.dataSource.DataSources;
import com.ssm.dataSource.DataSourse;
import com.ssm.domain.VZyGame;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


@Repository
@Resource
public interface GameMapper {
	public List<VZyGame> getAllGame();
}
