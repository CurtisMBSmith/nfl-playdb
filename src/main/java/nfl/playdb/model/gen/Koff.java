package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the koff database table.
 *
 */
@Entity
@NamedQuery(name="Koff.findAll", query="SELECT k FROM Koff k")
public class Koff implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte kgro;
	private byte knet;
	private byte kry;
	private byte ktb;
	private Play play;
	private Player kickOffKicker;
	private Player kickReturner;

	public Koff() {
	}


	public byte getKgro() {
		return this.kgro;
	}

	public void setKgro(final byte kgro) {
		this.kgro = kgro;
	}


	public byte getKnet() {
		return this.knet;
	}

	public void setKnet(final byte knet) {
		this.knet = knet;
	}


	public byte getKry() {
		return this.kry;
	}

	public void setKry(final byte kry) {
		this.kry = kry;
	}


	public byte getKtb() {
		return this.ktb;
	}

	public void setKtb(final byte ktb) {
		this.ktb = ktb;
	}


	//bi-directional one-to-one association to Play
	@Id
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
	@JoinColumn(name="kicker", referencedColumnName="player")
	public Player getKickOffKicker() {
		return this.kickOffKicker;
	}

	public void setKickOffKicker(final Player kickOffKicker) {
		this.kickOffKicker = kickOffKicker;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="kr", referencedColumnName="player")
	public Player getKickReturner() {
		return this.kickReturner;
	}

	public void setKickReturner(final Player kickReturner) {
		this.kickReturner = kickReturner;
	}

}