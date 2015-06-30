package nfl.playdb.model;

public class NFLWeekRange {

	private final NFLWeek start;
	private final NFLWeek end;

	public NFLWeekRange(final NFLWeek start, final NFLWeek end) {
		this.start = start;
		this.end = end;

		if (this.start.isAfter(this.end)) {
			throw new IllegalArgumentException("Start must not be after end and both must be in the data range.");
		}
	}

	public NFLWeek getStart() {
		return start;
	}

	public NFLWeek getEnd() {
		return end;
	}
}
