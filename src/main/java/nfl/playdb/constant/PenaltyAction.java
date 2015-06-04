package nfl.playdb.constant;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum PenaltyAction {

	DECLINED('D'),
	OFFSETTIG('O'),
	ACCEPTED('A');

	/**
	 * The database value associated with this PenaltyAction.
	 */
	private final char value;

	private PenaltyAction(final char val) {
		value = val;
	}

	/**
	 * Gets the database value of this PenaltyAction.
	 *
	 * @return The value field of this PenaltyAction.
	 */
	public char getValue() {
		return value;
	}

	/**
	 * Returns the PenaltyAction associated with the given character.
	 *
	 * @param val The character associated with a PenaltyAction.
	 * @return The PenaltyAction associated with the character parameter, or
	 * null if no such action exists.
	 */
	public Optional<PenaltyAction> fromChar(final char val) {
		return Arrays.stream(values()).filter(new Predicate<PenaltyAction>() {
			@Override
			public boolean test(final PenaltyAction action) {
				return action.getValue() == val;
			}
		}).findFirst();
	}
}
