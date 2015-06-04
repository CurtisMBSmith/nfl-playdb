package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the redzone database table.
 * 
 */
@Entity
@NamedQuery(name="Redzone.findAll", query="SELECT r FROM Redzone r")
public class Redzone implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte fuml;
	private byte int_;
	private byte pa;
	private byte pc;
	private byte peny;
	private int py;
	private byte ra;
	private byte rec;
	private int recy;
	private int ry;
	private byte sra;
	private byte trg;
	private int uid;
	private Game game;
	private Player playerObj;

	public Redzone() {
	}


	public byte getFuml() {
		return this.fuml;
	}

	public void setFuml(byte fuml) {
		this.fuml = fuml;
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


	public byte getSra() {
		return this.sra;
	}

	public void setSra(byte sra) {
		this.sra = sra;
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


	//bi-directional many-to-one association to Game
	@ManyToOne
	@JoinColumn(name="gid", referencedColumnName="gid")
	public Game getGame() {
		return this.game;
	}

	public void setGame(Game game) {
		this.game = game;
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