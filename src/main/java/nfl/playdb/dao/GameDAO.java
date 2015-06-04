package nfl.playdb.dao;

import nfl.playdb.model.gen.Game;

import org.springframework.data.repository.Repository;

public interface GameDAO extends Repository<Game, Integer> {

}
