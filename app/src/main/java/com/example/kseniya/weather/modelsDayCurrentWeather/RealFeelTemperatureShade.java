
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RealFeelTemperatureShade {

    @SerializedName("Metric")
    @Expose
    private Metric__ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial__ imperial;

    public Metric__ getMetric() {
        return metric;
    }

    public void setMetric(Metric__ metric) {
        this.metric = metric;
    }

    public Imperial__ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial__ imperial) {
        this.imperial = imperial;
    }

}
