
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Visibility {

    @SerializedName("Metric")
    @Expose
    private Metric______ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial______ imperial;

    public Metric______ getMetric() {
        return metric;
    }

    public void setMetric(Metric______ metric) {
        this.metric = metric;
    }

    public Imperial______ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial______ imperial) {
        this.imperial = imperial;
    }

}
