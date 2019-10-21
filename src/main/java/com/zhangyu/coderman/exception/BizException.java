package com.zhangyu.coderman.exception;

import com.zhangyu.coderman.myenums.CustomizeErrorCode;

public class BizException extends  RuntimeException{
    @Override
    public String getMessage() {
        return super.getMessage();
    }
    public BizException(CustomizeErrorCode customizeErrorCode) {
        super(customizeErrorCode.getMessage());
    }
}
