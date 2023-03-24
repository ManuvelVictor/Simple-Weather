package com.victor.simpleweather.Tasks;

import com.victor.simpleweather.Models.MyLocation;

public interface MyLocationTaskListener {
    void onMyLocationTaskPreExecute();

    void onMyLocationTaskPostExecute(MyLocation myLocation);
}
