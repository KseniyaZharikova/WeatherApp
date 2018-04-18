
package com.example.kseniya.weather.modelsForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindGust_ {

    @SerializedName("Speed")
    @Expose
    private Speed___ speed;
    @SerializedName("Direction")
    @Expose
    private Direction___ direction;

    public Speed___ getSpeed() {
        return speed;
    }

    public void setSpeed(Speed___ speed) {
        this.speed = speed;
    }

    public Direction___ getDirection() {
        return direction;
    }

    public void setDirection(Direction___ direction) {
        this.direction = direction;
    }

}
