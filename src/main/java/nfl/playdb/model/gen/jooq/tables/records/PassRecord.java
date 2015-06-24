/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Pass;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class PassRecord extends TableRecordImpl<PassRecord> implements Record9<Integer, String, String, String, Byte, Byte, Byte, Byte, String> {

	private static final long serialVersionUID = -1003954247;

	/**
	 * Setter for <code>nfl_plays.pass.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.pass.psr</code>.
	 */
	public void setPsr(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.psr</code>.
	 */
	public String getPsr() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>nfl_plays.pass.trg</code>.
	 */
	public void setTrg(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.trg</code>.
	 */
	public String getTrg() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>nfl_plays.pass.loc</code>.
	 */
	public void setLoc(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.loc</code>.
	 */
	public String getLoc() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>nfl_plays.pass.yds</code>.
	 */
	public void setYds(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.yds</code>.
	 */
	public Byte getYds() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>nfl_plays.pass.comp</code>.
	 */
	public void setComp(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.comp</code>.
	 */
	public Byte getComp() {
		return (Byte) getValue(5);
	}

	/**
	 * Setter for <code>nfl_plays.pass.succ</code>.
	 */
	public void setSucc(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.succ</code>.
	 */
	public Byte getSucc() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>nfl_plays.pass.spk</code>.
	 */
	public void setSpk(Byte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.spk</code>.
	 */
	public Byte getSpk() {
		return (Byte) getValue(7);
	}

	/**
	 * Setter for <code>nfl_plays.pass.dfb</code>.
	 */
	public void setDfb(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>nfl_plays.pass.dfb</code>.
	 */
	public String getDfb() {
		return (String) getValue(8);
	}

	// -------------------------------------------------------------------------
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, String, String, String, Byte, Byte, Byte, Byte, String> fieldsRow() {
		return (Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row9<Integer, String, String, String, Byte, Byte, Byte, Byte, String> valuesRow() {
		return (Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Pass.PASS.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Pass.PASS.PSR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Pass.PASS.TRG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Pass.PASS.LOC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return Pass.PASS.YDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return Pass.PASS.COMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field7() {
		return Pass.PASS.SUCC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field8() {
		return Pass.PASS.SPK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return Pass.PASS.DFB;
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
		return getPsr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTrg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getLoc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getYds();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getComp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value7() {
		return getSucc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value8() {
		return getSpk();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getDfb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value1(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value2(String value) {
		setPsr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value3(String value) {
		setTrg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value4(String value) {
		setLoc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value5(Byte value) {
		setYds(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value6(Byte value) {
		setComp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value7(Byte value) {
		setSucc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value8(Byte value) {
		setSpk(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord value9(String value) {
		setDfb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PassRecord values(Integer value1, String value2, String value3, String value4, Byte value5, Byte value6, Byte value7, Byte value8, String value9) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PassRecord
	 */
	public PassRecord() {
		super(Pass.PASS);
	}

	/**
	 * Create a detached, initialised PassRecord
	 */
	public PassRecord(Integer pid, String psr, String trg, String loc, Byte yds, Byte comp, Byte succ, Byte spk, String dfb) {
		super(Pass.PASS);

		setValue(0, pid);
		setValue(1, psr);
		setValue(2, trg);
		setValue(3, loc);
		setValue(4, yds);
		setValue(5, comp);
		setValue(6, succ);
		setValue(7, spk);
		setValue(8, dfb);
	}
}
