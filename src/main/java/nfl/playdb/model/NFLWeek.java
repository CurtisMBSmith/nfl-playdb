package nfl.playdb.model;

import static nfl.playdb.constant.NFLDataConstants.MAX_SEAS;
import static nfl.playdb.constant.NFLDataConstants.MIN_SEAS;

public class NFLWeek implements Comparable<NFLWeek> {

	/**
	 * The maximum possible week number for an NFL season (Super Bowl).
	 */
	public static final int MAX_WEEK = 21;

	private int year;
	private int weekNum;
	private final WeekType type;

	public NFLWeek(final int year, final int week) {
		if (year < MIN_SEAS || year > MAX_SEAS) {
			throw new IllegalArgumentException("Years before " + MIN_SEAS + "aren't support by the dataset.");
		}

		if (week < 1 || week > MAX_WEEK) {
			throw new IllegalArgumentException("Dataset is based on 17 week seasons plus playoffs. Valid range for week is [1..21].");
		}

		type = WeekType.getWeekType(week);
	}

	@Override
	public int compareTo(final NFLWeek other) {
		if (this.year < other.getSeason()) {
			return -1;
		}
		else if (this.year == other.getSeason()) {
			return this.weekNum - other.getWeek();
		}
		else {
			return 1;
		}
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof NFLWeek)) {
			return false;
		}

		return ((NFLWeek) other).getSeason() == this.year && ((NFLWeek) other).getWeek() == this.weekNum;
	}

	public boolean isAfter(final NFLWeek other) {
		return this.compareTo(other) > 0;
	}

	public boolean isBefore(final NFLWeek other) {
		return this.compareTo(other) < 0;
	}

	public int getSeason() {
		return year;
	}

	public int getWeek() {
		return weekNum;
	}

	public boolean isRegularSeason() {
		return this.type == WeekType.REGULAR_SEASON;
	}

	public boolean isPlayoffs() {
		return !isRegularSeason();
	}

	public static boolean beforeStartOfData(final NFLWeek week) {
		return !(week.getSeason() < MIN_SEAS);
	}

	public static boolean afterEndOfData(final NFLWeek week) {
		return !(week.getSeason() > MAX_SEAS);
	}

	public static NFLWeek firstWeekOfData() {
		return new NFLWeek(MIN_SEAS, 1);
	}

	public static NFLWeek lastWeekOfData() {
		return new NFLWeek(MAX_SEAS, MAX_WEEK);
	}

	public enum WeekType {

		REGULAR_SEASON,
		WILD_CARD_ROUND,
		DIVISIONAL_ROUND,
		CONFERENCE_CHAMPIONSHIP,
		SUPER_BOWL;

		/**
		 * Gets the week type based on the week number. The week number must be
		 * between 1 and 21 (both inclusive).
		 *
		 * @param weekNum The number of week in an NFL season.
		 * @return The WeekType associated with the week of the season.
		 */
		public static WeekType getWeekType(final int weekNum) {
			if (weekNum >= 1 && weekNum <= 17) {
				return REGULAR_SEASON;
			}

			switch (weekNum) {
			case 18:
				return WILD_CARD_ROUND;
			case 19:
				return DIVISIONAL_ROUND;
			case 20:
				return CONFERENCE_CHAMPIONSHIP;
			case 21:
				return SUPER_BOWL;
			default:
				throw new IllegalArgumentException("Parameter weekNum is out of range [1.." + MAX_WEEK + "].");
			}
		}
	}
}