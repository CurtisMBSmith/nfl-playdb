/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.Keys;
import nfl.playdb.model.gen.jooq.NflPlays;
import nfl.playdb.model.gen.jooq.tables.records.RedzoneRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Redzone extends TableImpl<RedzoneRecord> {

	private static final long serialVersionUID = -300105830;

	/**
	 * The reference instance of <code>nfl_plays.redzone</code>
	 */
	public static final Redzone REDZONE = new Redzone();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RedzoneRecord> getRecordType() {
		return RedzoneRecord.class;
	}

	/**
	 * The column <code>nfl_plays.redzone.uid</code>.
	 */
	public final TableField<RedzoneRecord, Integer> UID = createField("uid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.gid</code>.
	 */
	public final TableField<RedzoneRecord, Integer> GID = createField("gid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.player</code>.
	 */
	public final TableField<RedzoneRecord, String> PLAYER = createField("player", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.pa</code>.
	 */
	public final TableField<RedzoneRecord, Byte> PA = createField("pa", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.pc</code>.
	 */
	public final TableField<RedzoneRecord, Byte> PC = createField("pc", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.py</code>.
	 */
	public final TableField<RedzoneRecord, Integer> PY = createField("py", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.int</code>.
	 */
	public final TableField<RedzoneRecord, Byte> INT = createField("int", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.ra</code>.
	 */
	public final TableField<RedzoneRecord, Byte> RA = createField("ra", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.sra</code>.
	 */
	public final TableField<RedzoneRecord, Byte> SRA = createField("sra", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.ry</code>.
	 */
	public final TableField<RedzoneRecord, Integer> RY = createField("ry", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.trg</code>.
	 */
	public final TableField<RedzoneRecord, Byte> TRG = createField("trg", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.rec</code>.
	 */
	public final TableField<RedzoneRecord, Byte> REC = createField("rec", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.recy</code>.
	 */
	public final TableField<RedzoneRecord, Integer> RECY = createField("recy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.fuml</code>.
	 */
	public final TableField<RedzoneRecord, Byte> FUML = createField("fuml", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.redzone.peny</code>.
	 */
	public final TableField<RedzoneRecord, Byte> PENY = createField("peny", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * Create a <code>nfl_plays.redzone</code> table reference
	 */
	public Redzone() {
		this("redzone", null);
	}

	/**
	 * Create an aliased <code>nfl_plays.redzone</code> table reference
	 */
	public Redzone(String alias) {
		this(alias, REDZONE);
	}

	private Redzone(String alias, Table<RedzoneRecord> aliased) {
		this(alias, aliased, null);
	}

	private Redzone(String alias, Table<RedzoneRecord> aliased, Field<?>[] parameters) {
		super(alias, NflPlays.NFL_PLAYS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RedzoneRecord>> getKeys() {
		return Arrays.<UniqueKey<RedzoneRecord>>asList(Keys.KEY_REDZONE_UID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Redzone as(String alias) {
		return new Redzone(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Redzone rename(String name) {
		return new Redzone(name, null);
	}
}
