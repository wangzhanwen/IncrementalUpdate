package com.wzw.bsdiff;

import java.io.File;

import android.os.Environment;

public class ConstantsValue {

    //路径不能包含中文
//    public static final String OLD_APK_PATH = "/Users/wzw/wzwWorkSpace/ecplise_jni_ws/apk/NDK03_app_update_old.apk";
//
//    public static final String NEW_APK_PATH = "/Users/wzw/wzwWorkSpace/ecplise_jni_ws/apk/NDK03_app_update_new.apk";
//
//    public static final String PATCH_PATH = "/Users/wzw/wzwWorkSpace/ecplise_jni_ws/apk/apk.patch";
    // /Users/wzw/apk/newApk.apk
    public static final String OLD_APK_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "NDK" + File.separator + "apk"  + File.separator + "oldApk.apk";

    public static final String NEW_APK_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "NDK"+ File.separator + "apk"  + File.separator + "newApk.apk";

    public static final String PATCH_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separatorChar + "NDK" + File.separator + "apk"  + File.separator + "apk.patch";

}
