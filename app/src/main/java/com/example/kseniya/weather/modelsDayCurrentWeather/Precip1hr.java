
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Precip1hr {

    @SerializedName("Metric")
    @Expose
    private Metric_____________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_____________ imperial;

    public Metric_____________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_____________ metric) {
        this.metric = metric;
    }

    public Imperial_____________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_____________ imperial) {
        this.imperial = imperial;
    }

}
