package com.engashraf.mytoastlib;


import android.content.Context;
import android.widget.Toast;

public class SimpleToast {

    private static Toast toast;

    public static void showForLongTime(Context context , String msg) {

        if (toast != null) toast.cancel();

        toast = Toast.makeText(context , msg , Toast.LENGTH_LONG);
        toast.show();

    }

    public static void showForShortTime(Context context , String msg) {

        if (toast != null) toast.cancel();

        toast = Toast.makeText(context , msg , Toast.LENGTH_SHORT);
        toast.show();

    }

    public static void cancel() {

        if (toast != null) toast.cancel();

    }
}
