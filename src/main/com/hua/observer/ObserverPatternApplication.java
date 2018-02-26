package com.hua.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by limenghua on 2017/4/27. <br/>
 * 观察者模式 <br/>
 * 文章链接：<a href="http://www.jianshu.com/p/d55ee6e83d66">设计模式之观察者模式</a>
 *
 * 需求描述：
 * 我们接到一个来自气象局的需求：气象局需要我们构建一套系统，
 * 这系统有两个公告牌，分别用于显示当前的实时天气和未来几天的天气预报。
 * 当气象局发布新的天气数据（WeatherData）后，两个公告牌上显示的天气数据必须实时更新。
 * 气象局同时要求我们保证程序拥有足够的可扩展性，因为后期随时可能要新增新的公告牌。
 */
public class ObserverPatternApplication {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		// 实例化时，对观察者进行了注册
		new CurrentConditionsDisplay(weatherData);
		new ForecastDisplay(weatherData);

		List<Float> forecastTemperatures = new ArrayList<>();
		forecastTemperatures.add(14f);
		forecastTemperatures.add(17f);
		forecastTemperatures.add(15f);
		forecastTemperatures.add(14f);
		forecastTemperatures.add(10f);
		forecastTemperatures.add(14f);
		forecastTemperatures.add(9f);
		weatherData.setMeasurements(14f, 49f, 1023f,
				forecastTemperatures);
	}
}
