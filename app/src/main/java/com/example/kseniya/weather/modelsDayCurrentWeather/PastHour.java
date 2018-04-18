
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PastHour {

    @SerializedName("Metric")
    @Expose
    private Metric_______________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_______________ imperial;

    public Metric_______________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_______________ metric) {
        this.metric = metric;
    }

    public Imperial_______________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_______________ imperial) {
        this.imperial = imperial;
    }

}
