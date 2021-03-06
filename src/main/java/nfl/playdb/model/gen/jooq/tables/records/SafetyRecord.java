/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Safety;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class SafetyRecord extends TableRecordImpl<SafetyRecord> implements Record2<Integer, String> {

	private static final long serialVersionUID = -1517354794;

	/**
	 * Setter for <code>nfl_plays.safety.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.safety.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.safety.saf</code>.
	 */
	public void setSaf(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.safety.saf</code>.
	 */
	public String getSaf() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Safety.SAFETY.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Safety.SAFETY.SAF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getSaf();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SafetyRecord value1(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SafetyRecord value2(String value) {
		setSaf(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SafetyRecord values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SafetyRecord
	 */
	public SafetyRecord() {
		super(Safety.SAFETY);
	}

	/**
	 * Create a detached, initialised SafetyRecord
	 */
	public SafetyRecord(Integer pid, String saf) {
		super(Safety.SAFETY);

		setValue(0, pid);
		setValue(1, saf);
	}
}
