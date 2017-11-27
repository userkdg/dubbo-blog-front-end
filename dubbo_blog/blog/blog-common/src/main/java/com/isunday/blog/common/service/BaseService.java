package com.isunday.blog.common.service;

import com.isunday.blog.common.mapper.IBaseMapper;

/**
 */
public abstract class BaseService<T> implements IBaseService<T> {
	public abstract IBaseMapper<T> getBaseMapper();

	public int deleteByPrimaryKey(Integer id) {
		return this.getBaseMapper().deleteByPrimaryKey(id);
	}

	public int insert(T record) {
		
		return this.getBaseMapper().insert(record);
	}

	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().insertSelective(record);
	}

	public T selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().updateByPrimaryKey(record);
	}
	
}

