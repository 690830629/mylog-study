/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.wanglei.mylog.test1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {
    static final Logger LOGGER = LogManager.getLogger(Test1.class);

    public static void main(String[] args) {

        LOGGER.warn("warn hello Test1");
        LOGGER.info("info hello Test1");
    }
}
