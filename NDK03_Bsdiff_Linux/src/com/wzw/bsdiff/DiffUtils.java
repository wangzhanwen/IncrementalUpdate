package com.wzw.bsdiff;

import java.io.File;

public class DiffUtils {
    static {
            String soPath =  System.getProperty("user.dir") + File.separator+ "libs" + File.separator + "libBsDiff.so";
            System.load(soPath);
    }


    /**
     * native方法 比较路径为oldPath的apk与newPath的apk之间差异，并生成patch包，存储于patchPath
     *
     * 返回：0，说明操作成功
     *
     * @param oldApkPath 示例:/sdcard/old.apk
     * @param newApkPath 示例:/sdcard/new.apk
     * @param patchPath  示例:/sdcard/xx.patch
     * @return
     */
    public static native int diff(String oldApkPath, String newApkPath, String patchPath);
}
