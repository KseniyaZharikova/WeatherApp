
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Maximum__ {

    @SerializedName("Metric")
    @Expose
    private Metric___________________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___________________________ imperial;

    public Metric___________________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric___________________________ metric) {
        this.metric = metric;
    }

    public Imperial___________________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial___________________________ imperial) {
        this.imperial = imperial;
    }

}
