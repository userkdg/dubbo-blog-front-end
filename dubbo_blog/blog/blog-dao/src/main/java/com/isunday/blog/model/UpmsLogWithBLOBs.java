package com.isunday.blog.model;

public class UpmsLogWithBLOBs extends UpmsLog implements java.io.Serializable {
    private String parameter;

    private String result;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}