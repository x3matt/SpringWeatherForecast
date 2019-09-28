package SpringWeatherForecast;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<ConsolidatedWeather,Long> {
    ConsolidatedWeather getByCity(String city);
}
