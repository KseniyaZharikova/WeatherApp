
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ceiling {

    @SerializedName("Metric")
    @Expose
    private Metric_______ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_______ imperial;

    public Metric_______ getMetric() {
        return metric;
    }

    public void setMetric(Metric_______ metric) {
        this.metric = metric;
    }

    public Imperial_______ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_______ imperial) {
        this.imperial = imperial;
    }

}
