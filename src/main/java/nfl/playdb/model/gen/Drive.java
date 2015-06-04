package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the drive database table.
 * 
 */
@Entity
@NamedQuery(name="Drive.findAll", query="SELECT d FROM Drive d")
public class Drive implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte drvn;
	private byte min;
	private int net;
	private String obt;
	private byte ofd;
	private byte pa;
	private byte pc;
	private byte peya;
	private byte peyf;
	private byte pfd;
	private byte plays;
	private int py;
	private byte qtr;
	private byte ra;
	private String res;
	private byte rfd;
	private int ry;
	private byte sec;
	private byte succ;
	private String tname;
	private int uid;
	private byte yfog;
	private Game game;
	private Play firstPlay;

	public Drive() {
	}


	public byte getDrvn() {
		return this.drvn;
	}

	public void setDrvn(byte drvn) {
		this.drvn = drvn;
	}


	public byte getMin() {
		return this.min;
	}

	public void setMin(byte min) {
		this.min = min;
	}


	public int getNet() {
		return this.net;
	}

	public void setNet(int net) {
		this.net = net;
	}


	public String getObt() {
		return this.obt;
	}

	public void setObt(String obt) {
		this.obt = obt;
	}


	public byte getOfd() {
		return this.ofd;
	}

	public void setOfd(byte ofd) {
		this.ofd = ofd;
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


	public byte getPeya() {
		return this.peya;
	}

	public void setPeya(byte peya) {
		this.peya = peya;
	}


	public byte getPeyf() {
		return this.peyf;
	}

	public void setPeyf(byte peyf) {
		this.peyf = peyf;
	}


	public byte getPfd() {
		return this.pfd;
	}

	public void setPfd(byte pfd) {
		this.pfd = pfd;
	}


	public byte getPlays() {
		return this.plays;
	}

	public void setPlays(byte plays) {
		this.plays = plays;
	}


	public int getPy() {
		return this.py;
	}

	public void setPy(int py) {
		this.py = py;
	}


	public byte getQtr() {
		return this.qtr;
	}

	public void setQtr(byte qtr) {
		this.qtr = qtr;
	}


	public byte getRa() {
		return this.ra;
	}

	public void setRa(byte ra) {
		this.ra = ra;
	}


	public String getRes() {
		return this.res;
	}

	public void setRes(String res) {
		this.res = res;
	}


	public byte getRfd() {
		return this.rfd;
	}

	public void setRfd(byte rfd) {
		this.rfd = rfd;
	}


	public int getRy() {
		return this.ry;
	}

	public void setRy(int ry) {
		this.ry = ry;
	}


	public byte getSec() {
		return this.sec;
	}

	public void setSec(byte sec) {
		this.sec = sec;
	}


	public byte getSucc() {
		return this.succ;
	}

	public void setSucc(byte succ) {
		this.succ = succ;
	}


	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	public byte getYfog() {
		return this.yfog;
	}

	public void setYfog(byte yfog) {
		this.yfog = yfog;
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


	//uni-directional one-to-one association to Play
	@OneToOne
	@JoinColumn(name="fpid", referencedColumnName="pid")
	public Play getFirstPlay() {
		return this.firstPlay;
	}

	public void setFirstPlay(Play firstPlay) {
		this.firstPlay = firstPlay;
	}

}