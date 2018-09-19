package com.ssm.util;

/**
 * util 工具类常量信息配置
 * 
 * @author qinyinchun
 *
 */
public class GlobalConstants {

	// ------------ httpclient config------------------//
	// 每个主机的最大并行链接数,为每个区设置最大的并发连接数,默认每个路由基础上的连接不超过10个
	public static final int DEFAULT_MAX_PER_ROUTE = PropertyUtil.getIntValue("httpclient.default_max_per_route", 10);
	// 客户端总并行链接最大数。默认值总连接数不能超过200
	public static final int MAX_TOTAL = PropertyUtil.getIntValue("httpclient.max_total", 200);
	// http连接超时时间。默认值设置为30秒
	public static final int CONNECT_TIMEOUT = PropertyUtil.getIntValue("httpclient.connect_timeout", 1000000);
	// socket连接超时时间。默认值设置为15秒
	public static final int SOCKET_TIMEOUT = PropertyUtil.getIntValue("httpclient.socket_timeout", 105000);

	// ----------------------redis pool config---------------------------
	// redis 服务地址
	public static final String REDIS_IP = PropertyUtil.getString("redis.ip");
	// redis 服务端口号
	public static final int REDIS_PORT = PropertyUtil.getIntValue("redis.port", 6379);
	// redis 服务端密码
	public static final String REDIS_PASSWORD = PropertyUtil.getString("redis.password");
	// redis连接超时时间
	public static final int REDIS_TIMEOUT = PropertyUtil.getIntValue("redis.timeout", 10000);
	// 控制redis pool最多有多少个空闲的redis实例
	public static final int REDIS_MAX_IDLE = PropertyUtil.getIntValue("redis.maxIdle", 100);
	// 控制redis pool中可以分配多少个redis实例
	public static final int REDIS_MAX_TOTAL = PropertyUtil.getIntValue("redis.maxTotal", 1000);
	// redis连接等待的最大超市时间
	public static final int REDIS_MAX_WAIT_MILLIS = PropertyUtil.getIntValue("redis.maxWaitMillis", 300);
	// 在borrow一个jedis实例时，是否提前进行alidate操作
	public static final boolean REDIS_ON_BORROW = PropertyUtil.getBoolean("redis.testOnBorrow", true);
	// 在return给pool时，是否提前进行validate操作
	public static final boolean REDIS_ON_RETURN = PropertyUtil.getBoolean("redis.testOnReturn", true);
	// ----------------------redis pool config2---------------------------
	// redis 服务地址
	public static final String REDIS_IP2 = PropertyUtil.getString("redis.ip2");
	// redis 服务端口号
	public static final int REDIS_PORT2 = PropertyUtil.getIntValue("redis.port2", 6379);
	// redis 服务端密码
	public static final String REDIS_PASSWORD2 = PropertyUtil.getString("redis.password2");
	// redis连接超时时间
	public static final int REDIS_TIMEOUT2 = PropertyUtil.getIntValue("redis.timeout2", 10000);
	// 控制redis pool最多有多少个空闲的redis实例
	public static final int REDIS_MAX_IDLE2 = PropertyUtil.getIntValue("redis.maxIdle2", 100);
	// 控制redis pool中可以分配多少个redis实例
	public static final int REDIS_MAX_TOTA2L = PropertyUtil.getIntValue("redis.maxTotal2", 1000);
	// redis连接等待的最大超市时间
	public static final int REDIS_MAX_WAIT_MILLIS2 = PropertyUtil.getIntValue("redis.maxWaitMillis2", 300);
	// 在borrow一个jedis实例时，是否提前进行alidate操作
	public static final boolean REDIS_ON_BORROW2 = PropertyUtil.getBoolean("redis.testOnBorrow2", true);
	// 在return给pool时，是否提前进行validate操作
	public static final boolean REDIS_ON_RETURN2 = PropertyUtil.getBoolean("redis.testOnReturn2", true);

	/******************************* 敏感字文件 *************************************/
	public static final String SENSITIVE_WORD_URL = PropertyUtil.getString("sensitive.url");

}
