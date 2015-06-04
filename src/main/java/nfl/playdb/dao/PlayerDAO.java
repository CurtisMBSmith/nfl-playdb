package nfl.playdb.dao;

import nfl.playdb.model.gen.Player;

import org.springframework.data.repository.Repository;

public interface PlayerDAO extends Repository<Player, String> {

	Player findOne(String id);
}
