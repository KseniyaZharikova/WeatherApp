
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past24HourRange {

    @SerializedName("Minimum")
    @Expose
    private Minimum__ minimum;
    @SerializedName("Maximum")
    @Expose
    private Maximum__ maximum;

    public Minimum__ getMinimum() {
        return minimum;
    }

    public void setMinimum(Minimum__ minimum) {
        this.minimum = minimum;
    }

    public Maximum__ getMaximum() {
        return maximum;
    }

    public void setMaximum(Maximum__ maximum) {
        this.maximum = maximum;
    }

}
