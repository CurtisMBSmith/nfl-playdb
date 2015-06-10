package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the punt database table.
 *
 */
@Entity
@NamedQuery(name="Punt.findAll", query="SELECT p FROM Punt p")
public class Punt implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private byte pfc;
	private byte pgro;
	private byte pnet;
	private byte pry;
	private byte ptb;
	private Play play;
	private Player punterObj;
	private Player puntReturner;

	public Punt() {
	}

	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(final int pid) {
		this.pid = pid;
	}


	public byte getPfc() {
		return this.pfc;
	}

	public void setPfc(final byte pfc) {
		this.pfc = pfc;
	}


	public byte getPgro() {
		return this.pgro;
	}

	public void setPgro(final byte pgro) {
		this.pgro = pgro;
	}


	public byte getPnet() {
		return this.pnet;
	}

	public void setPnet(final byte pnet) {
		this.pnet = pnet;
	}


	public byte getPry() {
		return this.pry;
	}

	public void setPry(final byte pry) {
		this.pry = pry;
	}


	public byte getPtb() {
		return this.ptb;
	}

	public void setPtb(final byte ptb) {
		this.ptb = ptb;
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
	@JoinColumn(name="punter", referencedColumnName="player")
	public Player getPunterObj() {
		return this.punterObj;
	}

	public void setPunterObj(final Player punterObj) {
		this.punterObj = punterObj;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="pr", referencedColumnName="player")
	public Player getPuntReturner() {
		return this.puntReturner;
	}

	public void setPuntReturner(final Player puntReturner) {
		this.puntReturner = puntReturner;
	}

}