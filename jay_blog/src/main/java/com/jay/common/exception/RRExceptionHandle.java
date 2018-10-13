package com.jay.common.exception;

import com.jay.util.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by xiang.wei on 2018/10/13
 *
 * @author xiang.wei
 */
@RestControllerAdvice
public class RRExceptionHandle {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(RRException.class)
    public Data handleRRException(RRException e) {
        return Data.failure(e.getCode(), e.getMsg());
    }


}
