package com.isunday.blog.rpc.service.impl;


import com.isunday.blog.common.ajaxResult.ResultCode;
import com.isunday.blog.common.utils.DateUtils;
import com.isunday.blog.mapper.UpmsUserMapper;
import com.isunday.blog.model.UpmsUser;
import com.isunday.blog.model.UpmsUserExample;
import com.isunday.blog.rpc.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;


/**
 * Service层 的标准是要控制好返回的类型
 * 获取数据 get--->List<T> / List<Map> / Map / String ..等
 * 是插入数据 insert/delete/update --->要用boolean类型、不允许返回int 等可读性很差的类型
 *
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UpmsUserMapper upmsUserMapper;

    public List<UpmsUser> findUsersBy(String username) {
        UpmsUserExample example = new UpmsUserExample();
        UpmsUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);

        return upmsUserMapper.selectByExample(example);
    }

    @Override
    public boolean save(UpmsUser user) {
        String salt = UUID.randomUUID().toString().replace("-","");
        user.setSalt(user.getPassword() + salt);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd.hhmmss");
        Long l = Long.valueOf(dateFormat.format(new Date()));
        user.setCtime(l);
        int insert = upmsUserMapper.insert(user);
        if (insert <= 0)
            return false;
        return true;
    }

}
