
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Past3Hours {

    @SerializedName("Metric")
    @Expose
    private Metric________________ metric;
    @SerializedName("Imperial")
    @Expose
    private Imperial________________ imperial;

    public Metric________________ getMetric() {
        return metric;
    }

    public void setMetric(Metric________________ metric) {
        this.metric = metric;
    }

    public Imperial________________ getImperial() {
        return imperial;
    }

    public void setImperial(Imperial________________ imperial) {
        this.imperial = imperial;
    }

}
