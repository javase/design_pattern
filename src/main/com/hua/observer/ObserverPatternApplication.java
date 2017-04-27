package com.hua.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by limenghua on 2017/4/27. <br/>
 * 观察者模式 <br/>
 * 文章链接：<a href="http://www.jianshu.com/p/d55ee6e83d66">设计模式之观察者模式</a>
 */
public class ObserverPatternApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        List<Float> forecastTemperatures = new ArrayList<>();
        forecastTemperatures.add(22f);
        forecastTemperatures.add(-1f);
        forecastTemperatures.add(9f);
        forecastTemperatures.add(23f);
        forecastTemperatures.add(27f);
        forecastTemperatures.add(30f);
        forecastTemperatures.add(10f);
        weatherData.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);
    }
}
