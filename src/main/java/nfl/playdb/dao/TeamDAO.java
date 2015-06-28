package nfl.playdb.dao;

import java.util.List;

import nfl.playdb.model.gen.jooq.tables.Team;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamDAO {

	@Autowired
	private DSLContext dslCtx;

	public List<String> findDistinctTeamAbbreviations() {
		final List<String> stadiums = dslCtx.selectDistinct(Team.TEAM.TNAME).from(Team.TEAM).fetch(Team.TEAM.TNAME);

		return stadiums;
	}
}
