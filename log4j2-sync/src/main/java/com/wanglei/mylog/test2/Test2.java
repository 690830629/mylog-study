/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.wanglei.mylog.test2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test2 {
    static final Logger LOGGER = LogManager.getLogger(Test2.class);

    public static void main(String[] args) {

//        LOGGER.info("info hello Test2");

        LOGGER.warn("warn hello Test2");

    }
}
