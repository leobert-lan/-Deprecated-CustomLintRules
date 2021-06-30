package com.sceneraymedical.sceneray.utils;

import android.util.Log;


/**
 * 用于记录日志的日志类
 * 参照 FW/FileLog
 */
public abstract class FileLog {



    //endregion

    //region 日志调用方法

    public static synchronized int e(String tag, String msg, Throwable tr) {
        //writeToFile(Log.ERROR, tag, msg, tr);

        return Log.e(tag, msg, tr);
    }

    public static synchronized int e(String tag, String msg) {
        //writeToFile(Log.ERROR, tag, msg);

        return Log.e(tag, msg);
    }

    public static synchronized int i(String tag, String msg) {
        //writeToFile(Log.INFO, tag, msg);

        return Log.i(tag, msg);
    }

    public static synchronized int i(String tag, String msg, Throwable tr) {
        //writeToFile(Log.INFO, tag, msg, tr);

        return Log.i(tag, msg, tr);
    }

    public static synchronized int d(String tag, String msg) {
        //writeToFile(Log.DEBUG, tag, msg);

        return Log.d(tag, msg);
    }

    public static synchronized int d(String tag, String msg, Throwable tr) {
        //writeToFile(Log.DEBUG, tag, msg, tr);

        return Log.d(tag, msg, tr);
    }

    public static synchronized int w(String tag, String msg) {
        //writeToFile(Log.WARN, tag, msg);

        return Log.w(tag, msg);
    }

    public static synchronized int w(String tag, String msg, Throwable tr) {
        //writeToFile(Log.WARN, tag, msg, tr);

        return Log.w(tag, msg, tr);
    }

    public static synchronized int w(String tag, Throwable tr) {
        //writeToFile(Log.WARN, tag, "", tr);

        return Log.w(tag, tr);
    }

    //endregion

    //region 私有方法

}
