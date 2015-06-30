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

import org.jooq.Record;
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
		dslCtx.select(table().fields())
				.from(table())
				.where(table().SEAS.eq(week.getSeason()), table().WK.eq((byte) week.getWeek()))
//				.fetch().forEach(record -> record.);
				.fetch().stream().forEach(record -> matchups.add(toMatchup(record, week)));

		return matchups;
	}

	private Matchup toMatchup(final Record record, final NFLWeek week) {
		final Matchup matchup = new Matchup(
				NFLTeam.fromAbbrev(record.getValue(table().H)),
				NFLTeam.fromAbbrev(record.getValue(table().V)),
				week,
				Stadium.fromString(record.getValue(table().STAD)),
				new Weather(
						record.getValue(table().TEMP),
						record.getValue(table().HUMD),
						record.getValue(table().WSPD),
						WindDirection.fromString(record.getValue(table().WDIR)),
						WeatherCondition.fromString(record.getValue(table().COND))
				),
				record.getValue(table().OU).intValue(),
				record.getValue(table().SPRV).doubleValue()
		);

		return matchup;
	}
}
