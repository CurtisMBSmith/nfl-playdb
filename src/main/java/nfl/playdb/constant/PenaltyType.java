package nfl.playdb.constant;

public enum PenaltyType {

	FALSE_START,
	OFFENSIVE_HOLDING,
	PLAY_BOOK_EXECUTION,
	DEFENSIVE_LINE,
	DEFENSIVE_SECONDARY,
	DUMB,
	POOR_FUNDAMENTALS,
	OTHER;

	/**
	 * Retrieves the PenaltyType of the value of the database field. The possible
	 * values range from 1-8.
	 *
	 * @param value
	 * @return The PenaltyType corresponding to the
	 * @throws IllegalArgumentException If the parameter is not in the range from
	 * 1 to 8.
	 */
	public PenaltyType valueOf(final int value) {
		if (value < 1 || value > 8) {
			throw new IllegalArgumentException("Value " + value + " is not within the range from 1 to 8.");
		}
		return values()[value - 1];
	}
}
