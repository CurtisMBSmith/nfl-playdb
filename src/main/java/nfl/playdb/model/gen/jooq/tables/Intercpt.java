/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.Keys;
import nfl.playdb.model.gen.jooq.NflPlays;
import nfl.playdb.model.gen.jooq.tables.records.IntercptRecord;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * Interceptions
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Intercpt extends TableImpl<IntercptRecord> {

	private static final long serialVersionUID = -110169253;

	/**
	 * The reference instance of <code>nfl_plays.intercpt</code>
	 */
	public static final Intercpt INTERCPT = new Intercpt();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<IntercptRecord> getRecordType() {
		return IntercptRecord.class;
	}

	/**
	 * The column <code>nfl_plays.intercpt.pid</code>.
	 */
	public final TableField<IntercptRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.intercpt.psr</code>.
	 */
	public final TableField<IntercptRecord, String> PSR = createField("psr", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.intercpt.int</code>.
	 */
	public final TableField<IntercptRecord, String> INT = createField("int", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false), this, "");

	/**
	 * The column <code>nfl_plays.intercpt.iry</code>.
	 */
	public final TableField<IntercptRecord, Byte> IRY = createField("iry", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

	/**
	 * Create a <code>nfl_plays.intercpt</code> table reference
	 */
	public Intercpt() {
		this("intercpt", null);
	}

	/**
	 * Create an aliased <code>nfl_plays.intercpt</code> table reference
	 */
	public Intercpt(String alias) {
		this(alias, INTERCPT);
	}

	private Intercpt(String alias, Table<IntercptRecord> aliased) {
		this(alias, aliased, null);
	}

	private Intercpt(String alias, Table<IntercptRecord> aliased, Field<?>[] parameters) {
		super(alias, NflPlays.NFL_PLAYS, aliased, parameters, "Interceptions");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<IntercptRecord>> getKeys() {
		return Arrays.<UniqueKey<IntercptRecord>>asList(Keys.KEY_INTERCPT_PID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Intercpt as(String alias) {
		return new Intercpt(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Intercpt rename(String name) {
		return new Intercpt(name, null);
	}
}