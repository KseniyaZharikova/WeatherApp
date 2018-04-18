
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Minimum {

    @SerializedName("Metric")
    @Expose
    private Metric______________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial______________________ imperial;

    public Metric______________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric______________________ metric) {
        this.metric = metric;
    }

    public Imperial______________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial______________________ imperial) {
        this.imperial = imperial;
    }

}
