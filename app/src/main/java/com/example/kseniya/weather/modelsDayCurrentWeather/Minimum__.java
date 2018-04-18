
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Minimum__ {

    @SerializedName("Metric")
    @Expose
    private Metric__________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__________________________ imperial;

    public Metric__________________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric__________________________ metric) {
        this.metric = metric;
    }

    public Imperial__________________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial__________________________ imperial) {
        this.imperial = imperial;
    }

}
