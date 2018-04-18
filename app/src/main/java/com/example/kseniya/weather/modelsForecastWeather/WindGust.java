
package com.example.kseniya.weather.modelsForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindGust {

    @SerializedName("Speed")
    @Expose
    private Speed_ speed;
    @SerializedName("Direction")
    @Expose
    private Direction_ direction;

    public Speed_ getSpeed() {
        return speed;
    }

    public void setSpeed(Speed_ speed) {
        this.speed = speed;
    }

    public Direction_ getDirection() {
        return direction;
    }

    public void setDirection(Direction_ direction) {
        this.direction = direction;
    }

}
