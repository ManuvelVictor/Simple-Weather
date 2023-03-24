package com.victor.simpleweather.Tasks;

import android.os.AsyncTask;
import com.victor.simpleweather.JSONClasses.JSONFetcher;
import com.victor.simpleweather.JSONClasses.JSONParser;
import com.victor.simpleweather.Models.FiveDays;


public class MyWeatherTask extends AsyncTask<String, Void, FiveDays> {
    private MyWeatherTaskListener mListener;

    public MyWeatherTask(MyWeatherTaskListener pListener) {
        this.mListener = pListener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mListener.onMyWeatherTaskPreExecute();
    }

    @Override
    protected FiveDays doInBackground(String... strings) {
        FiveDays fiveDays = null;

        //Fetch Weather
        String jsonStr = JSONFetcher.fetchData(strings[0]);

        //Parsing Weather
        if (jsonStr != null) {
            fiveDays = JSONParser.getMyWeather(jsonStr);
        }

        return fiveDays;
    }

    @Override
    protected void onPostExecute(FiveDays fiveDays) {
        super.onPostExecute(fiveDays);
        mListener.onMyWeatherTaskPostExecute(fiveDays);
    }
}

