package com.apache.agent.repo;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

public class ChannelRepo {

	static Cache<String, String> cache = CacheBuilder.newBuilder().maximumSize(100)
			.expireAfterAccess(5, TimeUnit.SECONDS).build();

}
