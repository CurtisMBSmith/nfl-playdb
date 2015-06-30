package nfl.playdb.builders;

import static nfl.playdb.constant.NFLDataConstants.MAX_SEAS;
import static nfl.playdb.constant.NFLDataConstants.MIN_SEAS;
import static nfl.playdb.model.NFLWeek.MAX_WEEK;
import nfl.playdb.dao.GameDAO;
import nfl.playdb.model.NFLWeek;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NFLWeekFactory {

	@Autowired
	private GameDAO gameDAO;

	public NFLWeek buildWeek(final int seas, final int wk) {
		final NFLWeek week = new NFLWeek(seas, wk);
		week.setMatchups(gameDAO.retrieveMatchupsForWeek(week));

		return week;
	}

	public NFLWeek firstWeekOfData() {
		return buildWeek(MIN_SEAS, 1);
	}

	public NFLWeek lastWeekOfData() {
		return buildWeek(MAX_SEAS, MAX_WEEK);
	}
}
