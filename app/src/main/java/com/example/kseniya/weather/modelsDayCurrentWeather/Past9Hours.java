
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past9Hours {

    @SerializedName("Metric")
    @Expose
    private Metric__________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__________________ imperial;

    public Metric__________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric__________________ metric) {
        this.metric = metric;
    }

    public Imperial__________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial__________________ imperial) {
        this.imperial = imperial;
    }

}
