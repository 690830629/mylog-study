/*
 * Copyright (C) 2020 iQIYI.COM - All Rights Reserved.
 * This file is part of Pizza project. Unauthorized copy
 * of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential.
 *
 * Author(s): INQ Team <iig_ipd_inq@qiyi.com>
 */
package com.iqiyi;

import java.io.IOException;
import java.io.InputStream;

public class TestClassLoader {
    public static void main(String[] args) throws Exception {
        ClassLoader myClassLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (null == is) {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    throw new ClassNotFoundException(name);
                }
            }
        };
        Object obj = myClassLoader.loadClass("com.iqiyi.TestClassLoader").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof com.iqiyi.TestClassLoader);
        System.out.println(obj.getClass().getClassLoader());
        System.out.println(new TestClassLoader().getClass().getClassLoader());

    }
}
