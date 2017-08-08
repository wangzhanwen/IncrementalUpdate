package com.wzw.app_update.utils;

public class BsPatch {
    static{
        System.out.println("bspatch");
    }

    /**
     *  合并
     * @param oldFile
     * @param newFile
     * @param patchFile
     */
    public native static int patch(String oldFile, String newFile, String patchFile);

}
