package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the fgxp database table.
 *
 */
@Entity
@NamedQuery(name="Fgxp.findAll", query="SELECT f FROM Fgxp f")
public class Fgxp implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte dist;
	private String fgxp;
	private byte good;
	private Play play;
	private Player kicker;

	public Fgxp() {
	}


	public byte getDist() {
		return this.dist;
	}

	public void setDist(final byte dist) {
		this.dist = dist;
	}


	public String getFgxp() {
		return this.fgxp;
	}

	public void setFgxp(final String fgxp) {
		this.fgxp = fgxp;
	}


	public byte getGood() {
		return this.good;
	}

	public void setGood(final byte good) {
		this.good = good;
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
	@JoinColumn(name="fkicker", referencedColumnName="player")
	public Player getKicker() {
		return this.kicker;
	}

	public void setKicker(final Player kicker) {
		this.kicker = kicker;
	}

}