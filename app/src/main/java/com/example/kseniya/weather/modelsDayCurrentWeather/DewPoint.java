
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DewPoint {

    @SerializedName("Metric")
    @Expose
    private Metric___ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___ imperial;

    public Metric___ getMetric() {
        return metric;
    }

    public void setMetric(Metric___ metric) {
        this.metric = metric;
    }

    public Imperial___ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial___ imperial) {
        this.imperial = imperial;
    }

}
