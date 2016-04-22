package com.example.tradeboox.notification;

import android.app.Activity;
import android.content.Context;

public class FetchPhoneNumber extends Activity
{
    TelephonyManager tMgr = (TelephonyManager)mAppContext.getSystemService(Context.TELEPHONY_SERVICE);
    protected String mPhoneNumber = tMgr.getLine1Number();
}
