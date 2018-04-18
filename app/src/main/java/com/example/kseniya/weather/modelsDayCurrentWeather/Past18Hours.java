
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past18Hours {

    @SerializedName("Metric")
    @Expose
    private Metric____________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial____________________ imperial;

    public Metric____________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric____________________ metric) {
        this.metric = metric;
    }

    public Imperial____________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial____________________ imperial) {
        this.imperial = imperial;
    }

}
