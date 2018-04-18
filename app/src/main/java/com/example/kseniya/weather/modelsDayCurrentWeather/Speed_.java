
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Speed_ {

    @SerializedName("Metric")
    @Expose
    private Metric_____ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_____ imperial;

    public Metric_____ getMetric() {
        return metric;
    }

    public void setMetric(Metric_____ metric) {
        this.metric = metric;
    }

    public Imperial_____ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_____ imperial) {
        this.imperial = imperial;
    }

}
