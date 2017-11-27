package com.isunday.blog.common.base;

import com.sun.xml.internal.rngom.parse.host.Base;

/**
 * 统一返回结果类
 */
public class BaseResult {

    /**
     * 默认为成功
     */
    private static final String SUCCESS = "1";

    // 状态码：1成功，其他为失败
    public String code = SUCCESS;

    // 成功为success，其他为失败原因
    public Object message;

    // 数据结果集
    public Object data;

    private BaseResult(){

    }

    public BaseResult(Object message) {
        this.message = message;
    }

    public BaseResult(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code='" + code + '\'' +
                ", message=" + message +
                ", data=" + data +
                '}';
    }
}
