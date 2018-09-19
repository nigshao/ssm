package com.ssm.dataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 继承 AbstractRoutingDataSource 这个用来获取当前数据源
 */
public class ThreadLocalRountingDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceTypeManager.getDataSources();
    }
    //ruguo you burenshi dehua  heudui
}
