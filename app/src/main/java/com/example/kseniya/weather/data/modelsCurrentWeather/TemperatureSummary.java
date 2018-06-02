
package com.example.kseniya.weather.data.modelsCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TemperatureSummary {

    @SerializedName("Past6HourRange")
    @Expose
    private Past6HourRange past6HourRange;
    @SerializedName("Past12HourRange")
    @Expose
    private Past12HourRange past12HourRange;
    @SerializedName("Past24HourRange")
    @Expose
    private Past24HourRange past24HourRange;

    public Past6HourRange getPast6HourRange() {
        return past6HourRange;
    }

    public void setPast6HourRange(Past6HourRange past6HourRange) {
        this.past6HourRange = past6HourRange;
    }

    public Past12HourRange getPast12HourRange() {
        return past12HourRange;
    }

    public void setPast12HourRange(Past12HourRange past12HourRange) {
        this.past12HourRange = past12HourRange;
    }

    public Past24HourRange getPast24HourRange() {
        return past24HourRange;
    }

    public void setPast24HourRange(Past24HourRange past24HourRange) {
        this.past24HourRange = past24HourRange;
    }

}
