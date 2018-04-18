
package com.example.kseniya.weather.modelsForecastWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Night {

    @SerializedName("Icon")
    @Expose
    private Integer icon;
    @SerializedName("IconPhrase")
    @Expose
    private String iconPhrase;
    @SerializedName("ShortPhrase")
    @Expose
    private String shortPhrase;
    @SerializedName("LongPhrase")
    @Expose
    private String longPhrase;
    @SerializedName("PrecipitationProbability")
    @Expose
    private Integer precipitationProbability;
    @SerializedName("ThunderstormProbability")
    @Expose
    private Integer thunderstormProbability;
    @SerializedName("RainProbability")
    @Expose
    private Integer rainProbability;
    @SerializedName("SnowProbability")
    @Expose
    private Integer snowProbability;
    @SerializedName("IceProbability")
    @Expose
    private Integer iceProbability;
    @SerializedName("Wind")
    @Expose
    private Wind_ wind;
    @SerializedName("WindGust")
    @Expose
    private WindGust_ windGust;
    @SerializedName("TotalLiquid")
    @Expose
    private TotalLiquid_ totalLiquid;
    @SerializedName("Rain")
    @Expose
    private Rain_ rain;
    @SerializedName("Snow")
    @Expose
    private Snow_ snow;
    @SerializedName("Ice")
    @Expose
    private Ice_ ice;
    @SerializedName("HoursOfPrecipitation")
    @Expose
    private Integer hoursOfPrecipitation;
    @SerializedName("HoursOfRain")
    @Expose
    private Integer hoursOfRain;
    @SerializedName("HoursOfSnow")
    @Expose
    private Integer hoursOfSnow;
    @SerializedName("HoursOfIce")
    @Expose
    private Integer hoursOfIce;
    @SerializedName("CloudCover")
    @Expose
    private Integer cloudCover;

    public Integer getIcon() {
        return icon;
    }

    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public String getShortPhrase() {
        return shortPhrase;
    }

    public void setShortPhrase(String shortPhrase) {
        this.shortPhrase = shortPhrase;
    }

    public String getLongPhrase() {
        return longPhrase;
    }

    public void setLongPhrase(String longPhrase) {
        this.longPhrase = longPhrase;
    }

    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public Integer getThunderstormProbability() {
        return thunderstormProbability;
    }

    public void setThunderstormProbability(Integer thunderstormProbability) {
        this.thunderstormProbability = thunderstormProbability;
    }

    public Integer getRainProbability() {
        return rainProbability;
    }

    public void setRainProbability(Integer rainProbability) {
        this.rainProbability = rainProbability;
    }

    public Integer getSnowProbability() {
        return snowProbability;
    }

    public void setSnowProbability(Integer snowProbability) {
        this.snowProbability = snowProbability;
    }

    public Integer getIceProbability() {
        return iceProbability;
    }

    public void setIceProbability(Integer iceProbability) {
        this.iceProbability = iceProbability;
    }

    public Wind_ getWind() {
        return wind;
    }

    public void setWind(Wind_ wind) {
        this.wind = wind;
    }

    public WindGust_ getWindGust() {
        return windGust;
    }

    public void setWindGust(WindGust_ windGust) {
        this.windGust = windGust;
    }

    public TotalLiquid_ getTotalLiquid() {
        return totalLiquid;
    }

    public void setTotalLiquid(TotalLiquid_ totalLiquid) {
        this.totalLiquid = totalLiquid;
    }

    public Rain_ getRain() {
        return rain;
    }

    public void setRain(Rain_ rain) {
        this.rain = rain;
    }

    public Snow_ getSnow() {
        return snow;
    }

    public void setSnow(Snow_ snow) {
        this.snow = snow;
    }

    public Ice_ getIce() {
        return ice;
    }

    public void setIce(Ice_ ice) {
        this.ice = ice;
    }

    public Integer getHoursOfPrecipitation() {
        return hoursOfPrecipitation;
    }

    public void setHoursOfPrecipitation(Integer hoursOfPrecipitation) {
        this.hoursOfPrecipitation = hoursOfPrecipitation;
    }

    public Integer getHoursOfRain() {
        return hoursOfRain;
    }

    public void setHoursOfRain(Integer hoursOfRain) {
        this.hoursOfRain = hoursOfRain;
    }

    public Integer getHoursOfSnow() {
        return hoursOfSnow;
    }

    public void setHoursOfSnow(Integer hoursOfSnow) {
        this.hoursOfSnow = hoursOfSnow;
    }

    public Integer getHoursOfIce() {
        return hoursOfIce;
    }

    public void setHoursOfIce(Integer hoursOfIce) {
        this.hoursOfIce = hoursOfIce;
    }

    public Integer getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

}
