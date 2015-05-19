package com.tavant.subhash.nas;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by subhash.pandey on 19-05-2015.
 */
public class AppPreferenceManager {

    private static String EID_PREF = "eid";
    private static String LAST_TAP_TIME = "last_tap_time";

    public static void setEID(String s, Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(EID_PREF, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(EID_PREF,s).commit();
    }

    public static String getEID(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(EID_PREF, Context.MODE_PRIVATE);
        String string = sharedPreferences.getString(EID_PREF, "null");
        return string;
    }

}
