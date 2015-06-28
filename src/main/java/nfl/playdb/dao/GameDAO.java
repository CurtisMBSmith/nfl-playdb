package nfl.playdb.dao;

import java.util.List;

import nfl.playdb.model.gen.jooq.tables.Game;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameDAO {

	@Autowired
	private DSLContext dslCtx;

	public List<String> findDistinctStadiumNames() {
		final List<String> stadiums = dslCtx.selectDistinct(Game.GAME.STAD).from(Game.GAME).fetch(Game.GAME.STAD);

		return stadiums;
	}
}
