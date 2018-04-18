
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WetBulbTemperature {

    @SerializedName("Metric")
    @Expose
    private Metric____________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial____________ imperial;

    public Metric____________ getMetric() {
        return metric;
    }

    public void setMetric(Metric____________ metric) {
        this.metric = metric;
    }

    public Imperial____________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial____________ imperial) {
        this.imperial = imperial;
    }

}
