
package com.example.kseniya.weather.modelsForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind_ {

    @SerializedName("Speed")
    @Expose
    private Speed__ speed;
    @SerializedName("Direction")
    @Expose
    private Direction__ direction;

    public Speed__ getSpeed() {
        return speed;
    }

    public void setSpeed(Speed__ speed) {
        this.speed = speed;
    }

    public Direction__ getDirection() {
        return direction;
    }

    public void setDirection(Direction__ direction) {
        this.direction = direction;
    }

}
