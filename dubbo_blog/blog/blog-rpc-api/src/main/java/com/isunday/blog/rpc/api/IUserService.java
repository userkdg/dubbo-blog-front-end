package com.isunday.blog.rpc.api;


import com.isunday.blog.model.UpmsUser;

import java.util.List;

/**
 * 
 */
public interface IUserService {

    /**
     * 依用户名称取用户对象
     * @param username
     * @return
     */
    public List<UpmsUser> findUsersBy(String username);

    /**
     *
     * @param user
     */
     boolean save(UpmsUser user);
}
