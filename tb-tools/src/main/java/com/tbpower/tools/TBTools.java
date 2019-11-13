package com.tbpower.tools;

import android.app.Application;
import android.content.Context;

import com.tbpower.tools.apk.ApkTool;
import com.tbpower.tools.app.AppTool;
import com.tbpower.tools.app.InputMethodTool;
import com.tbpower.tools.app.IntentTool;
import com.tbpower.tools.app.ProcessTool;
import com.tbpower.tools.app.SnackbarTool;
import com.tbpower.tools.app.ToastTool;
import com.tbpower.tools.constants.ConstantsTool;
import com.tbpower.tools.convert.ConvertTool;
import com.tbpower.tools.device.DeviceTool;
import com.tbpower.tools.device.NetworkTool;
import com.tbpower.tools.image.BitmapTool;
import com.tbpower.tools.io.CloseTool;
import com.tbpower.tools.io.ExternalStorageTool;
import com.tbpower.tools.io.FileTool;
import com.tbpower.tools.io.SPTool;
import com.tbpower.tools.log.LogTool;
import com.tbpower.tools.regex.RegexTool;
import com.tbpower.tools.secure.SecureAESTool;
import com.tbpower.tools.secure.SecureBase64Tool;
import com.tbpower.tools.secure.SecureDES3Tool;
import com.tbpower.tools.secure.SecureDESTool;
import com.tbpower.tools.secure.SecureHexTool;
import com.tbpower.tools.secure.SecureMD5Tool;
import com.tbpower.tools.secure.SecureRSATool;
import com.tbpower.tools.secure.SecureTool;
import com.tbpower.tools.shell.ShellTool;
import com.tbpower.tools.string.StringTool;
import com.tbpower.tools.time.TimeTool;

import java.lang.reflect.Method;

/**
 * Created by Tb  .
 */

public class TBTools {

    private static boolean mOpenLog;
    private static Application mApp;
    private static ApkTool mApk;
    private static StringTool mString;
    private static RegexTool mRegex;
    private static LogTool mLog;
    private static SecureTool mSecure;
    private static SecureAESTool mAES;
    private static SecureBase64Tool mBase64;
    private static SecureDES3Tool mDES3;
    private static SecureDESTool mDES;
    private static SecureHexTool mHex;
    private static SecureMD5Tool mMD5;
    private static SecureRSATool mRSA;
    private static ExternalStorageTool mExternalStorage;
    private static AppTool mAppTool;
    private static DeviceTool mDevice;
    private static BitmapTool mBitmap;
    private static InputMethodTool mInputMethodTool;
    private static ToastTool mToast;
    private static SnackbarTool mSnackbar;
    private static NetworkTool mNetwork;
    private static SPTool mSP;
    private static CloseTool mClose;
    private static ConstantsTool mConstants;
    private static ConvertTool mConvert;
    private static FileTool mFile;
    private static IntentTool mIntent;
    private static ProcessTool mProcess;
    private static ShellTool mShell;
    private static TimeTool mTime;

    public TBTools() {
        throw new UnsupportedOperationException("not support instantiate TBTools");
    }

    public static void init(Application app) {
        if (mApp == null) {
            mApp = app;
        }
    }

    /**
     * if open the TBTools log msg.
     * @param isOpenLog
     */
    public static void openToolsLog(boolean isOpenLog) {
        mOpenLog = isOpenLog;
    }

    public static boolean isToolsLogging() {
        return mOpenLog;
    }

    public static Application app() {
        if (mApp == null) {
            try {
                try {
                    // 在IDE进行布局预览时使用
                    Class<?> renderActionClass = Class.forName("com.android.layoutlib.bridge.impl.RenderAction");
                    Method method = renderActionClass.getDeclaredMethod("getCurrentContext");
                    Context context = (Context) method.invoke(null);
                    mApp = new MockApplication(context);
                } catch (Throwable ignored) {
                    throw new RuntimeException("please invoke x.Ext.init(app) on Application#onCreate()"
                            + " and register your Application in manifest.");
                }
            } catch (Throwable ignored) {
                throw new RuntimeException("please invoke TBTools.init(app) on Application#onCreate()"
                        + " and register your Application in manifest.");
            }
        }
        return mApp;
    }

    public static ApkTool apk() {
        if (mApk == null) {
            mApk = ApkTool.instance();
        }
        return mApk;
    }

