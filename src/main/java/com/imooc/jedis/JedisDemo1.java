package com.imooc.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Jedis测试
 * @author error
 *
 */
public class JedisDemo1 {


	/**
	 * 单实例的测试
	 */
	@Test
	public void demo1(){
		//设置ip地址和端口
		Jedis jedis =new Jedis("127.0.0.1",6379);
		//保存数据
		jedis.set("name", "jedis0");
		//获取数据
		String value=jedis.get("name");		
		System.out.println(value);
		//释放资源
		jedis.close();
	}
	
	/**
	 * 连接池方式连接
	 */
	@Test
	public void demo2(){
		//获取连接池配置对象
		JedisPoolConfig config =new JedisPoolConfig();
		//设置最大连接数
		config.setMaxTotal(30);
		//设置最大空闲连接数
		config.setMaxIdle(10);
		//获得连接池
		JedisPool jedisPool =new JedisPool(config,"127.0.0.1",6379);
		//获得核心对象jedis
		Jedis jedis= null;
		
		try {
			jedis=jedisPool.getResource();
			jedis.set("name", "demo2");
			String value=jedis.get("name");		
			System.out.println(value);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(jedis!=null){
				jedis.close();
			}
			if(jedisPool!=null){
				jedisPool.close();
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
