
package com.example.kseniya.weather.modelsForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("Speed")
    @Expose
    private Speed speed;
    @SerializedName("Direction")
    @Expose
    private Direction direction;

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

}
