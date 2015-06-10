package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the rush database table.
 *
 */
@Entity
@NamedQuery(name="Rush.findAll", query="SELECT r FROM Rush r")
public class Rush implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private String dir;
	private byte kne;
	private byte succ;
	private byte yds;
	private Play play;
	private Player ballCarrier;

	public Rush() {
	}

	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(final int pid) {
		this.pid = pid;
	}


	public String getDir() {
		return this.dir;
	}

	public void setDir(final String dir) {
		this.dir = dir;
	}


	public byte getKne() {
		return this.kne;
	}

	public void setKne(final byte kne) {
		this.kne = kne;
	}


	public byte getSucc() {
		return this.succ;
	}

	public void setSucc(final byte succ) {
		this.succ = succ;
	}


	public byte getYds() {
		return this.yds;
	}

	public void setYds(final byte yds) {
		this.yds = yds;
	}


	//bi-directional one-to-one association to Play
	@OneToOne
	@JoinColumn(name="pid", referencedColumnName="pid")
	public Play getPlay() {
		return this.play;
	}

	public void setPlay(final Play play) {
		this.play = play;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="bc", referencedColumnName="player")
	public Player getBallCarrier() {
		return this.ballCarrier;
	}

	public void setBallCarrier(final Player ballCarrier) {
		this.ballCarrier = ballCarrier;
	}

}