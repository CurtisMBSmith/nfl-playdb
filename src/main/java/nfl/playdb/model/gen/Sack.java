package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the sack database table.
 * 
 */
@Entity
@NamedQuery(name="Sack.findAll", query="SELECT s FROM Sack s")
public class Sack implements Serializable {
	private static final long serialVersionUID = 1L;
	private int uid;
	private BigDecimal value;
	private int ydsl;
	private Play play;
	private Player quarterback;
	private Player sackingPlayer;

	public Sack() {
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}


	public int getYdsl() {
		return this.ydsl;
	}

	public void setYdsl(int ydsl) {
		this.ydsl = ydsl;
	}


	//bi-directional many-to-one association to Play
	@ManyToOne
	@JoinColumn(name="pid", referencedColumnName="pid")
	public Play getPlay() {
		return this.play;
	}

	public void setPlay(Play play) {
		this.play = play;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="qb", referencedColumnName="player")
	public Player getQuarterback() {
		return this.quarterback;
	}

	public void setQuarterback(Player quarterback) {
		this.quarterback = quarterback;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="sk", referencedColumnName="player")
	public Player getSackingPlayer() {
		return this.sackingPlayer;
	}

	public void setSackingPlayer(Player sackingPlayer) {
		this.sackingPlayer = sackingPlayer;
	}

}