package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the defense database table.
 * 
 */
@Entity
@NamedQuery(name="Defense.findAll", query="SELECT d FROM Defense d")
public class Defense implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte blk;
	private BigDecimal comb;
	private byte forc;
	private BigDecimal fpts;
	private byte frcv;
	private byte game;
	private byte int_;
	private byte pdef;
	private byte peny;
	private int plays;
	private byte saf;
	private BigDecimal sck;
	private byte seas;
	private BigDecimal solo;
	private byte tdd;
	private String team;
	private int uid;
	private int year;
	private Game gameObj;
	private Player defender;

	public Defense() {
	}


	public byte getBlk() {
		return this.blk;
	}

	public void setBlk(byte blk) {
		this.blk = blk;
	}


	public BigDecimal getComb() {
		return this.comb;
	}

	public void setComb(BigDecimal comb) {
		this.comb = comb;
	}


	public byte getForc() {
		return this.forc;
	}

	public void setForc(byte forc) {
		this.forc = forc;
	}


	public BigDecimal getFpts() {
		return this.fpts;
	}

	public void setFpts(BigDecimal fpts) {
		this.fpts = fpts;
	}


	public byte getFrcv() {
		return this.frcv;
	}

	public void setFrcv(byte frcv) {
		this.frcv = frcv;
	}


	public byte getGame() {
		return this.game;
	}

	public void setGame(byte game) {
		this.game = game;
	}


	@Column(name="int")
	public byte getInt_() {
		return this.int_;
	}

	public void setInt_(byte int_) {
		this.int_ = int_;
	}


	public byte getPdef() {
		return this.pdef;
	}

	public void setPdef(byte pdef) {
		this.pdef = pdef;
	}


	public byte getPeny() {
		return this.peny;
	}

	public void setPeny(byte peny) {
		this.peny = peny;
	}


	public int getPlays() {
		return this.plays;
	}

	public void setPlays(int plays) {
		this.plays = plays;
	}


	public byte getSaf() {
		return this.saf;
	}

	public void setSaf(byte saf) {
		this.saf = saf;
	}


	public BigDecimal getSck() {
		return this.sck;
	}

	public void setSck(BigDecimal sck) {
		this.sck = sck;
	}


	public byte getSeas() {
		return this.seas;
	}

	public void setSeas(byte seas) {
		this.seas = seas;
	}


	public BigDecimal getSolo() {
		return this.solo;
	}

	public void setSolo(BigDecimal solo) {
		this.solo = solo;
	}


	public byte getTdd() {
		return this.tdd;
	}

	public void setTdd(byte tdd) {
		this.tdd = tdd;
	}


	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	//bi-directional many-to-one association to Game
	@ManyToOne
	@JoinColumn(name="gid", referencedColumnName="gid")
	public Game getGameObj() {
		return this.gameObj;
	}

	public void setGameObj(Game gameObj) {
		this.gameObj = gameObj;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="player", referencedColumnName="player")
	public Player getDefender() {
		return this.defender;
	}

	public void setDefender(Player defender) {
		this.defender = defender;
	}

}