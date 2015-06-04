package nfl.playdb.dao;

import nfl.playdb.model.gen.Team;

import org.springframework.data.repository.Repository;

public interface TeamDAO extends Repository<Team, Integer> {

}
