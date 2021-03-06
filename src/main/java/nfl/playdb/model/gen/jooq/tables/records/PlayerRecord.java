/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Player;

import org.jooq.Field;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class PlayerRecord extends TableRecordImpl<PlayerRecord> implements Record20<String, String, String, String, String, String, Byte, Integer, Integer, BigDecimal, Byte, BigDecimal, Integer, BigDecimal, BigDecimal, Integer, String, String, Integer, String> {

	private static final long serialVersionUID = -593363952;

	/**
	 * Setter for <code>nfl_plays.player.player</code>.
	 */
	public void setPlayer(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.player</code>.
	 */
	public String getPlayer() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.player.fname</code>.
	 */
	public void setFname(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.fname</code>.
	 */
	public String getFname() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>nfl_plays.player.lname</code>.
	 */
	public void setLname(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.lname</code>.
	 */
	public String getLname() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>nfl_plays.player.pname</code>.
	 */
	public void setPname(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.pname</code>.
	 */
	public String getPname() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>nfl_plays.player.pos1</code>.
	 */
	public void setPos1(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.pos1</code>.
	 */
	public String getPos1() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>nfl_plays.player.pos2</code>.
	 */
	public void setPos2(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.pos2</code>.
	 */
	public String getPos2() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>nfl_plays.player.height</code>.
	 */
	public void setHeight(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.height</code>.
	 */
	public Byte getHeight() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>nfl_plays.player.weight</code>.
	 */
	public void setWeight(Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.weight</code>.
	 */
	public Integer getWeight() {
		return (Integer) getValue(7);
	}

	/**
	 * Setter for <code>nfl_plays.player.yob</code>.
	 */
	public void setYob(Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.yob</code>.
	 */
	public Integer getYob() {
		return (Integer) getValue(8);
	}

	/**
	 * Setter for <code>nfl_plays.player.forty</code>.
	 */
	public void setForty(BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.forty</code>.
	 */
	public BigDecimal getForty() {
		return (BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>nfl_plays.player.bench</code>.
	 */
	public void setBench(Byte value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.bench</code>.
	 */
	public Byte getBench() {
		return (Byte) getValue(10);
	}

	/**
	 * Setter for <code>nfl_plays.player.vertical</code>.
	 */
	public void setVertical(BigDecimal value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.vertical</code>.
	 */
	public BigDecimal getVertical() {
		return (BigDecimal) getValue(11);
	}

	/**
	 * Setter for <code>nfl_plays.player.broad</code>.
	 */
	public void setBroad(Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.broad</code>.
	 */
	public Integer getBroad() {
		return (Integer) getValue(12);
	}

	/**
	 * Setter for <code>nfl_plays.player.shuttle</code>.
	 */
	public void setShuttle(BigDecimal value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.shuttle</code>.
	 */
	public BigDecimal getShuttle() {
		return (BigDecimal) getValue(13);
	}

	/**
	 * Setter for <code>nfl_plays.player.cone</code>.
	 */
	public void setCone(BigDecimal value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.cone</code>.
	 */
	public BigDecimal getCone() {
		return (BigDecimal) getValue(14);
	}

	/**
	 * Setter for <code>nfl_plays.player.dpos</code>.
	 */
	public void setDpos(Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.dpos</code>.
	 */
	public Integer getDpos() {
		return (Integer) getValue(15);
	}

	/**
	 * Setter for <code>nfl_plays.player.col</code>.
	 */
	public void setCol(String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.col</code>.
	 */
	public String getCol() {
		return (String) getValue(16);
	}

	/**
	 * Setter for <code>nfl_plays.player.dv</code>.
	 */
	public void setDv(String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.dv</code>.
	 */
	public String getDv() {
		return (String) getValue(17);
	}

	/**
	 * Setter for <code>nfl_plays.player.start</code>.
	 */
	public void setStart(Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.start</code>.
	 */
	public Integer getStart() {
		return (Integer) getValue(18);
	}

	/**
	 * Setter for <code>nfl_plays.player.cteam</code>.
	 */
	public void setCteam(String value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>nfl_plays.player.cteam</code>.
	 */
	public String getCteam() {
		return (String) getValue(19);
	}

	// -------------------------------------------------------------------------
	// Record20 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<String, String, String, String, String, String, Byte, Integer, Integer, BigDecimal, Byte, BigDecimal, Integer, BigDecimal, BigDecimal, Integer, String, String, Integer, String> fieldsRow() {
		return (Row20) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row20<String, String, String, String, String, String, Byte, Integer, Integer, BigDecimal, Byte, BigDecimal, Integer, BigDecimal, BigDecimal, Integer, String, String, Integer, String> valuesRow() {
		return (Row20) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Player.PLAYER.PLAYER_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Player.PLAYER.FNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Player.PLAYER.LNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Player.PLAYER.PNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Player.PLAYER.POS1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Player.PLAYER.POS2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field7() {
		return Player.PLAYER.HEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field8() {
		return Player.PLAYER.WEIGHT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field9() {
		return Player.PLAYER.YOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field10() {
		return Player.PLAYER.FORTY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field11() {
		return Player.PLAYER.BENCH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field12() {
		return Player.PLAYER.VERTICAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field13() {
		return Player.PLAYER.BROAD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field14() {
		return Player.PLAYER.SHUTTLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<BigDecimal> field15() {
		return Player.PLAYER.CONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field16() {
		return Player.PLAYER.DPOS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field17() {
		return Player.PLAYER.COL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field18() {
		return Player.PLAYER.DV;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field19() {
		return Player.PLAYER.START;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field20() {
		return Player.PLAYER.CTEAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getPlayer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPos1();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getPos2();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value7() {
		return getHeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value8() {
		return getWeight();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value9() {
		return getYob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value10() {
		return getForty();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value11() {
		return getBench();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value12() {
		return getVertical();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value13() {
		return getBroad();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value14() {
		return getShuttle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BigDecimal value15() {
		return getCone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value16() {
		return getDpos();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value17() {
		return getCol();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value18() {
		return getDv();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value19() {
		return getStart();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value20() {
		return getCteam();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value1(String value) {
		setPlayer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value2(String value) {
		setFname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value3(String value) {
		setLname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value4(String value) {
		setPname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value5(String value) {
		setPos1(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value6(String value) {
		setPos2(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value7(Byte value) {
		setHeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value8(Integer value) {
		setWeight(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value9(Integer value) {
		setYob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value10(BigDecimal value) {
		setForty(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value11(Byte value) {
		setBench(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value12(BigDecimal value) {
		setVertical(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value13(Integer value) {
		setBroad(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value14(BigDecimal value) {
		setShuttle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value15(BigDecimal value) {
		setCone(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value16(Integer value) {
		setDpos(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value17(String value) {
		setCol(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value18(String value) {
		setDv(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value19(Integer value) {
		setStart(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord value20(String value) {
		setCteam(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlayerRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Integer value8, Integer value9, BigDecimal value10, Byte value11, BigDecimal value12, Integer value13, BigDecimal value14, BigDecimal value15, Integer value16, String value17, String value18, Integer value19, String value20) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		value12(value12);
		value13(value13);
		value14(value14);
		value15(value15);
		value16(value16);
		value17(value17);
		value18(value18);
		value19(value19);
		value20(value20);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PlayerRecord
	 */
	public PlayerRecord() {
		super(Player.PLAYER);
	}

	/**
	 * Create a detached, initialised PlayerRecord
	 */
	public PlayerRecord(String player, String fname, String lname, String pname, String pos1, String pos2, Byte height, Integer weight, Integer yob, BigDecimal forty, Byte bench, BigDecimal vertical, Integer broad, BigDecimal shuttle, BigDecimal cone, Integer dpos, String col, String dv, Integer start, String cteam) {
		super(Player.PLAYER);

		setValue(0, player);
		setValue(1, fname);
		setValue(2, lname);
		setValue(3, pname);
		setValue(4, pos1);
		setValue(5, pos2);
		setValue(6, height);
		setValue(7, weight);
		setValue(8, yob);
		setValue(9, forty);
		setValue(10, bench);
		setValue(11, vertical);
		setValue(12, broad);
		setValue(13, shuttle);
		setValue(14, cone);
		setValue(15, dpos);
		setValue(16, col);
		setValue(17, dv);
		setValue(18, start);
		setValue(19, cteam);
	}
}
