package nfl.playdb.dao;

import java.util.LinkedList;
import java.util.List;

import nfl.playdb.model.Matchup;
import nfl.playdb.model.NFLTeam;
import nfl.playdb.model.NFLWeek;
import nfl.playdb.model.Stadium;
import nfl.playdb.model.Weather;
import nfl.playdb.model.WeatherCondition;
import nfl.playdb.model.WindDirection;
import nfl.playdb.model.gen.jooq.tables.Game;
import nfl.playdb.model.gen.jooq.tables.records.GameRecord;

import org.springframework.stereotype.Component;

@Component
public class GameDAO extends PlayDBDAO<Game> {

	public GameDAO() {
		super(Game.GAME);
	}

	public List<String> findDistinctStadiumNames() {
		final List<String> stadiums = dslCtx.selectDistinct(table().STAD).from(table()).fetch(table().STAD);
		return stadiums;
	}

	public List<String> findDistinctWeatherConditions() {
		final List<String> conditions = dslCtx.selectDistinct(table().COND).from(table()).fetch(table().COND);
		return conditions;
	}

	public List<String> findDistinctWindDirections() {
		final List<String> directions = dslCtx.selectDistinct(table().WDIR).from(table()).fetch(table().WDIR);
		return directions;
	}

	public List<Matchup> retrieveMatchupsForWeek(final NFLWeek week) {
		final List<Matchup> matchups = new LinkedList<>();
		dslCtx.selectFrom(table())
//				.from(table())
				.where(table().SEAS.eq(week.getSeason()), table().WK.eq((byte) week.getWeek()))
//				.fetch().forEach(record -> record.);
				.fetch().stream().forEach(record -> matchups.add(toMatchup(record, week)));

		return matchups;
	}

	private Matchup toMatchup(final GameRecord record, final NFLWeek week) {
		final Matchup matchup = new Matchup(
				NFLTeam.fromAbbrev(record.getH()),
				NFLTeam.fromAbbrev(record.getV()),
				week,
				Stadium.fromString(record.getStad()),
				new Weather(
						record.getTemp(),
						record.getHumd(),
						record.getWspd(),
						WindDirection.fromString(record.getWdir()),
						WeatherCondition.fromString(record.getCond())
				),
				record.getOu().intValue(),
				record.getSprv().doubleValue()
		);

		return matchup;
	}
}
