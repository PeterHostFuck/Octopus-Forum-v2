package com.zhangyu.coderman.myenums;

public enum IntegralType {
    SIGN_IN(10,"签到");
    private long val;
    private String message;

    IntegralType(int val, String message) {
        this.val = val;
        this.message = message;
    }

    public long getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
