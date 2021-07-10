/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.iqiyi.log4j2;

//import com.sun.org.slf4j.internal.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWord {

    // log4j2中的logger
//    static final Logger LOGGER = LogManager.getLogger(HelloWord.class);

    static final Logger LOGGER = LoggerFactory.getLogger(HelloWord.class);

    public static void main(String[] args) {
        LOGGER.info("log4j2 demo");
    }
}
