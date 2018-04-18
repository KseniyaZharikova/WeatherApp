
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApparentTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric__________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__________ imperial;

    public Metric__________ getMetric() {
        return metric;
    }

    public void setMetric(Metric__________ metric) {
        this.metric = metric;
    }

    public Imperial__________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial__________ imperial) {
        this.imperial = imperial;
    }

}
