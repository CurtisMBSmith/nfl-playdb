/**
 * This class is generated by jOOQ
 */
package nfl.playdb.model.gen.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import nfl.playdb.model.gen.jooq.tables.Offense;

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
public class OffenseRecord extends TableRecordImpl<OffenseRecord> {

	private static final long serialVersionUID = -204361604;

	/**
	 * Setter for <code>nfl_plays.offense.uid</code>.
	 */
	public void setUid(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.uid</code>.
	 */
	public Integer getUid() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>nfl_plays.offense.gid</code>.
	 */
	public void setGid(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.gid</code>.
	 */
	public Integer getGid() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>nfl_plays.offense.player</code>.
	 */
	public void setPlayer(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.player</code>.
	 */
	public String getPlayer() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>nfl_plays.offense.pa</code>.
	 */
	public void setPa(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.pa</code>.
	 */
	public Byte getPa() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>nfl_plays.offense.pc</code>.
	 */
	public void setPc(Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.pc</code>.
	 */
	public Byte getPc() {
		return (Byte) getValue(4);
	}

	/**
	 * Setter for <code>nfl_plays.offense.py</code>.
	 */
	public void setPy(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.py</code>.
	 */
	public Integer getPy() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>nfl_plays.offense.int</code>.
	 */
	public void setInt(Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.int</code>.
	 */
	public Byte getInt() {
		return (Byte) getValue(6);
	}

	/**
	 * Setter for <code>nfl_plays.offense.tdp</code>.
	 */
	public void setTdp(Byte value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.tdp</code>.
	 */
	public Byte getTdp() {
		return (Byte) getValue(7);
	}

	/**
	 * Setter for <code>nfl_plays.offense.ra</code>.
	 */
	public void setRa(Byte value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.ra</code>.
	 */
	public Byte getRa() {
		return (Byte) getValue(8);
	}

	/**
	 * Setter for <code>nfl_plays.offense.sra</code>.
	 */
	public void setSra(Byte value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.sra</code>.
	 */
	public Byte getSra() {
		return (Byte) getValue(9);
	}

	/**
	 * Setter for <code>nfl_plays.offense.ry</code>.
	 */
	public void setRy(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.ry</code>.
	 */
	public Integer getRy() {
		return (Integer) getValue(10);
	}

	/**
	 * Setter for <code>nfl_plays.offense.tdr</code>.
	 */
	public void setTdr(Byte value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.tdr</code>.
	 */
	public Byte getTdr() {
		return (Byte) getValue(11);
	}

	/**
	 * Setter for <code>nfl_plays.offense.trg</code>.
	 */
	public void setTrg(Byte value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.trg</code>.
	 */
	public Byte getTrg() {
		return (Byte) getValue(12);
	}

	/**
	 * Setter for <code>nfl_plays.offense.rec</code>.
	 */
	public void setRec(Byte value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.rec</code>.
	 */
	public Byte getRec() {
		return (Byte) getValue(13);
	}

	/**
	 * Setter for <code>nfl_plays.offense.recy</code>.
	 */
	public void setRecy(Integer value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.recy</code>.
	 */
	public Integer getRecy() {
		return (Integer) getValue(14);
	}

	/**
	 * Setter for <code>nfl_plays.offense.tdre</code>.
	 */
	public void setTdre(Byte value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.tdre</code>.
	 */
	public Byte getTdre() {
		return (Byte) getValue(15);
	}

	/**
	 * Setter for <code>nfl_plays.offense.fuml</code>.
	 */
	public void setFuml(Byte value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.fuml</code>.
	 */
	public Byte getFuml() {
		return (Byte) getValue(16);
	}

	/**
	 * Setter for <code>nfl_plays.offense.peny</code>.
	 */
	public void setPeny(Byte value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.peny</code>.
	 */
	public Byte getPeny() {
		return (Byte) getValue(17);
	}

	/**
	 * Setter for <code>nfl_plays.offense.plays</code>.
	 */
	public void setPlays(Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.plays</code>.
	 */
	public Integer getPlays() {
		return (Integer) getValue(18);
	}

	/**
	 * Setter for <code>nfl_plays.offense.fpts</code>.
	 */
	public void setFpts(BigDecimal value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.fpts</code>.
	 */
	public BigDecimal getFpts() {
		return (BigDecimal) getValue(19);
	}

	/**
	 * Setter for <code>nfl_plays.offense.game</code>.
	 */
	public void setGame(Byte value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.game</code>.
	 */
	public Byte getGame() {
		return (Byte) getValue(20);
	}

	/**
	 * Setter for <code>nfl_plays.offense.seas</code>.
	 */
	public void setSeas(Byte value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.seas</code>.
	 */
	public Byte getSeas() {
		return (Byte) getValue(21);
	}

	/**
	 * Setter for <code>nfl_plays.offense.year</code>.
	 */
	public void setYear(Integer value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.year</code>.
	 */
	public Integer getYear() {
		return (Integer) getValue(22);
	}

	/**
	 * Setter for <code>nfl_plays.offense.team</code>.
	 */
	public void setTeam(String value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>nfl_plays.offense.team</code>.
	 */
	public String getTeam() {
		return (String) getValue(23);
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OffenseRecord
	 */
	public OffenseRecord() {
		super(Offense.OFFENSE);
	}

	/**
	 * Create a detached, initialised OffenseRecord
	 */
	public OffenseRecord(Integer uid, Integer gid, String player, Byte pa, Byte pc, Integer py, Byte int_, Byte tdp, Byte ra, Byte sra, Integer ry, Byte tdr, Byte trg, Byte rec, Integer recy, Byte tdre, Byte fuml, Byte peny, Integer plays, BigDecimal fpts, Byte game, Byte seas, Integer year, String team) {
		super(Offense.OFFENSE);

		setValue(0, uid);
		setValue(1, gid);
		setValue(2, player);
		setValue(3, pa);
		setValue(4, pc);
		setValue(5, py);
		setValue(6, int_);
		setValue(7, tdp);
		setValue(8, ra);
		setValue(9, sra);
		setValue(10, ry);
		setValue(11, tdr);
		setValue(12, trg);
		setValue(13, rec);
		setValue(14, recy);
		setValue(15, tdre);
		setValue(16, fuml);
		setValue(17, peny);
		setValue(18, plays);
		setValue(19, fpts);
		setValue(20, game);
		setValue(21, seas);
		setValue(22, year);
		setValue(23, team);
	}
}
