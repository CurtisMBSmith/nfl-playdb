package nfl.playdb.dao;

import java.util.List;

import nfl.playdb.model.gen.jooq.tables.Team;

import org.springframework.stereotype.Component;

@Component
public class TeamDAO extends PlayDBDAO<Team> {

	public TeamDAO() {
		super(Team.TEAM);
	}

	public List<String> findDistinctTeamAbbreviations() {
		final List<String> stadiums = dslCtx.selectDistinct(table().TNAME).from(table()).fetch(table().TNAME);

		return stadiums;
	}
}