    public static StringTool string() {
        if (mString == null) {
            mString = StringTool.instance();
        }
        return mString;
    }

    public static RegexTool regex() {
        if (mRegex == null) {
            mRegex = RegexTool.instance();
        }
        return mRegex;
    }

    public static LogTool log() {
        if (mLog == null) {
            mLog = LogTool.instance();
        }
        return mLog;
    }

    public static SecureTool secure() {
        if (mSecure == null) {
            mSecure = SecureTool.instance();
        }
        return mSecure;
    }

    public static SecureAESTool secureAES() {
        if (mAES == null) {
            mAES = SecureAESTool.instance();
        }
        return mAES;
    }

    public static SecureBase64Tool secureBase64() {
        if (mBase64 == null) {
            mBase64 = SecureBase64Tool.instance();
        }
        return mBase64;
    }

    public static SecureDES3Tool secureDES3() {
        if (mDES3 == null) {
            mDES3 = SecureDES3Tool.instance();
        }
        return mDES3;
    }

    public static SecureDESTool secureDES() {
        if (mDES == null) {
            mDES = SecureDESTool.instance();
        }
        return mDES;
    }

    public static SecureHexTool secureHex() {
        if (mHex == null) {
            mHex = SecureHexTool.instance();
        }
        return mHex;
    }

    public static SecureMD5Tool secureMD5() {
        if (mMD5 == null) {
            mMD5 = SecureMD5Tool.instance();
        }
        return mMD5;
    }

    public static SecureRSATool secureRSA() {
        if (mRSA == null) {
            mRSA = SecureRSATool.instance();
        }
        return mRSA;
    }

    public static ExternalStorageTool externalStorage() {
        if (mExternalStorage == null) {
            mExternalStorage = ExternalStorageTool.instance();
        }
        return mExternalStorage;
    }

    public static AppTool appTool() {
        if (mAppTool == null) {
            mAppTool = AppTool.instance();
        }
        return mAppTool;
    }

    public static DeviceTool device() {
        if (mDevice == null) {
            mDevice = DeviceTool.instance();
        }
        return mDevice;
    }

    public static BitmapTool bitmap() {
        if (mBitmap == null) {
            mBitmap = BitmapTool.instance();
        }
        return mBitmap;
    }

    public static InputMethodTool inputMethod() {
        if (mInputMethodTool == null) {
            mInputMethodTool = InputMethodTool.instance();
        }
        return mInputMethodTool;
    }

    public static ToastTool toast() {
        if (mToast == null) {
            mToast = ToastTool.instance();
        }
        return mToast;
    }

    public static SnackbarTool snackbar() {
        if (mSnackbar == null) {
            mSnackbar = SnackbarTool.instance();
        }
        return mSnackbar;
    }

    public static NetworkTool network() {
        if (mNetwork == null) {
            mNetwork = NetworkTool.instance();
        }
        return mNetwork;
    }

    public static SPTool sp() {
        if (mSP == null) {
            mSP = SPTool.instance();
        }
        return mSP;
    }

    public static CloseTool close() {
        if (mClose == null) {
            mClose = CloseTool.instance();
        }
        return mClose;
    }

    public static ConstantsTool constants() {
        if (mConstants == null) {
            mConstants = ConstantsTool.instance();
        }
        return mConstants;
    }

    public static ConvertTool convert() {
        if (mConvert == null) {
            mConvert = ConvertTool.instance();
        }
        return mConvert;
    }

    public static FileTool file() {
        if (mFile == null) {
            mFile = FileTool.instance();
        }
        return mFile;
    }

    public static IntentTool intent() {
        if (mIntent == null) {
            mIntent = IntentTool.instance();
        }
        return mIntent;
    }

    public static ProcessTool process() {
        if (mProcess == null) {
            mProcess = ProcessTool.instance();
        }
        return mProcess;
    }

    public static ShellTool shell() {
        if (mShell == null) {
            mShell = ShellTool.instance();
        }
        return mShell;
    }

    public static TimeTool time() {
        if (mTime == null) {
            mTime = TimeTool.instance();
        }
        return mTime;
    }

    private static class MockApplication extends Application {
        public MockApplication(Context baseContext) {
            this.attachBaseContext(baseContext);
        }
    }
}
