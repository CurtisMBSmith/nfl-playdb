package nfl.playdb.model;

import static org.junit.Assert.assertFalse;

import java.util.List;

import nfl.playdb.config.NFLPlayDBConfig;
import nfl.playdb.dao.GameDAO;
import nfl.playdb.dao.TeamDAO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {NFLPlayDBConfig.class})
public class TestNFLPlayDatasetIntegrity {

	@Autowired
	private GameDAO gameDAO;

	@Autowired
	private TeamDAO teamDAO;

	@Test
	public void verifyAllStadiumsInDatasetHaveEnumValue() {
		final List<String> stadiumsInDataSet = gameDAO.findDistinctStadiumNames();
		assertFalse("One or more stadiums in dataset doesn't have a corrseponding enum value.",
				stadiumsInDataSet.stream().anyMatch((stad) -> Stadium.fromString(stad) == null));
	}

	@Test
	public void verifyAllTeamAbbreviationsInDatasetHaveEnumValue() {
		final List<String> teamsInDataSet = teamDAO.findDistinctTeamAbbreviations();
		assertFalse("One or more teams in dataset doesn't have a corrseponding enum value.",
				teamsInDataSet.stream().anyMatch((team) -> NFLTeam.fromAbbrev(team) == null));
	}

	@Test
	public void verifyAllWeatherConditionsInDatasetHaveEnumValue() {
		final List<String> conditionsInDataSet = gameDAO.findDistinctWeatherConditions();
		assertFalse("One or more weather conditions in dataset doesn't have a corrseponding enum value.",
				conditionsInDataSet.stream().anyMatch((cond) -> !WeatherCondition.fromString(cond).isPresent()));
	}

	@Test
	public void verifyAllWindDirectionsInDatasetHaveEnumValue() {
		final List<String> directionsInDataSet = gameDAO.findDistinctWindDirections();
		assertFalse("One or more wind direction in dataset doesn't have a corrseponding enum value.",
				directionsInDataSet.stream().anyMatch((wdir) -> !WindDirection.fromString(wdir).isPresent()));
	}
}
