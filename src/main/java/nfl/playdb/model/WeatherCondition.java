package nfl.playdb.model;

import java.util.Arrays;
import java.util.Optional;

public enum WeatherCondition {

	CHANCE_OF_RAIN("Chance Rain"),
	CLEAR("Clear"),
	CLOSED_ROOF("Closed Roof"),
	CLOUDY("Cloudy"),
	COLD("Cold"),
	COVERED_ROOF("Covered Roof"),
	DOME("Dome"),
	FAIR("Fair"),
	FLURRIES("Flurries"),
	FOGGY("Foggy"),
	HAZY("Hazy"),
	LIGHT_RAIN("Light Rain"),
	LIGHT_SNOW("Light Snow"),
	MOSTLY_CLOUDY("Mostly Cloudy"),
	MOSTLY_SUNNY("Mostly Sunny"),
	PARTLY_CLOUDY("Partly Cloudy"),
	PARTLY_SUNNY("Partly Sunny"),
	RAIN("Rain"),
	SNOW("Snow"),
	SUNNY("Sunny"),
	THUNDERSTORMS("Thunderstorms"),
	UNKNOWN(""),
	WINDY("Windy");

	private String name;

	private WeatherCondition(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Optional<WeatherCondition> fromString(final String cond) {
		final Optional<WeatherCondition> result = Arrays.stream(values())
				.filter((condition) -> condition.getName().equalsIgnoreCase(cond)).findAny();
		return result;
	}
}
