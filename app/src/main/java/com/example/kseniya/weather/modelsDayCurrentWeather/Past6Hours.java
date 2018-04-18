
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past6Hours {

    @SerializedName("Metric")
    @Expose
    private Metric_________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_________________ imperial;

    public Metric_________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_________________ metric) {
        this.metric = metric;
    }

    public Imperial_________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_________________ imperial) {
        this.imperial = imperial;
    }

}
