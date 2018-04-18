
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past24Hours {

    @SerializedName("Metric")
    @Expose
    private Metric_____________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_____________________ imperial;

    public Metric_____________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_____________________ metric) {
        this.metric = metric;
    }

    public Imperial_____________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_____________________ imperial) {
        this.imperial = imperial;
    }

}
