package com.hua.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lerry on 2017/4/18.
 * 文章链接：<a href="http://www.jianshu.com/p/d55ee6e83d66">设计模式之观察者模式</a>
 */
class WeatherData implements Subject {

	private List<Observer> observers;

	private float temperature;//温度

	private float humidity;//湿度

	private float pressure;//气压

	private List<Float> forecastTemperatures;//未来几天的温度

	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			System.out.println(String.format("开始广播通知观察者[%s]", observer.getClass().getSimpleName()));
			observer.update();
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure, List<Float> forecastTemperatures) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.forecastTemperatures = forecastTemperatures;
		measurementsChanged();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public List<Float> getForecastTemperatures() {
		return forecastTemperatures;
	}

	public void setForecastTemperatures(List<Float> forecastTemperatures) {
		this.forecastTemperatures = forecastTemperatures;
	}
}
