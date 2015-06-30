package nfl.playdb.model;

import java.util.Optional;

public class Weather {

	private Optional<Integer> temperature;
	private Optional<Integer> humidity;
	private Optional<Integer> windspeed;
	private final Optional<WindDirection> windDirection;
	private final Optional<WeatherCondition> condition;

	public Weather(final String temperature, final String humidity, final String windspeed,
			final Optional<WindDirection> wDir, final Optional<WeatherCondition> cond) {
		try {
			this.temperature = Optional.of(Integer.parseInt(temperature));
		} catch (final NumberFormatException nfe) {
			this.temperature = Optional.empty();
		}

		try {
			this.humidity = Optional.of(Integer.parseInt(humidity));
		} catch (final NumberFormatException nfe) {
			this.humidity = Optional.empty();
		}

		try {
			this.windspeed = Optional.of(Integer.parseInt(windspeed));
		} catch (final NumberFormatException nfe) {
			this.windspeed = Optional.empty();
		}

		this.windDirection = wDir;
		this.condition = cond;
	}

	public Optional<Integer> getTemperature() {
		return temperature;
	}

	public Optional<Integer> getHumidity() {
		return humidity;
	}

	public Optional<Integer> getWindspeed() {
		return windspeed;
	}

	public Optional<WindDirection> getWindDirection() {
		return windDirection;
	}

	public Optional<WeatherCondition> getCondition() {
		return condition;
	}

}
