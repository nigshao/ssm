package com.ssm.dataSource;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
    public class DataSourceAop {

    /*@Around("execution(public * com.ssm.service..*.*(..))")
    public Object dataSourceAspect(ProceedingJoinPoint joinPoint) throws Throwable {

        Class<?> classz=joinPoint.getTarget().getClass();
        classz=classz.getInterfaces()[0];
        DataSourse dataSourse = classz.getAnnotation(DataSourse.class);
        if(dataSourse!=null){
            String dataSourceTarget=dataSourse.value();
            if(StringUtils.isNotEmpty(dataSourceTarget)){
                if (dataSourceTarget.equals(DataSourceType.DATA_SOURCES_LEYUAN)){
                    DataSourceTypeManager.setDataSources(DataSources.DATA_SOURCES_LEYUAN);
                }else{
                    DataSourceTypeManager.setDataSources(DataSources.DATA_SOURCES_VZY2014);
                }

            }
        }
        Object result=joinPoint.proceed();

        return result;
    }*/

  //第一种配置方式 只在service层起作用
   @Before("@annotation(dataSource)")
    public void changeDataSource(JoinPoint point, DataSourse dataSource) throws Throwable {

        //获取当前的指定的数据源; 厉害了 兄弟们
       if (dataSource.value().equals(DataSourceType.DATA_SOURCES_LEYUAN)){
           DataSourceTypeManager.setDataSources(DataSources.DATA_SOURCES_LEYUAN);
       }else{
           DataSourceTypeManager.setDataSources(DataSources.DATA_SOURCES_VZY2014);
       }

        //如果不在我们注入的所有的数据源范围之内，那么输出警告信息，系统自动使用默认的数据源。
        //tuodang zhihou jingfang kaixuanlu xiaoqu jingfu   dixiashi xiongdimmen weism ne xiongdi men fensile
        System.out.println("======= 进入到切面===============");

    }


    //结束后重置数据源vzy2014
    @After("@annotation(dataSource)")
    public void restoreDataSource(JoinPoint point,  DataSourse dataSource) {
        //huojian jigoujiangzhang
        DataSourceTypeManager.resetDataSources(DataSources.DATA_SOURCES_LEYUAN);

    }

        /*@Pointcut("@within(com.ssm.dataSource.DataSourse)||@annotation(com.ssm.dataSource.DataSourse)")
        public void pointcut() {}

        @Before("pointcut()")
        public void doBefore(JoinPoint joinPoint)
        {
            Method method = ((MethodSignature)joinPoint.getSignature()).getMethod();
            DataSourse annotationClass = method.getAnnotation(DataSourse.class);//获取方法上的注解
            if(annotationClass == null){
                annotationClass = joinPoint.getTarget().getClass().getAnnotation(DataSourse.class);//获取类上面的注解
                if(annotationClass == null) return;
            }
            //获取注解上的数据源的值的信息
            DataSources userDatasource = annotationClass.value();
            if(userDatasource !=null){
                //给当前的执行SQL的操作设置特殊的数据源的信息
                DataSourceTypeManager.setDataSources(userDatasource);
            }
            System.out.println("AOP动态切换数据源，className"+joinPoint.getTarget().getClass().getName()+"methodName"+method.getName()+";dataSourceKey:"+userDatasource);
        }

        @After("pointcut()")
        public void after(JoinPoint point) {
            //清理掉当前设置的数据源，设置为默认的数据源
            DataSourceTypeManager.resetDataSources(DataSources.DATA_SOURCES_VZY2014);
        }*/




}
