/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.iqiyi.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWord {

    //默认实现了slf4j标准
    public static final Logger logger = LoggerFactory.getLogger(HelloWord.class);


    public static void main(String[] args) {
        logger.info("logback demo");

    }
}
