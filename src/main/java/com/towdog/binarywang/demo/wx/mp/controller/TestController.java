package com.towdog.binarywang.demo.wx.mp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: luoergou
 * @description: 测试接口
 * @date: 2020-09-11 11:12
 */
@RestController
@RequestMapping(value = "test")
public class TestController {
    private static final Logger LOGGER = LoggerFactory.getLogger("GLMAPPER-TEST-LOG");
    private static final Logger ERROR_LOGGER = LoggerFactory.getLogger("ERROR-APPENDER-TEST-LOG");

    @GetMapping(value = "testDockerDemo")
    public String testDockerDemo() {
        LOGGER.info("GLMAPPER-SERVICE:info");
        ERROR_LOGGER.error("GLMAPPER-SERVICE:error");
        return "hello spring boot";
    }
}
