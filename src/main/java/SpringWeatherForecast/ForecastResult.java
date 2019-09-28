package SpringWeatherForecast;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ForecastResult {
	
	ConsolidatedWeather [] consolidatedWeather;
	
	public ForecastResult() {}

	public ConsolidatedWeather[] getConsolidatedWeather() {
		return consolidatedWeather;
	}

	public void setConsolidatedWeather(ConsolidatedWeather[] consolidatedWeather) {
		this.consolidatedWeather = consolidatedWeather;
	}

	@Override
	public String toString() {
		return "ForecastResult [consolidatedWeather=" + Arrays.toString(consolidatedWeather) + "]";
	}
	
}
