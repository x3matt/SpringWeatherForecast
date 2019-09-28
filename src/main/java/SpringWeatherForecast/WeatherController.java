package SpringWeatherForecast;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherController {
    private final WeatherRepository repository;

    DataSource source = new DataSource();
    WeatherForecaster forecaster = new WeatherForecaster(source);


    public WeatherController(WeatherRepository repository){
        this.repository = repository;
    }

    @PostMapping("/api")
    void addWeather(@RequestBody ConsolidatedWeather weather) {
        repository.save(weather);
    }
    @GetMapping("/api/getAll")
    List<ConsolidatedWeather> getAll(){
        return repository.findAll();
    }
    @GetMapping("/api")
    @ResponseBody
    ConsolidatedWeather getWeatherByCity(@RequestParam(value = "byCity",required = false) String city) throws Exception {
        if(repository.getByCity(city) == null){
            ConsolidatedWeather weather = new ConsolidatedWeather(city,forecaster.getForecastByCity(city));
            addWeather(weather);
            return weather;
        }
        return repository.getByCity(city);
    }

}
