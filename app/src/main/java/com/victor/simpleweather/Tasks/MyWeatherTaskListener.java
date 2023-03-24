package com.victor.simpleweather.Tasks;

import com.victor.simpleweather.Models.FiveDays;

public interface MyWeatherTaskListener {
    void onMyWeatherTaskPreExecute();

    void onMyWeatherTaskPostExecute(FiveDays fiveDays);
}
