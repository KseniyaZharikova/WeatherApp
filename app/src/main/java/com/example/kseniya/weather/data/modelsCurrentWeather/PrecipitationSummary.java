
package com.example.kseniya.weather.data.modelsCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrecipitationSummary {

    @SerializedName("Precipitation")
    @Expose
    private Precipitation precipitation;
    @SerializedName("PastHour")
    @Expose
    private PastHour pastHour;
    @SerializedName("Past3Hours")
    @Expose
    private Past3Hours past3Hours;
    @SerializedName("Past6Hours")
    @Expose
    private Past6Hours past6Hours;
    @SerializedName("Past9Hours")
    @Expose
    private Past9Hours past9Hours;
    @SerializedName("Past12Hours")
    @Expose
    private Past12Hours past12Hours;
    @SerializedName("Past18Hours")
    @Expose
    private Past18Hours past18Hours;
    @SerializedName("Past24Hours")
    @Expose
    private Past24Hours past24Hours;

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public PastHour getPastHour() {
        return pastHour;
    }

    public void setPastHour(PastHour pastHour) {
        this.pastHour = pastHour;
    }

    public Past3Hours getPast3Hours() {
        return past3Hours;
    }

    public void setPast3Hours(Past3Hours past3Hours) {
        this.past3Hours = past3Hours;
    }

    public Past6Hours getPast6Hours() {
        return past6Hours;
    }

    public void setPast6Hours(Past6Hours past6Hours) {
        this.past6Hours = past6Hours;
    }

    public Past9Hours getPast9Hours() {
        return past9Hours;
    }

    public void setPast9Hours(Past9Hours past9Hours) {
        this.past9Hours = past9Hours;
    }

    public Past12Hours getPast12Hours() {
        return past12Hours;
    }

    public void setPast12Hours(Past12Hours past12Hours) {
        this.past12Hours = past12Hours;
    }

    public Past18Hours getPast18Hours() {
        return past18Hours;
    }

    public void setPast18Hours(Past18Hours past18Hours) {
        this.past18Hours = past18Hours;
    }

    public Past24Hours getPast24Hours() {
        return past24Hours;
    }

    public void setPast24Hours(Past24Hours past24Hours) {
        this.past24Hours = past24Hours;
    }

}
