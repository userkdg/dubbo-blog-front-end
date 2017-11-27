package com.isunday.blog.common.ajaxResult;

import com.isunday.blog.common.base.BaseResult;

/**

 */
public class AjaxResult extends BaseResult{
    public AjaxResult(ResultCode resultCode, Object data) {
        super(resultCode.getCode(), resultCode.getMsg(), data);
    }
    public AjaxResult(Object message){
        super(message);
    }
}

