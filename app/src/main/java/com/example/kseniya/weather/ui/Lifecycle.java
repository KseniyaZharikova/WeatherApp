package com.example.kseniya.weather.ui;

public interface Lifecycle<V> {

    void bind(V view);

    void unbind();

}
