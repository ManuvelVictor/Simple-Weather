package com.victor.simpleweather.Models;

public class OneDay {
    public ThreeHours[] getHours() {
        return hours;
    }

    public void setHours(ThreeHours[] hours) {
        this.hours = hours;
    }

    public ThreeHours[] hours;
}