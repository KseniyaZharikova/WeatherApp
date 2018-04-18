
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Speed {

    @SerializedName("Metric")
    @Expose
    private Metric____ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial____ imperial;

    public Metric____ getMetric() {
        return metric;
    }

    public void setMetric(Metric____ metric) {
        this.metric = metric;
    }

    public Imperial____ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial____ imperial) {
        this.imperial = imperial;
    }

}
