/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.iqiyi.log4j;

import org.apache.log4j.Logger;

//import org.apache.log4j.helpers.LogLog;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class HelloWord {

    // 获取日志记录器对象 log4j中的logger
    private  static  final Logger logger = Logger.getLogger(HelloWord.class);


//    private static final Logger logger = LoggerFactory.getLogger(HelloWord.class);

    public static void main(String[] args) {
        // 开启log4j内置日志记录
//        LogLog.setInternalDebugging(false);

        logger.info("log4j demo");
        // 1初始化配置信息 默认级别是debug
//        BasicConfigurator.configure();
//        logger.fatal("fatal"); //严重错误 会造成系统崩溃并终止运行
//        logger.info("error"); // 错误信息 不会影响系统运行
//        logger.warn("warn"); // 警告错误 可能会发生问题
//        logger.info("info"); // 运行信息 数据连接 网络连接 IO操作等
//        logger.debug("debug"); //调试信息 一般在开发中使用
//        logger.trace("trace"); // 追踪信息 记录程序所有的流程信息
    }
}
