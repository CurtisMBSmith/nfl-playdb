package nfl.playdb.dao;

import java.util.List;

import nfl.playdb.model.gen.jooq.tables.Game;

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
}
