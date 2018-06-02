package com.example.kseniya.weather;

public interface Lifecycle<V> {

    void bind(V view);

    void unbind();

}
