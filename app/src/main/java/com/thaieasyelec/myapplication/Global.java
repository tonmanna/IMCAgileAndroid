package com.thaieasyelec.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by Woraset KiNG on 27/11/2558.
 */
public class Global extends Application{
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getAppContext();
    }

    public static Context getAppContext(){
        return context;
    }
}
