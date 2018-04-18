
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past24HourTemperatureDeparture {

    @SerializedName("Metric")
    @Expose
    private Metric_________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial_________ imperial;

    public Metric_________ getMetric() {
        return metric;
    }

    public void setMetric(Metric_________ metric) {
        this.metric = metric;
    }

    public Imperial_________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial_________ imperial) {
        this.imperial = imperial;
    }

}
