/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.iqiyi.logtest;


public class LogTest {
    public static void main(String[] args) {
        com.wanglei.log4j.HelloWord.main(args);
        com.wanglei.log4j2.HelloWord.main(args);
        com.wanglei.logback.HelloWord.main(args);
    }
}
