
package com.example.kseniya.weather.modelsForecastWeather;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DailyForecast {

    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("EpochDate")
    @Expose
    private Integer epochDate;
    @SerializedName("Sun")
    @Expose
    private Sun sun;
    @SerializedName("Moon")
    @Expose
    private Moon moon;
    @SerializedName("TemperatureCurrent")
    @Expose
    private Temperature temperature;
    @SerializedName("RealFeelTemperature")
    @Expose
    private RealFeelTemperature realFeelTemperature;
    @SerializedName("RealFeelTemperatureShade")
    @Expose
    private RealFeelTemperatureShade realFeelTemperatureShade;
    @SerializedName("HoursOfSun")
    @Expose
    private Integer hoursOfSun;
    @SerializedName("DegreeDaySummary")
    @Expose
    private DegreeDaySummary degreeDaySummary;
    @SerializedName("AirAndPollen")
    @Expose
    private List<AirAndPollen> airAndPollen = null;
    @SerializedName("Day")
    @Expose
    private Day day;
    @SerializedName("Night")
    @Expose
    private Night night;
    @SerializedName("Sources")
    @Expose
    private List<String> sources = null;
    @SerializedName("MobileLink")
    @Expose
    private String mobileLink;
    @SerializedName("Link")
    @Expose
    private String link;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getEpochDate() {
        return epochDate;
    }

    public void setEpochDate(Integer epochDate) {
        this.epochDate = epochDate;
    }

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }

    public Moon getMoon() {
        return moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
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

    public Integer getHoursOfSun() {
        return hoursOfSun;
    }

    public void setHoursOfSun(Integer hoursOfSun) {
        this.hoursOfSun = hoursOfSun;
    }

    public DegreeDaySummary getDegreeDaySummary() {
        return degreeDaySummary;
    }

    public void setDegreeDaySummary(DegreeDaySummary degreeDaySummary) {
        this.degreeDaySummary = degreeDaySummary;
    }

    public List<AirAndPollen> getAirAndPollen() {
        return airAndPollen;
    }

    public void setAirAndPollen(List<AirAndPollen> airAndPollen) {
        this.airAndPollen = airAndPollen;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
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
