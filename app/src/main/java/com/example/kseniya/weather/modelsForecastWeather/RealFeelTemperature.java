
package com.example.kseniya.weather.modelsForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RealFeelTemperature {

    @SerializedName("Minimum")
    @Expose
    private Minimum_ minimum;
    @SerializedName("Maximum")
    @Expose
    private Maximum_ maximum;

    public Minimum_ getMinimum() {
        return minimum;
    }

    public void setMinimum(Minimum_ minimum) {
        this.minimum = minimum;
    }

    public Maximum_ getMaximum() {
        return maximum;
    }

    public void setMaximum(Maximum_ maximum) {
        this.maximum = maximum;
    }

}
