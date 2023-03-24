package com.victor.simpleweather.Tasks;

import android.os.AsyncTask;

import com.victor.simpleweather.JSONClasses.JSONFetcher;
import com.victor.simpleweather.JSONClasses.JSONParser;
import com.victor.simpleweather.Models.MyLocation;


public class MyLocationTask extends AsyncTask<String, Void, MyLocation> {
    private MyLocationTaskListener mListener;

    public MyLocationTask(MyLocationTaskListener pListener) {
        this.mListener = pListener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        mListener.onMyLocationTaskPreExecute();
    }

    @Override
    protected MyLocation doInBackground(String... strings) {
        MyLocation myLocation = null;

        String jsonStr = JSONFetcher.fetchData(strings[0]);

        if (jsonStr != null) {
            myLocation = JSONParser.getLocation(jsonStr);
        }
        return myLocation;
    }

    @Override
    protected void onPostExecute(MyLocation myLocation) {
        super.onPostExecute(myLocation);
        mListener.onMyLocationTaskPostExecute(myLocation);
    }

}

