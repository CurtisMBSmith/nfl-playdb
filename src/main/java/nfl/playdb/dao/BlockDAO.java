package nfl.playdb.dao;

import nfl.playdb.model.gen.Defense;

import org.springframework.data.repository.Repository;

public interface BlockDAO extends Repository<Defense, Integer> {

}
