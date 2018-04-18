
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past12Hours {

    @SerializedName("Metric")
    @Expose
    private Metric___________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___________________ imperial;

    public Metric___________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric___________________ metric) {
        this.metric = metric;
    }

    public Imperial___________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial___________________ imperial) {
        this.imperial = imperial;
    }

}
