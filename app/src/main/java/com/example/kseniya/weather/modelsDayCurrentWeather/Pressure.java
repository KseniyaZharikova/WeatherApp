
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pressure {

    @SerializedName("Metric")
    @Expose
    private Metric________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial________ imperial;

    public Metric________ getMetric() {
        return metric;
    }

    public void setMetric(Metric________ metric) {
        this.metric = metric;
    }

    public Imperial________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial________ imperial) {
        this.imperial = imperial;
    }

}
