
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Maximum {

    @SerializedName("Metric")
    @Expose
    private Metric_______________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_______________________ imperial;

    public Metric_______________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_______________________ metric) {
        this.metric = metric;
    }

    public Imperial_______________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_______________________ imperial) {
        this.imperial = imperial;
    }

}
