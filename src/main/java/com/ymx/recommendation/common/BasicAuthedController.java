package com.ymx.recommendation.common;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: recommendation
 * @description: 通过token验证的controller基类
 * @author: victor
 * @create: 2019-12-25 20:19
 **/
public class BasicAuthedController {

    @Autowired
    HttpServletRequest request;

    public Long getCurrentUserId() {
        return (Long) request.getAttribute("userId");
    }
}
