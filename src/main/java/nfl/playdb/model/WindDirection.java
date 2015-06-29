package nfl.playdb.model;

import java.util.Arrays;
import java.util.Optional;

public enum WindDirection {

	NORTH("N"),
	NORTH_NORTH_EAST("NNE"),
	NORTH_EAST("NE"),
	EAST_NORTH_EAST("ENE"),
	EAST("E"),
	EAST_SOUTH_EAST("ESE"),
	SOUTH_EAST("SE"),
	SOUTH_SOUTH_EAST("SSE"),
	SOUTH("S"),
	SOUTH_SOUTH_WEST("SSW"),
	SOUTH_WEST("SW"),
	WEST_SOUTH_WEST("WSW"),
	WEST("W"),
	WEST_NORTH_WEST("WNW"),
	NORTH_WEST("NW"),
	NORTH_NORTH_WEST("NNW"),
	CALM("CALM"),
	VARIABLE("VAR"),
	NOT_AVAILABLE("NA"),
	UNKNOWN("");;

	private String abbrev;

	private WindDirection(final String abbrev) {
		this.abbrev = abbrev;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public static Optional<WindDirection> fromString(final String wdir) {
		final Optional<WindDirection> result = Arrays.stream(values())
				.filter((dir) -> dir.getAbbrev().equals(wdir)).findAny();
		return result;
	}
}
