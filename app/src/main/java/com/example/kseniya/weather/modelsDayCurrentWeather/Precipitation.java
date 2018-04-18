
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Precipitation {

    @SerializedName("Metric")
    @Expose
    private Metric______________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial______________ imperial;

    public Metric______________ getMetric() {
        return metric;
    }

    public void setMetric(Metric______________ metric) {
        this.metric = metric;
    }

    public Imperial______________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial______________ imperial) {
        this.imperial = imperial;
    }

}
