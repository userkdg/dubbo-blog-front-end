package com.isunday.blog.rpc.api;


import com.isunday.blog.model.UpmsRole;
import com.isunday.blog.model.UpmsUser;

import java.util.List;

/**
 * 
 */
public interface IRoleService {

    /**
     * 依用户id获取角色
     * @param userId
     * @return
     */
    public List<UpmsRole> findRolesBy(int userId);
}
