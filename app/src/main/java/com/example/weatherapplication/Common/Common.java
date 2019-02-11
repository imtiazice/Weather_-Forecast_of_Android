package com.example.weatherapplication.Common;

import android.location.Location;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static final String  APP_ID = "cd00ba668b03ab4dbda95f42bbf82f8f";
    public static Location current_location =  null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {

        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String formatted = sdf.format(date);
        return formatted;
    }
}
