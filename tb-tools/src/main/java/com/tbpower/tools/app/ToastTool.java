package com.tbpower.tools.app;

import android.content.Context;
import android.widget.Toast;

import com.tbpower.tools.TBTools;

/**
 * Created by Tb  .
 */

public final class ToastTool {

    private static final Object lock = new Object();
    private static volatile ToastTool instance;

    private ToastTool() {
    }

    public static ToastTool instance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ToastTool();
                }
            }
        }
        return instance;
    }

    public void showToast(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
    }

    public void showToast(int stringID) {
        Context appContext = TBTools.app().getApplicationContext();
        showToast(appContext, appContext.getString(stringID));
    }

    public void showToastLong(Context c, String msg) {
        Toast.makeText(c, msg, Toast.LENGTH_LONG).show();
    }

    public void showToastLong(int stringID) {
        Context appContext = TBTools.app().getApplicationContext();
        showToastLong(appContext, appContext.getString(stringID));
    }
}
