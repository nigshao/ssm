package com.ssm.dataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Resource
@Component
@Order(-10)
public @interface DataSourse {
    public  DataSources value();

    //public String value();

}
