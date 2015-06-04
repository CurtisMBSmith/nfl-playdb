package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tackle database table.
 * 
 */
@Entity
@NamedQuery(name="Tackle.findAll", query="SELECT t FROM Tackle t")
public class Tackle implements Serializable {
	private static final long serialVersionUID = 1L;
	private int uid;
	private BigDecimal value;
	private Play play;
	private Player tackler;

	public Tackle() {
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
	@JoinColumn(name="tck", referencedColumnName="player")
	public Player getTackler() {
		return this.tackler;
	}

	public void setTackler(Player tackler) {
		this.tackler = tackler;
	}

}