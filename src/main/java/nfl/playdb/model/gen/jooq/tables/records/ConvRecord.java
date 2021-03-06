/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Conv;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * 2 Point Conversion Attempts (Y=Success, N=Fail)
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConvRecord extends TableRecordImpl<ConvRecord> implements Record6<Integer, String, String, String, String, Byte> {

	private static final long serialVersionUID = 1964356381;

	/**
	 * Setter for <code>nfl_plays.conv.pid</code>.
	 */
	public void setPid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.conv.pid</code>.
	 */
	public Integer getPid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.conv.type</code>.
	 */
	public void setType(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.conv.type</code>.
	 */
	public String getType() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>nfl_plays.conv.bc</code>.
	 */
	public void setBc(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nfl_plays.conv.bc</code>.
	 */
	public String getBc() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>nfl_plays.conv.psr</code>.
	 */
	public void setPsr(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nfl_plays.conv.psr</code>.
	 */
	public String getPsr() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>nfl_plays.conv.trg</code>.
	 */
	public void setTrg(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nfl_plays.conv.trg</code>.
	 */
	public String getTrg() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>nfl_plays.conv.conv</code>.
	 */
	public void setConv(Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nfl_plays.conv.conv</code>.
	 */
	public Byte getConv() {
		return (Byte) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, String, Byte> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, String, String, Byte> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Conv.CONV.PID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Conv.CONV.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Conv.CONV.BC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Conv.CONV.PSR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Conv.CONV.TRG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field6() {
		return Conv.CONV.CONV_;
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
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getBc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPsr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getTrg();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value6() {
		return getConv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord value1(Integer value) {
		setPid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord value2(String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord value3(String value) {
		setBc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord value4(String value) {
		setPsr(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord value5(String value) {
		setTrg(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord value6(Byte value) {
		setConv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ConvRecord values(Integer value1, String value2, String value3, String value4, String value5, Byte value6) {
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
	 * Create a detached ConvRecord
	 */
	public ConvRecord() {
		super(Conv.CONV);
	}

	/**
	 * Create a detached, initialised ConvRecord
	 */
	public ConvRecord(Integer pid, String type, String bc, String psr, String trg, Byte conv) {
		super(Conv.CONV);

		setValue(0, pid);
		setValue(1, type);
		setValue(2, bc);
		setValue(3, psr);
		setValue(4, trg);
		setValue(5, conv);
	}
}
