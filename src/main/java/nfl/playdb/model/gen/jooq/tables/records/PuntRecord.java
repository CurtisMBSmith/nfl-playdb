/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Punt;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PuntRecord extends TableRecordImpl<PuntRecord> implements Record8<Integer, String, Byte, Byte, Byte, String, Byte, Byte> {

	private static final long serialVersionUID = -302738707;

	/**
	 * Setter for <code>nfl_plays.punt.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.punt.punter</code>.
	 */
	public void setPunter(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.punter</code>.
	 */
	public String getPunter() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>nfl_plays.punt.pgro</code>.
	 */
	public void setPgro(Byte value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.pgro</code>.
	 */
	public Byte getPgro() {
		return (Byte) getValue(2);
	}

	/**
	 * Setter for <code>nfl_plays.punt.pnet</code>.
	 */
	public void setPnet(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.pnet</code>.
	 */
	public Byte getPnet() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>nfl_plays.punt.ptb</code>.
	 */
	public void setPtb(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.ptb</code>.
	 */
	public Byte getPtb() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>nfl_plays.punt.pr</code>.
	 */
	public void setPr(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.pr</code>.
	 */
	public String getPr() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>nfl_plays.punt.pry</code>.
	 */
	public void setPry(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.pry</code>.
	 */
	public Byte getPry() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>nfl_plays.punt.pfc</code>.
	 */
	public void setPfc(Byte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>nfl_plays.punt.pfc</code>.
	 */
	public Byte getPfc() {
		return (Byte) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, Byte, Byte, Byte, String, Byte, Byte> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<Integer, String, Byte, Byte, Byte, String, Byte, Byte> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Punt.PUNT.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Punt.PUNT.PUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field3() {
		return Punt.PUNT.PGRO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return Punt.PUNT.PNET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field5() {
		return Punt.PUNT.PTB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Punt.PUNT.PR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field7() {
		return Punt.PUNT.PRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field8() {
		return Punt.PUNT.PFC;
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
		return getPunter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value3() {
		return getPgro();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getPnet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value5() {
		return getPtb();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getPr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value7() {
		return getPry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value8() {
		return getPfc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value1(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value2(String value) {
		setPunter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value3(Byte value) {
		setPgro(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value4(Byte value) {
		setPnet(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value5(Byte value) {
		setPtb(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value6(String value) {
		setPr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value7(Byte value) {
		setPry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord value8(Byte value) {
		setPfc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PuntRecord values(Integer value1, String value2, Byte value3, Byte value4, Byte value5, String value6, Byte value7, Byte value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PuntRecord
	 */
	public PuntRecord() {
		super(Punt.PUNT);
	}

	/**
	 * Create a detached, initialised PuntRecord
	 */
	public PuntRecord(Integer pid, String punter, Byte pgro, Byte pnet, Byte ptb, String pr, Byte pry, Byte pfc) {
		super(Punt.PUNT);

		setValue(0, pid);
		setValue(1, punter);
		setValue(2, pgro);
		setValue(3, pnet);
		setValue(4, ptb);
		setValue(5, pr);
		setValue(6, pry);
		setValue(7, pfc);
	}
}