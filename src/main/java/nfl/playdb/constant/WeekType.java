package nfl.playdb.constant;

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
		if (weekNum >= MIN_WEEK && weekNum <= 17) {
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
			throw new IllegalArgumentException("Parameter weekNum is out of range [" + MIN_WEEK + ".." + MAX_WEEK + "].");
		}
	}

	public static final int MIN_WEEK = 1;
	public static final int MAX_WEEK = 21;
}
