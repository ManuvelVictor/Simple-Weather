package com.victor.simpleweather.Models;

public class MyLocation {
    private static double longitude, latitude;

    public static double getLongitude() {
        return longitude;
    }

    public static void setLongitude(double longitude) {
        MyLocation.longitude = longitude;
    }

    public static double getLatitude() {
        return latitude;
    }

    public static void setLatitude(double latitude) {
        MyLocation.latitude = latitude;
    }
}