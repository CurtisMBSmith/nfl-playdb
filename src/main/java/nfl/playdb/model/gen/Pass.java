package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the pass database table.
 *
 */
@Entity
@NamedQuery(name="Pass.findAll", query="SELECT p FROM Pass p")
public class Pass implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private byte comp;
	private String loc;
	private byte spk;
	private byte succ;
	private byte yds;
	private Play play;
	private Player passer;
	private Player target;
	private Player defender;

	public Pass() {
	}

	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(final int pid) {
		this.pid = pid;
	}


	public byte getComp() {
		return this.comp;
	}

	public void setComp(final byte comp) {
		this.comp = comp;
	}


	public String getLoc() {
		return this.loc;
	}

	public void setLoc(final String loc) {
		this.loc = loc;
	}


	public byte getSpk() {
		return this.spk;
	}

	public void setSpk(final byte spk) {
		this.spk = spk;
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
	@JoinColumn(name="psr", referencedColumnName="player")
	public Player getPasser() {
		return this.passer;
	}

	public void setPasser(final Player passer) {
		this.passer = passer;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="trg", referencedColumnName="player")
	public Player getTarget() {
		return this.target;
	}

	public void setTarget(final Player target) {
		this.target = target;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="dfb", referencedColumnName="player")
	public Player getDefender() {
		return this.defender;
	}

	public void setDefender(final Player defender) {
		this.defender = defender;
	}

}