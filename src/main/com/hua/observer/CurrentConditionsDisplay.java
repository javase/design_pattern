package com.hua.observer;

/**
 * 当前天气状态展示
 * Created by limenghua on 2017/4/27.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//气压

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("当前温度为：%s℃", this.temperature));
        System.out.println(String.format("当前湿度为：%s%%", this.humidity));
        System.out.println(String.format("当前气压为：%shPa", this.pressure));
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }
}
