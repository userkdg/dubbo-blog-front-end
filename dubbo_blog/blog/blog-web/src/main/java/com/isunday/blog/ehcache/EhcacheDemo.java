package com.isunday.blog.ehcache;

import com.isunday.blog.mapper.UpmsUserMapper;
import com.isunday.blog.model.UpmsUser;
import com.isunday.blog.model.UpmsUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 
 * @author KDG
 *
 */
@Configuration
@EnableCaching
@CacheConfig(cacheManager="users")
public class EhcacheDemo {
	/**
	 * @cacheable
	 * @cacheEvict
	 * @cachePut
	 */
	
	@Autowired
	private UpmsUserMapper upmsUserMapper;

	/**
	 * @Cacheable({"a","b"})
	 * @return
	 */
	@Cacheable(value="users")
	public List<UpmsUser>  getUserById(){
		UpmsUserExample example = new UpmsUserExample();
		UpmsUserExample.Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(1);

		List<UpmsUser> upmsUsers = upmsUserMapper.selectByExample(example);
		return upmsUsers;

	}
	@Cacheable(value="users",condition="#user.getId() <= 2")
	public List<UpmsUser> getUserById2(){
		int userId = 1; 
		return getUserById();
	}
	@CachePut(value="users",key="#user.getId()")
	public List<UpmsUser> getUserById3(){
		return getUserById();
	}
	
	@CacheEvict(value="users",allEntries=true)
	public List<UpmsUser> removeUserById3(){
		return  getUserById();
	}
	
}