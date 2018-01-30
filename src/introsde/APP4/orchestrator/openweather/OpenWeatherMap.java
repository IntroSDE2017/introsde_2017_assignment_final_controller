package introsde.APP4.orchestrator.openweather;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import introsde.APP4.orchestrator.openweather.entities.List;
import introsde.APP4.orchestrator.openweather.entities.Openweather;
import introsde.APP4.orchestrator.openweather.entities.Weather;



public class OpenWeatherMap {

	private static final String API_KEY = "edf0ed55023a7497718b77c264bb59bd";
	private static final String ADDRESS = "http://api.openweathermap.org/data/2.5";
	private Openweather data = null;
	
	public Integer getCloudCoverageTomorrow() {
		return getTomorrowForecast().getClouds().getAll();
	}
	
	public Double getRainTomorrow() {
		return getTomorrowForecast().getRain().get3h();
	}
	
	public boolean isRainTomorrow() {
		return getTomorrowForecast().getRain()!=null;
	}
	
	public Double getSnowTomorrow() {
		return getTomorrowForecast().getSnow().get3h();
	}
	
	public boolean isSnowTomorrow() {
		return getTomorrowForecast().getSnow()!=null && getTomorrowForecast().getSnow().get3h()>1;
	}
	
	public Double getWindTomorrow() {
		return getTomorrowForecast().getWind().getSpeed();
	}
	
	public String getWeatherTomorrow() {
		String string = "";
		for (Weather weather : getTomorrowForecast().getWeather()) {
			string += weather.getMain()+" ";
		}
		return string;
	}
	
	public String getWeatherNow() {
		String string = "";
		for (Weather weather : getNowForecast().getWeather()) {
			string += weather.getMain()+" ";
		}
		return string;
	}
	
	public Boolean getOkWeatherTomorrow() {
		java.util.List<Weather> weathers = getTomorrowForecast().getWeather();
		for (Weather weather : weathers) {
			if (
					(weather.getId()>=800 && weather.getId()<=803) ||
					(weather.getId()>=951 && weather.getId()<=957) ) {
				//do Nothing
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public introsde.APP4.orchestrator.openweather.entities.List getNowForecast() {
		if(data == null) getForecast();
		return data.getList().get(0);
	}
	
	public introsde.APP4.orchestrator.openweather.entities.List getTomorrowForecast() {
		if(data == null) getForecast();

		Date tomorrowEarly = getTomorrow(9);
		Date tomorrowLate = getTomorrow(12);
		
		for (List prevision : data.getList()) {
			Date previsionDate = new Date((long)prevision.getDt()*1000);
			if( previsionDate.after(tomorrowEarly) && previsionDate.before(tomorrowLate) ) {
				return prevision;
			}
		}
		return null;
	}
	
	private Date getTomorrow(Integer hour) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DAY_OF_YEAR, 1);
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.AM_PM, 0);
		cal.set(Calendar.HOUR, hour);
		return cal.getTime();
	}
	
	public Openweather getForecast() {
		WebTarget webTarget = generateWebTarget("/forecast");
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);	//Make jersey 2 invocation builder requesting a certain MEDIA TYPE
		Response response = invocationBuilder.get();							//Launch the GET request and obtain the response
		response.bufferEntity();
		data = response.readEntity(Openweather.class);
		return data;
	}

	private static WebTarget generateWebTarget(String target) {
		Client client = generateClient();		//generate a new client, add the path
		WebTarget webTarget = client.target(ADDRESS).path(target).queryParam("q", "Trento,it").queryParam("appid", API_KEY);//.queryParam("mode", "xml");
		return webTarget;
	}
	// method used to generate the client and configure it
	private static Client generateClient() {							// if logging is needed
		Client client = ClientBuilder.newClient( new ClientConfig() ); //.register( LoggingFilter.class ) );
		return client;
	}
}
