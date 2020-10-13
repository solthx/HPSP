package com.shock.hpsp.web.base;

/**
 * 封装API的错误码
 *
 * @author czf
 * @Date 2020/10/12 02:29 下午
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
