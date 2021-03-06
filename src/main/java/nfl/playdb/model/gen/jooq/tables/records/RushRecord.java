/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Rush;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class RushRecord extends TableRecordImpl<RushRecord> implements Record6<Integer, String, String, Byte, Byte, Byte> {

	private static final long serialVersionUID = 543086255;

	/**
	 * Setter for <code>nfl_plays.rush.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.rush.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.rush.bc</code>.
	 */
	public void setBc(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.rush.bc</code>.
	 */
	public String getBc() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>nfl_plays.rush.dir</code>.
	 */
	public void setDir(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nfl_plays.rush.dir</code>.
	 */
	public String getDir() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>nfl_plays.rush.yds</code>.
	 */
	public void setYds(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nfl_plays.rush.yds</code>.
	 */
	public Byte getYds() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>nfl_plays.rush.succ</code>.
	 */
	public void setSucc(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nfl_plays.rush.succ</code>.
	 */
	public Byte getSucc() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>nfl_plays.rush.kne</code>.
	 */
	public void setKne(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nfl_plays.rush.kne</code>.
	 */
	public Byte getKne() {
		return (Byte) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Byte, Byte, Byte> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Byte, Byte, Byte> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Rush.RUSH.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Rush.RUSH.BC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Rush.RUSH.DIR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return Rush.RUSH.YDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return Rush.RUSH.SUCC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return Rush.RUSH.KNE;
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
		return getBc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getDir();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getYds();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getSucc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getKne();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord value1(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord value2(String value) {
		setBc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord value3(String value) {
		setDir(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord value4(Byte value) {
		setYds(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord value5(Byte value) {
		setSucc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord value6(Byte value) {
		setKne(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RushRecord values(Integer value1, String value2, String value3, Byte value4, Byte value5, Byte value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RushRecord
	 */
	public RushRecord() {
		super(Rush.RUSH);
	}

	/**
	 * Create a detached, initialised RushRecord
	 */
	public RushRecord(Integer pid, String bc, String dir, Byte yds, Byte succ, Byte kne) {
		super(Rush.RUSH);

		setValue(0, pid);
		setValue(1, bc);
		setValue(2, dir);
		setValue(3, yds);
		setValue(4, succ);
		setValue(5, kne);
	}
}
