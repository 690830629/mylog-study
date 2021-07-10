/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.wanglei.myjul;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JulTest {
    public static void main(String[] args) throws IOException {
        testJUl();

    }

    public static void testJUl() {
        Logger logger = Logger.getLogger("com.wanglei.myjul.JulTest");
        logger.info("hello jul");


        logger.log(Level.INFO, "info msg");

        String name = "张三";

        int age = 18;
        logger.log(Level.INFO, "用户信息:{0},{1}", new Object[]{name, age});
    }

    public static void testLogLevel() {
        // 获取日志记录器对象
        Logger logger = Logger.getLogger("com.wanglei.myjul.JulTest");

        // 日志记录输出
        logger.severe("severe");

        logger.warning("warning");

        logger.info("info"); //jul默认级别是info

        logger.config("config");


    }

    //自定义日志级别
    public static void testLogConfig() throws IOException {
        // 获取日志记录器对象
        Logger logger = Logger.getLogger("com.wanglei.myjul.JulTest");

        // 关闭系统默认配置
        logger.setUseParentHandlers(false);
        // 自定义配置日志级别

        //创建ConsoleHandler

        ConsoleHandler consoleHandler=new ConsoleHandler();

        // 创建简单格式转换对象
        SimpleFormatter simpleFormatter=new SimpleFormatter();

        // 进行关联

        consoleHandler.setFormatter(simpleFormatter);
        logger.addHandler(consoleHandler);

        //配置日志具体级别

        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        //场景FileHandler 文件输出
        FileHandler fileHandler=new FileHandler("/mylog/jul.log");
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);

        // 日志记录输出
        logger.severe("severe");

        logger.warning("warning");

        logger.info("info"); //jul默认级别是info

        logger.config("config");


    }

    // Logger对象父子关系

    public static  void testLoggerParent(){
        Logger logger1=Logger.getLogger("com.wanglei");
        Logger logger2=Logger.getLogger("com");
        logger2.getParent();
        Logger parent = logger1.getParent();

        System.out.println(logger2==parent);

        //所有日志记录器的顶级父元素

    }

    //加载自定义配置文件
    public static void testProperties() throws IOException {
        //读取配置文件 通过类加载器
        InputStream ins = JulTest.class.getClassLoader().getResourceAsStream("logging.properties");
        //创建LogManager
        LogManager logManager = LogManager.getLogManager();

        //通过LogManager加载配置文件
        logManager.readConfiguration(ins);

        //创建日志记录器
        Logger logger = Logger.getLogger("com.wanglei");

        logger.config("1");
    }
}
