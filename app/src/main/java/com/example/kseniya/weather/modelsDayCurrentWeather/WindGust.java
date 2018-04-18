
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindGust {

    @SerializedName("Speed")
    @Expose
    private Speed_ speed;

    public Speed_ getSpeed() {
        return speed;
    }

    public void setSpeed(Speed_ speed) {
        this.speed = speed;
    }

}
