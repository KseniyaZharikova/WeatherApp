
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past3Hours {

    @SerializedName("Metric")
    @Expose
    private Metric metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial imperial;

    public Metric  getMetric() {
        return metric;
    }

    public void setMetric(Metric  metric) {
        this.metric = metric;
    }

    public Imperial getImperial() {
        return imperial;
    }

    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }

}
