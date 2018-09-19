package com.ssm.dataSource;

/**
 * 数据源的类别
 */
public enum DataSources {
    DATA_SOURCES_LEYUAN,
    DATA_SOURCES_VZY2014;

    private String value;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
