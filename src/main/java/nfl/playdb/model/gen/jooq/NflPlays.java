/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Block;
import nfl.playdb.model.gen.jooq.tables.Conv;
import nfl.playdb.model.gen.jooq.tables.Defense;
import nfl.playdb.model.gen.jooq.tables.Drive;
import nfl.playdb.model.gen.jooq.tables.Fgxp;
import nfl.playdb.model.gen.jooq.tables.Fumble;
import nfl.playdb.model.gen.jooq.tables.Game;
import nfl.playdb.model.gen.jooq.tables.Intercpt;
import nfl.playdb.model.gen.jooq.tables.Kicker;
import nfl.playdb.model.gen.jooq.tables.Koff;
import nfl.playdb.model.gen.jooq.tables.Offense;
import nfl.playdb.model.gen.jooq.tables.Oline;
import nfl.playdb.model.gen.jooq.tables.Pass;
import nfl.playdb.model.gen.jooq.tables.Penalty;
import nfl.playdb.model.gen.jooq.tables.Play;
import nfl.playdb.model.gen.jooq.tables.Player;
import nfl.playdb.model.gen.jooq.tables.Punt;
import nfl.playdb.model.gen.jooq.tables.Redzone;
import nfl.playdb.model.gen.jooq.tables.Rush;
import nfl.playdb.model.gen.jooq.tables.Sack;
import nfl.playdb.model.gen.jooq.tables.Safety;
import nfl.playdb.model.gen.jooq.tables.Tackle;
import nfl.playdb.model.gen.jooq.tables.Team;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NflPlays extends SchemaImpl {

	private static final long serialVersionUID = 39613072;

	/**
	 * The reference instance of <code>nfl_plays</code>
	 */
	public static final NflPlays NFL_PLAYS = new NflPlays();

	/**
	 * No further instances allowed
	 */
	private NflPlays() {
		super("nfl_plays");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Block.BLOCK,
			Conv.CONV,
			Defense.DEFENSE,
			Drive.DRIVE,
			Fgxp.FGXP,
			Fumble.FUMBLE,
			Game.GAME,
			Intercpt.INTERCPT,
			Kicker.KICKER,
			Koff.KOFF,
			Offense.OFFENSE,
			Oline.OLINE,
			Pass.PASS,
			Penalty.PENALTY,
			Play.PLAY,
			Player.PLAYER,
			Punt.PUNT,
			Redzone.REDZONE,
			Rush.RUSH,
			Sack.SACK,
			Safety.SAFETY,
			Tackle.TACKLE,
			Team.TEAM);
	}
}
