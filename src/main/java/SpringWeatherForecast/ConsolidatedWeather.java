package SpringWeatherForecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ConsolidatedWeather {

	private @Id @GeneratedValue long id;
	String city;
	double theTemp;

	public ConsolidatedWeather(String city, double theTemp) {
		this.city = city;
		this.theTemp = theTemp;
	}

	public ConsolidatedWeather() {
	}

	@Override
	public String toString() {
		return "[In "+city+" temperature is :"+theTemp+"]";
	}
}
