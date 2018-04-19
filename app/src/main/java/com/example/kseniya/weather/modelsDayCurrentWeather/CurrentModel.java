
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentModel {

    @SerializedName("LocalObservationDateTime")
    @Expose
    private String localObservationDateTime;
    @SerializedName("EpochTime")
    @Expose
    private Integer epochTime;
    @SerializedName("WeatherText")
    @Expose
    private String weatherText;
    @SerializedName("WeatherIcon")
    @Expose
    private Integer weatherIcon;
    @SerializedName("IsDayTime")
    @Expose
    private Boolean isDayTime;
    @SerializedName("Temperature")
    @Expose
    private Temperature temperature;
    @SerializedName("RealFeelTemperature")
    @Expose
    private RealFeelTemperature realFeelTemperature;
    @SerializedName("RealFeelTemperatureShade")
    @Expose
    private RealFeelTemperatureShade realFeelTemperatureShade;
    @SerializedName("RelativeHumidity")
    @Expose
    private Integer relativeHumidity;
    @SerializedName("DewPoint")
    @Expose
    private DewPoint dewPoint;
    @SerializedName("Wind")
    @Expose
    private Wind wind;
    @SerializedName("WindGust")
    @Expose
    private WindGust windGust;
    @SerializedName("UVIndex")
    @Expose
    private Integer uVIndex;
    @SerializedName("UVIndexText")
    @Expose
    private String uVIndexText;
    @SerializedName("Visibility")
    @Expose
    private Visibility visibility;
    @SerializedName("ObstructionsToVisibility")
    @Expose
    private String obstructionsToVisibility;
    @SerializedName("CloudCover")
    @Expose
    private Integer cloudCover;
    @SerializedName("Ceiling")
    @Expose
    private Ceiling ceiling;
    @SerializedName("Pressure")
    @Expose
    private Pressure pressure;
    @SerializedName("PressureTendency")
    @Expose
    private PressureTendency pressureTendency;
    @SerializedName("Past24HourTemperatureDeparture")
    @Expose
    private Past24HourTemperatureDeparture past24HourTemperatureDeparture;
    @SerializedName("ApparentTemperature")
    @Expose
    private ApparentTemperature apparentTemperature;
    @SerializedName("WindChillTemperature")
    @Expose
    private WindChillTemperature windChillTemperature;
    @SerializedName("WetBulbTemperature")
    @Expose
    private WetBulbTemperature wetBulbTemperature;
    @SerializedName("Precip1hr")
    @Expose
    private Precip1hr precip1hr;
    @SerializedName("PrecipitationSummary")
    @Expose
    private PrecipitationSummary precipitationSummary;
    @SerializedName("TemperatureSummary")
    @Expose
    private TemperatureSummary temperatureSummary;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    public Integer getEpochTime() {
        return epochTime;
    }

    public void setEpochTime(Integer epochTime) {
        this.epochTime = epochTime;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public Boolean getIsDayTime() {
        return isDayTime;
    }

    public void setIsDayTime(Boolean isDayTime) {
        this.isDayTime = isDayTime;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public RealFeelTemperature getRealFeelTemperature() {
        return realFeelTemperature;
    }

    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        this.realFeelTemperature = realFeelTemperature;
    }

    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return realFeelTemperatureShade;
    }

    public void setRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        this.realFeelTemperatureShade = realFeelTemperatureShade;
    }

    public Integer getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(Integer relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public DewPoint getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(DewPoint dewPoint) {
        this.dewPoint = dewPoint;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public WindGust getWindGust() {
        return windGust;
    }

    public void setWindGust(WindGust windGust) {
        this.windGust = windGust;
    }

    public Integer getUVIndex() {
        return uVIndex;
    }

    public void setUVIndex(Integer uVIndex) {
        this.uVIndex = uVIndex;
    }

    public String getUVIndexText() {
        return uVIndexText;
    }

    public void setUVIndexText(String uVIndexText) {
        this.uVIndexText = uVIndexText;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public String getObstructionsToVisibility() {
        return obstructionsToVisibility;
    }

    public void setObstructionsToVisibility(String obstructionsToVisibility) {
        this.obstructionsToVisibility = obstructionsToVisibility;
    }

    public Integer getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public PressureTendency getPressureTendency() {
        return pressureTendency;
    }

    public void setPressureTendency(PressureTendency pressureTendency) {
        this.pressureTendency = pressureTendency;
    }

    public Past24HourTemperatureDeparture getPast24HourTemperatureDeparture() {
        return past24HourTemperatureDeparture;
    }

    public void setPast24HourTemperatureDeparture(Past24HourTemperatureDeparture past24HourTemperatureDeparture) {
        this.past24HourTemperatureDeparture = past24HourTemperatureDeparture;
    }

    public ApparentTemperature getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(ApparentTemperature apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
    }

    public WindChillTemperature getWindChillTemperature() {
        return windChillTemperature;
    }

    public void setWindChillTemperature(WindChillTemperature windChillTemperature) {
        this.windChillTemperature = windChillTemperature;
    }

    public WetBulbTemperature getWetBulbTemperature() {
        return wetBulbTemperature;
    }

    public void setWetBulbTemperature(WetBulbTemperature wetBulbTemperature) {
        this.wetBulbTemperature = wetBulbTemperature;
    }

    public Precip1hr getPrecip1hr() {
        return precip1hr;
    }

    public void setPrecip1hr(Precip1hr precip1hr) {
        this.precip1hr = precip1hr;
    }

    public PrecipitationSummary getPrecipitationSummary() {
        return precipitationSummary;
    }

    public void setPrecipitationSummary(PrecipitationSummary precipitationSummary) {
        this.precipitationSummary = precipitationSummary;
    }

    public TemperatureSummary getTemperatureSummary() {
        return temperatureSummary;
    }

    public void setTemperatureSummary(TemperatureSummary temperatureSummary) {
        this.temperatureSummary = temperatureSummary;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
