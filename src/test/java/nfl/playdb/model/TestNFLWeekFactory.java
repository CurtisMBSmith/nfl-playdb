package nfl.playdb.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import nfl.playdb.builders.NFLWeekFactory;
import nfl.playdb.config.NFLPlayDBConfig;
import nfl.playdb.model.NFLWeek.WeekType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {NFLPlayDBConfig.class})
public class TestNFLWeekFactory {

	@Autowired
	private NFLWeekFactory weekFactory;

	@Test
	public void testRetrieveSuperBowl48() {
		final NFLWeek sb48 = weekFactory.buildWeek(2013, 21);
		assertTrue("Week not marked as playoff week.", sb48.isPlayoffs());
		assertEquals("Week is not the superbowl.", WeekType.SUPER_BOWL, sb48.getWeekType());

		final List<Matchup> matchups = sb48.getMatchups();
		assertEquals("Incorrect number of matchups", 1, matchups.size());
		final Matchup matchup = matchups.get(0);

		assertEquals("Home team not what was expected.", NFLTeam.DENVER_BRONCOS, matchup.getHome());
		assertEquals("Away team not what was expected.", NFLTeam.SEATTLE_SEAHAWKS, matchup.getAway());
		assertEquals("Stadium not what was expected.", Stadium.METLIFE_STADIUM, matchup.getStadium());
	}
}
