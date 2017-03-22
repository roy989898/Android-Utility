package com.imageutility.Utility;

/**
 * Created by Roy.Leung on 22/3/17.
 */

public class Utility {

    public static String formatTheDate(int day, int month, int year) {
//        return String.format("%02d/%02d/%04d", day, month, year);
        return String.format("%04d-%02d-%02d", year, month, day);

    }



}
