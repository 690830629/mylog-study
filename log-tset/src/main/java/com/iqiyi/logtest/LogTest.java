/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.iqiyi.logtest;


import org.apache.log4j.Logger;

public class LogTest {
    public static void main(String[] args) {
        com.iqiyi.log4j.HelloWord.main(args);
        com.iqiyi.log4j2.HelloWord.main(args);
        com.iqiyi.logback.HelloWord.main(args);
        Logger logger = Logger.getLogger(LogTest.class);
        logger.info("1");
    }
}
