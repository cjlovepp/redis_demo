package com.test;

import org.junit.Test;

import com.redis.RedisClient;

public class redisClientTest {

	@Test
	public void test() {
		RedisClient redisClient = new RedisClient();
		//redisClient.KeyOperate();
		//redisClient.StringOperate();
		//redisClient.ListOperate();
		//redisClient.SetOperate();
		//redisClient.SortedSet();
		redisClient.hashOperate();
		
	}

}
