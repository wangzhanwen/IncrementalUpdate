package com.wzw.app_update;

import java.io.File;

import com.wzw.app_update.utils.ApkUtils;
import com.wzw.app_update.utils.BsPatch;
import com.wzw.app_update.utils.Constants;
import com.wzw.app_update.utils.DownloadUtils;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ApkUpdateTask().execute();

    }

   class ApkUpdateTask extends AsyncTask<Void, Void, Boolean>{

    @Override
    protected Boolean doInBackground(Void... params) {
        try {
            //1.下载差分包
            Log.d("patch", "开始下载");
            //File patchFile = DownloadUtils.download(Constants.URL_PATCH_DOWNLOAD);
            //获取当前应用的apk文件/data/data/app
            String oldFile = ApkUtils.getSourceApkPath(MainActivity.this, getPackageName());
            //2.合并得到最新版本是apk文件
            String newFile = Constants.NEW_APK_PATH;
            //String patchFileStr = patchFile.getAbsolutePath();
            String patchFileStr = Constants.PATCH_FILE_PATH;
            BsPatch.patch(oldFile, newFile, patchFileStr);

            Log.d("patch", "oldfile:"+oldFile);
            Log.d("patch", "newfile:"+newFile);
            Log.d("patch", "patchfile:"+patchFileStr);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    protected void onPostExecute(Boolean result) {
        super.onPostExecute(result);
        //3.安装
        if(result){
            Toast.makeText(MainActivity.this, "您正在进行无流量更新", Toast.LENGTH_SHORT).show();
            ApkUtils.installApk(MainActivity.this, Constants.NEW_APK_PATH);
         }
     }

 }


}
