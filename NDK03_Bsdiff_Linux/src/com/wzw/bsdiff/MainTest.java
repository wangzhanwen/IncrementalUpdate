package com.wzw.bsdiff;
import com.wzw.bsdiff.ConstantsValue;
import com.wzw.bsdiff.DiffUtils;

public class MainTest {

    public static void main(String[] args) {
        long diffStart = System.currentTimeMillis();

        System.out.println("开始生成差分包，请等待...");

        int genDiff = DiffUtils.diff(ConstantsValue.OLD_APK_PATH, ConstantsValue.NEW_APK_PATH, ConstantsValue.PATCH_PATH);

        long diffEnd = System.currentTimeMillis();

        System.out.println("生成差分包成功：" + ConstantsValue.PATCH_PATH + "，耗时："
                + (diffEnd - diffStart) / 1000 + "秒, result=" + genDiff);

        System.out.println("==========================================================\n\n");


        long start = System.currentTimeMillis();

        System.out.println("开始合成新包，请等待...");

        start = System.currentTimeMillis();

        int patchResult = PatchUtils.patch(ConstantsValue.OLD_APK_PATH, ConstantsValue.PATCH_NEWAPK_PATH, ConstantsValue.PATCH_PATH);

        long end = System.currentTimeMillis();

        System.out.println("合成新包成功：" + ConstantsValue.PATCH_NEWAPK_PATH + "，耗时：" + (end - start)
                / 1000 + "秒，patchResult=" + patchResult);



    }

}
