package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the offense database table.
 * 
 */
@Entity
@NamedQuery(name="Offense.findAll", query="SELECT o FROM Offense o")
public class Offense implements Serializable {
	private static final long serialVersionUID = 1L;
	private BigDecimal fpts;
	private byte fuml;
	private byte game;
	private byte int_;
	private byte pa;
	private byte pc;
	private byte peny;
	private int plays;
	private int py;
	private byte ra;
	private byte rec;
	private int recy;
	private int ry;
	private byte seas;
	private byte sra;
	private byte tdp;
	private byte tdr;
	private byte tdre;
	private String team;
	private byte trg;
	private int uid;
	private int year;
	private Game gameObj;
	private Player playerObj;

	public Offense() {
	}


	public BigDecimal getFpts() {
		return this.fpts;
	}

	public void setFpts(BigDecimal fpts) {
		this.fpts = fpts;
	}


	public byte getFuml() {
		return this.fuml;
	}

	public void setFuml(byte fuml) {
		this.fuml = fuml;
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


	public byte getPa() {
		return this.pa;
	}

	public void setPa(byte pa) {
		this.pa = pa;
	}


	public byte getPc() {
		return this.pc;
	}

	public void setPc(byte pc) {
		this.pc = pc;
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


	public int getPy() {
		return this.py;
	}

	public void setPy(int py) {
		this.py = py;
	}


	public byte getRa() {
		return this.ra;
	}

	public void setRa(byte ra) {
		this.ra = ra;
	}


	public byte getRec() {
		return this.rec;
	}

	public void setRec(byte rec) {
		this.rec = rec;
	}


	public int getRecy() {
		return this.recy;
	}

	public void setRecy(int recy) {
		this.recy = recy;
	}


	public int getRy() {
		return this.ry;
	}

	public void setRy(int ry) {
		this.ry = ry;
	}


	public byte getSeas() {
		return this.seas;
	}

	public void setSeas(byte seas) {
		this.seas = seas;
	}


	public byte getSra() {
		return this.sra;
	}

	public void setSra(byte sra) {
		this.sra = sra;
	}


	public byte getTdp() {
		return this.tdp;
	}

	public void setTdp(byte tdp) {
		this.tdp = tdp;
	}


	public byte getTdr() {
		return this.tdr;
	}

	public void setTdr(byte tdr) {
		this.tdr = tdr;
	}


	public byte getTdre() {
		return this.tdre;
	}

	public void setTdre(byte tdre) {
		this.tdre = tdre;
	}


	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	public byte getTrg() {
		return this.trg;
	}

	public void setTrg(byte trg) {
		this.trg = trg;
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
	public Player getPlayerObj() {
		return this.playerObj;
	}

	public void setPlayerObj(Player playerObj) {
		this.playerObj = playerObj;
	}

}