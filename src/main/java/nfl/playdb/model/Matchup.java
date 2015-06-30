package nfl.playdb.model;

public class Matchup {

	private final NFLTeam home;
	private final NFLTeam away;
	private final NFLWeek week;
	private final Stadium stadium;
	private final Weather weatherConditions;
//	private Surface surface;
	private final int overUnder;
	private final double visitorPtsSpread;

	public Matchup(final NFLTeam home, final NFLTeam away, final NFLWeek week, final Stadium stadium,
			final Weather weatherConditions, final int overUnder, final double visitorPtsSpread) {
		this.home = home;
		this.away = away;
		this.week = week;
		this.stadium = stadium;
		this.weatherConditions = weatherConditions;
		this.overUnder = overUnder;
		this.visitorPtsSpread = visitorPtsSpread;
	}

	public NFLTeam getHome() {
		return home;
	}

	public NFLTeam getAway() {
		return away;
	}

	public NFLWeek getWeek() {
		return week;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public Weather getWeatherConditions() {
		return weatherConditions;
	}

	public int getOverUnder() {
		return overUnder;
	}

	public double getVisitorPtsSpread() {
		return visitorPtsSpread;
	}

}
