
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Minimum_ {

    @SerializedName("Metric")
    @Expose
    private Metric________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial________________________ imperial;

    public Metric________________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric________________________ metric) {
        this.metric = metric;
    }

    public Imperial________________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial________________________ imperial) {
        this.imperial = imperial;
    }

}
