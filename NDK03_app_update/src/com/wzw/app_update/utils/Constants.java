package com.wzw.app_update.utils;



import java.io.File;

import android.os.Environment;

public class Constants {

    public static final String PATCH_FILE = "apk.patch";
    //http://127.0.0.1:8080/NDK03_appudate_server/apk.patch
    public static final String URL_PATCH_DOWNLOAD = "http://127.0.0.1:8080/NDK03_appudate_server/apk.patch";

    public static final String PACKAGE_NAME = "com.wzw.app_update";

    public static final String SD_CARD = Environment.getExternalStorageDirectory() + File.separator;

    //新版本apk的目录
    public static final String NEW_APK_PATH = SD_CARD +"NDK"+ File.separator + "apk_new.apk";


    public static final String PATCH_FILE_PATH = SD_CARD + "NDK" + File.separator + PATCH_FILE;

}
