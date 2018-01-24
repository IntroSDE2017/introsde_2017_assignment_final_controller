package introsde.app4;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import introsde.APP4.orchestrator.openweather.OpenWeatherMap;
import introsde.APP4.orchestrator.openweather.entities.Openweather;

public class testWeather {

	private static OpenWeatherMap map;
	@BeforeClass
	public static void setup() {
		map = new OpenWeatherMap();
	}
	
	@Test
	public void testWeatherForecastReturns() {
		Openweather data = map.getForecast();
		
		assertNotNull(data);
		assertNotNull(data.getList().get(0).getClouds());
	}
	
	@Test
	public void testWeatherForecastReturnsTomorrowCloudliness() {
		assertNotNull(map.getCloudCoverageTomorrow());
	}
	
	@Test
	public void testWeatherForecastReturnsTomorrowWeather() {
		assertNotNull(map.getWeatherTomorrow());
	}
	
	@Test
	public void testWeatherForecastReturnsTomorrowOkorNot() {
		assertNotNull(map.getOkWeatherTomorrow());
		System.out.println("Tomorrow is safe: "+map.getOkWeatherTomorrow());
	}
	
	@Test
	public void testWeatherNow() {
		assertNotNull(map.getWeatherNow());
	}

}
