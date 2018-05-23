package com.example.kseniya.weather.ui;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kseniya on 24.04.2018.
 */
public class ActivityLocationTest {
    @Test
    public void showLocation() throws Exception {
    }

    @Test
    public void formatLocationGetLatitude() throws Exception {
        String fs = String.format("%1$.4f", 42.8721).replaceAll(",",".");
        assertEquals ("42.8721", fs);
    }

    @Test
    public void formatLocationGetLongitude() throws Exception {
    }

}