package com.ssm.service;

import com.ssm.base.GameMapper;
import com.ssm.dataSource.DataSources;
import com.ssm.dataSource.DataSourse;
import com.ssm.domain.VZyGame;
import com.ssm.exception.ZdyException;
import org.apache.ibatis.mapping.CacheBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    public GameMapper gameMapper;

    /**
     * 将配置加载在service层 测试aop切面是否起作用
     *
     * @return
     */
    @DataSourse(value = DataSources.DATA_SOURCES_LEYUAN)
    @Override
    public List<VZyGame> getlist() throws ZdyException {// power model mai guanzi le xiongdi menshijian jinbu bianhuale
       List<VZyGame> allGame = gameMapper.getAllGame();
        if (allGame.size() > 0) {
            throw new ZdyException("code message", 1);
        }
        return allGame;
        //xiatiang  gang
    }

}
