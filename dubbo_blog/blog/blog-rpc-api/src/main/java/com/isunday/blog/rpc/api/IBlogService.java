package com.isunday.blog.rpc.api;


import com.isunday.blog.model.CmsArticle;

import java.util.List;

/**
 *
 * @Description: blog的service接口
 */
public interface IBlogService {
    /**
     * 写文章blog
     * @param blog
     * @return
     */
    public boolean createBlog(CmsArticle blog);

    boolean updateBlog(CmsArticle blog);

    boolean deleteBlog(Integer blogId);

    List<CmsArticle> getBlogList(Integer userId,int start, int end );

    /**
     * 按照页数类
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<CmsArticle> getBlogList2(int userId, int offset, int limit);
}

