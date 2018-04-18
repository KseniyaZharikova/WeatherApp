
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindChillTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric___________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial___________ imperial;

    public Metric___________ getMetric() {
        return metric;
    }

    public void setMetric(Metric___________ metric) {
        this.metric = metric;
    }

    public Imperial___________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial___________ imperial) {
        this.imperial = imperial;
    }

}
