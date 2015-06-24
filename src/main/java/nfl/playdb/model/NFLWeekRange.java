package nfl.playdb.model;

import static nfl.playdb.model.NFLWeek.afterEndOfData;
import static nfl.playdb.model.NFLWeek.beforeStartOfData;
import static nfl.playdb.model.NFLWeek.firstWeekOfData;
import static nfl.playdb.model.NFLWeek.lastWeekOfData;

public class NFLWeekRange {

	private final NFLWeek start;
	private final NFLWeek end;

	public NFLWeekRange(NFLWeek start, NFLWeek end) {
		if (beforeStartOfData(start)) {
			start = firstWeekOfData();
		}
		if (beforeStartOfData(end)) {
			end = firstWeekOfData();
		}
		if (afterEndOfData(start)) {
			start = lastWeekOfData();
		}
		if (afterEndOfData(end)) {
			end = lastWeekOfData();
		}

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
