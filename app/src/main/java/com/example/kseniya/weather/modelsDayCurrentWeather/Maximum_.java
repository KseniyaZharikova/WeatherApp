
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Maximum_ {

    @SerializedName("Metric")
    @Expose
    private Metric_________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_________________________ imperial;

    public Metric_________________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_________________________ metric) {
        this.metric = metric;
    }

    public Imperial_________________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_________________________ imperial) {
        this.imperial = imperial;
    }

}
