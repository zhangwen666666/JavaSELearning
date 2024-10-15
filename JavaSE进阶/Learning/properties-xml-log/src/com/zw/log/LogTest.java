package com.zw.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    // 1.创建一个Logger日志对象, 并起名logBack
    public static final Logger LOGGER = LoggerFactory.getLogger("logBack");

    public static void div(int a, int b) {
        LOGGER.debug("参数a：" + a);
        LOGGER.debug("参数b：" + b);
        int c = a / b;
        LOGGER.info("结果是：" + c);
    }

    public static void main(String[] args) {
        try {
            LOGGER.info("div方法开始执行");
            div(10, 0);
            LOGGER.info("div方法执行成功");
        } catch (Exception e) {
            e.fillInStackTrace();
            LOGGER.error("div方法出现异常" + e.fillInStackTrace());
        }
    }
}
