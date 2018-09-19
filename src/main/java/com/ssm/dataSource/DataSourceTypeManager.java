package com.ssm.dataSource;

/**
 * 通过ThreadLocal 来保存每个线程选择哪个数据源的表识
 *
 */
public class DataSourceTypeManager {

    private static final ThreadLocal<DataSources> dataSourceLocalType = new ThreadLocal<DataSources>(){
        @Override
        protected DataSources initialValue(){
            //默认讲数据源给到source1
            return DataSources.DATA_SOURCES_LEYUAN;
            //return DataSources.DATA_SOURCES_VZY2014;
        }

    };

    public static DataSources getDataSources() {
        return dataSourceLocalType.get();
    }

    public static void setDataSources(DataSources dataSources){

        dataSourceLocalType.set(dataSources);
    }
    public static void resetDataSources(DataSources dataSources){
        dataSourceLocalType.set(dataSources);
    }
}
