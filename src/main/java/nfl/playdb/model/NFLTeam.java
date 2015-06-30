package nfl.playdb.model;

import java.util.Arrays;
import java.util.Optional;

public enum NFLTeam {

	ARIZONA_CARDINALS("Arizona", "Cardinals", "ARI"),
	ATLANTA_FALCONS("Atlanta", "Falcons", "ATL"),
	BALTIMORE_RAVENS("Baltimore", "Ravens", "BAL"),
	BUFFALO_BILLS("Buffalo", "Bills", "BUF"),
	CAROLINA_PANTHERS("Carolina", "Panthers", "CAR"),
	CHICAGO_BEARS("Chicago", "Bears", "CHI"),
	CINCINNATI_BENGALS("Cincinnati", "Bengals", "CIN"),
	CLEVELAND_BROWNS("Cleveland", "Browns", "CLE"),
	DALLAS_COWBOYS("Dallas", "Cowboys", "DAL"),
	DENVER_BRONCOS("Denver", "Broncos", "DEN"),
	DETROIT_LIONS("Detroit", "Lions", "DET"),
	GREEN_BAY_PACKERS("Green Bay", "Packers", "GB"),
	HOUSTON_TEXANS("Houston", "Texans", "HOU"),
	INDIANAPOLIS_COLTS("Indianapolis", "Colts", "IND"),
	JACKSONVILLE_JAGUARS("Jacksonville", "Jaguars", "JAC"),
	KANSAS_CITY_CHIEFS("Kansas City", "Chiefs", "KC"),
	MIAMI_DOLPHINS("Miami", "Dolphins", "MIA"),
	MINNESOTA_VIKINGS("Minnesota", "Vikings", "MIN"),
	NEW_ENGLAND_PATRIOTS("New England", "Patriots", "NE"),
	NEW_ORLEANS_SAINTS("New Orleans", "Saints", "NO"),
	NEW_YORK_GIANTS("New York", "Giants", "NYG"),
	NEW_YORK_JETS("New York", "Jets", "NYJ"),
	OAKLAND_RAIDERS("Oakland", "Raiders", "OAK"),
	PHILADELPHIA_EAGLES("Philadelphia", "Eagles", "PHI"),
	PITTSBURGH_STEELERS("Pittsburgh", "Steelers", "PIT"),
	SAN_DIEGO_CHARGERS("San Diego", "Chargers", "SD"),
	SEATTLE_SEAHAWKS("Seattle", "Seahawks", "SEA"),
	SAN_FRANCISCO_49ERS("San Francisco", "49ers", "SF"),
	ST_LOUIS_RAMS("St. Louis", "Rams", "STL"),
	TAMPA_BAY_BUCCANEERS("Tampa Bay", "Buccaneers", "TB"),
	TENNESSEE_TITANS("Tennessee", "Titans", "TEN"),
	WASHINGTON_REDSKINS("Washington", "Redskins", "WAS");

	private String city;
	private String name;
	private String abbrev;

	private NFLTeam(final String city, final String name, final String abbrev) {
		this.city = city;
		this.name = name;
		this.abbrev = abbrev;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public String getAbbrev() {
		return abbrev;
	}

	public static NFLTeam fromAbbrev(final String abbrev) {
		final Optional<NFLTeam> result = Arrays.stream(values())
				.filter((team) -> team.getAbbrev().equalsIgnoreCase(abbrev)).findAny();
		return result.isPresent() ? result.get() : null;
	}
}
