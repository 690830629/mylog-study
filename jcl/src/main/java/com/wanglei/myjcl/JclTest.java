/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.wanglei.myjcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JclTest {
    public static void main(String[] args) {

        // 提供了log4j log就是log4j的实现类 提供了jul log就是 jul的实现类
        // 日志记录器
        // 面向接口的设计理念 统一api
        Log log = LogFactory.getLog(JclTest.class);

        log.info("hello jcl");

    }
}
