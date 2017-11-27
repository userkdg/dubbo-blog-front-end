package com.isunday.blog.rpc.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.isunday.blog.mapper.CmsArticleMapper;
import com.isunday.blog.model.CmsArticle;
import com.isunday.blog.model.CmsArticleExample;
import com.isunday.blog.rpc.api.IBlogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**/
/**
 *
 * 
 * @Description:
 */
@Service
public class BlogServiceImpl implements IBlogService {

    private static final Logger _log = LoggerFactory.getLogger(BlogServiceImpl.class);

    @Autowired
    private CmsArticleMapper articleMapper;
    /**
     *
     * @param blog
     * @return
     */
    public boolean createBlog(CmsArticle blog) {
        articleMapper.insert(blog);
        return true;
    }

    @Override
    public boolean updateBlog(CmsArticle blog) {
        articleMapper.updateByPrimaryKey(blog);
        return true;
    }

    @Override
    public boolean deleteBlog(Integer blogId) {
        articleMapper.deleteByPrimaryKey(blogId);
        return true;
    }

    /**
     *
     * @param userId
     * @param start
     * @param end
     * @return
     */
    @Override
    public List<CmsArticle> getBlogList(Integer userId,int start, int end ) {
        CmsArticleExample example = new CmsArticleExample();
        CmsArticleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        Page<Object> page = null;
        if(start != -1 & end != -1)
            page = PageHelper.startPage(start, end);
        List<CmsArticle> cmsArticles = articleMapper.selectByExample(example);
        long total = page.getTotal();
        _log.info("...{}列表集合,总数:{}",cmsArticles,total);
        return cmsArticles;
    }

    @Override
    public List<CmsArticle> getBlogList2(int userId, int offset, int limit) {
        CmsArticleExample example = new CmsArticleExample();
        CmsArticleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        Page<Object> page = PageHelper.offsetPage(offset,limit);
        List<CmsArticle> cmsArticles = articleMapper.selectByExample(example);
        long total = page.getTotal();
        _log.info("...{}列表集合,总数:{}",cmsArticles,total);
        return cmsArticles;
    }
}

