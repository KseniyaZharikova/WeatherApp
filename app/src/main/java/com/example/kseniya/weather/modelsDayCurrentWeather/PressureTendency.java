
package com.example.kseniya.weather.modelsDayCurrentWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PressureTendency {

    @SerializedName("LocalizedText")
    @Expose
    private String localizedText;
    @SerializedName("Code")
    @Expose
    private String code;

    public String getLocalizedText() {
        return localizedText;
    }

    public void setLocalizedText(String localizedText) {
        this.localizedText = localizedText;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
