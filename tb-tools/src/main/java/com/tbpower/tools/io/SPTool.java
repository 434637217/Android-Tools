package com.tbpower.tools.io;

import android.content.Context;
import android.content.SharedPreferences;

import com.tbpower.tools.TBTools;

/**
 * SharedPreferences工具类
 *
 * Created by Tb  .
 */

public final class SPTool {

    private String SP = "AndroidTools";
    private static final Object lock = new Object();
    private static volatile SPTool instance;

    public static SPTool instance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SPTool();
                }
            }
        }
        return instance;
    }

    /**
     *  default SharedPreferences file name is the class name of {@link TBTools}, if you want to
     *  define your own file name, please use this method at your Application class.
     *
     *  <pre>
     *   TBTools.sp().name("ur_sp_name");
     *  </pre>
     *
     * @param name
     * @return
     */
    public SPTool name(String name) {
        SP = name;
        return this;
    }

    public boolean getShareBoolean(String name) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        return share.getBoolean(name, false);
    }

    public void saveShareBoolean(String name, boolean flag) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.putBoolean(name, flag);
        editor.commit();
    }

    public int getShareInt(String name) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        return share.getInt(name, 0);
    }

    /**
     * @param name
     * @param value 默认值
     * @return
     */
    public int getShareInt(String name, int value) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        return share.getInt(name, value);
    }

    public void saveShareInt(String name, int value) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.putInt(name, value);
        editor.commit();
    }

    public String getShareString(String name) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        return share.getString(name, "");
    }

    public void saveShareString(String name, String value) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.putString(name, value);
        editor.commit();
    }

    private long getShareLong(String name) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        return share.getLong(name, 0L);
    }

    private void saveShareLong(String name, Long value) {
        SharedPreferences share = TBTools.app().getSharedPreferences(SP, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = share.edit();
        editor.putLong(name, value);
        editor.commit();
    }
}
