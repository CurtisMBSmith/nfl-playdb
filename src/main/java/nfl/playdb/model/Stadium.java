package nfl.playdb.model;

import java.util.Arrays;
import java.util.Optional;

public enum Stadium {

	ARROWHEAD_STADIUM(39.048889, -94.483889, "Arrowhead Stadium"),
	AT_AND_T_STADIUM(32.747778, -97.092778, "Cowboys Stadium", "AT&T Stadium"),
	BANK_OF_AMERICA_STADIUM(35.225833, -80.852778, "Ericsson Stadium", "Bank of America Stadium", "Bank of America Stadiium" /*Typo in dataset*/),
	CANDLESTICK_PARK(37.713611, -122.386111, "3COM Park", "Monster Park", "Candlestick Park"),
	CENTURYLINK_FIELD(47.5952, -122.3316, "Seahawks Stadium", "Qwest Field", "CenturyLink Field"),
	EDWARD_JONES_DOME(38.632778, -90.188611, "Trans World Dome", "Edward Jones Dome"),
	ESTADIO_AZTECA(19.302911, -99.150442, "Azteca Stadium"),
	EVERBANK_FIELD(30.323889, -81.6375, "Alltel Stadium", "Jacksonville Municipal Stadium", "EverBank Field", "EverBank"),
	FEDEXFIELD(38.907778, -76.864444, "FedExField", "FedEx Field"),
	FIRSTENERGY_STADIUM(41.506111, -81.699444, "Cleveland Browns Stadium", "FirstEnergy Stadium"),
	FORD_FIELD(42.34, -83.045556, "Ford Field"),
	FOXBORO_STADIUM(42.0927, -71.267442, "Foxboro Stadium"),
	GEORGIA_DOME(33.7575, -84.400833, "Georgia Dome", "Geogia Dome" /*Typo in dataset*/),
	GIANTS_STADIUM(40.812222, -74.076944, "Giants Stadium", "The Meadowlands"),
	GILLETTE_STADIUM(42.090944, -71.264344, "Gillette Stadium"),
	HEINZ_FIELD(40.446667, -80.015833, "Heinz Field"),
	HUBERT_H_HUMPHFREY_METRODOME(44.973889, -93.258056, "Metrodome", "Mall of America Field at HHH Metrodome"),
	HUSKY_STADIUM(47.650278, -122.301667, "Husky Stadium"),
	LAMBEAU_FIELD(44.501, -88.062, "Lambeau Field"),
	LEVIS_STADIUM(37.403, -121.97, "Levi's Stadium"),
	LINCOLN_FINANCIAL_FIELD(39.900833, -75.1675, "Lincoln Financial Field"),
	LUCAS_OIL_STADIUM(39.760056, -86.163806, "Lucas Oil Stadium"),
	M_AND_T_BANK_STADIUM(39.277881, -76.622639, "PSINet Stadium", "Ravens Stadium", "M & T Bank Stadium", "M&T Bank Stadium"),
	MEMORIAL_STADIUM(40.099167, -88.235833, "Memorial Stadium"),
	MERCEDES_BENZ_SUPERDOME(29.950833, -90.081111, "Louisiana Superdome", "Mercedes-Benz Superdome"),
	METLIFE_STADIUM(40.813611, -74.074444, "New Meadowlands Stadium", "Metlife Stadium", "MetLife"),
	MILE_HIGH_STADIUM(39.746111, -105.021667, "Mile High Stadium"),
	NISSAN_STADIUM(36.166389, -86.771389, "Adelphia Coliseum", "LP Field"),
	NRG_STADIUM(29.684722, -95.410833, "Reliant Stadium", "NRG Stadium"),
	O_CO_COLISEUM(37.751667, -122.200556, "Network Associates Coliseum", "McAfee Coliseum", "Oakland-Alameda County Coliseum", "O.Co Coliseum", "O.Co Oakland Coliseum", "O.co Coliseum Oakland"),
	PAUL_BROWN_STADIUM(39.095444, -84.516039, "Paul Brown Stadium"),
	QUALCOMM_STADIUM(32.783056, -117.119444, "Qualcomm Stadium", "Snapdragon Stadium"),
	RALPH_WILSON_STADIUM(42.774, -78.787, "Ralph Wilson Stadium"),
	RAYMOND_JAMES_STADIUM(27.975833, -82.503333, "Raymond James Stadium"),
	RCA_DOME(39.763658, -86.163319, "RCA Dome"),
	ROGERS_CENTRE(43.641389, -79.389167, "Rogers Centre"),
	SILVERDOME(42.645833, -83.255, "Pontiac Sliverdome" /*Typo in dataset*/, "Pontiac Silverdome"),
	SOLDIER_FIELD(41.8625, -87.616667, "Soldier Field"),
	SPORTS_AUTHORITY_FIELD_AT_MILE_HIGH(39.743889, -105.02, "Invesco Field at Mile High", "Sports Authority Field at Mile High"),
	SUN_DEVIL_STADIUM(33.426389, -111.9325, "Sun Devil Stadium"),
	SUN_LIFE_STADIUM(25.958056, -80.238889, "Pro Player Stadium", "Sun Life Stadium", "Dolphins Stadium", "Land Shark Stadium", "SunLife Stadium"),
	TCF_BANK_STADIUM(44.976, -93.225, "TCF Bank Stadium"),
	TEXAS_STADIUM(32.839769, -96.910911, "Texas Stadium"),
	THREE_RIVERS_STADIUM(40.446667, -80.012778, "Three Rivers Stadium"),
	UNIVERSITY_OF_PHOENIX_STADIUM(33.5275, -112.2625, "Cardinals Stadium", "University of Phoenix Stadium", "University of Phoenix " /* Trailing whitespace in dataset*/),
	VETERANS_STADIUM(39.906667, -75.171111, "Veterans Stadium"),
	WEMBLEY_STADIUM(51.555833, -0.279722, "Wembley Stadium");

	private final double latitude;
	private final double longitude;
	private final String[] stadiumNames;

	private Stadium(final double latitude, final double longitude, final String... names) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.stadiumNames = names;
	}

	private Stadium(final String... names) {
		this(0.0, 0.0, names);
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public String[] getStadiumNames() {
		return stadiumNames;
	}

	public static Stadium fromString(final String stadiumName) {
		final Optional<Stadium> result = Arrays.stream(values())
				.filter((stadium) -> Arrays.stream(stadium.getStadiumNames()).anyMatch((name) -> name.equals(stadiumName))).findAny();
		return result.isPresent() ? result.get() : null;
	}
}
