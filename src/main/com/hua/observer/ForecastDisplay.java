package com.hua.observer;

import java.util.List;

/**
 * 预报
 * Created by limenghua on 2017/4/27.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    private List<Float> forecastTemperatures;//未来几天的温度

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("未来几天的气温");
        int count = forecastTemperatures.size();
        for (int i = 0; i < count; i++) {
            System.out.println(String.format("第%d天：%s℃", i, forecastTemperatures.get(i)));
        }
    }

    @Override
    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }
}
