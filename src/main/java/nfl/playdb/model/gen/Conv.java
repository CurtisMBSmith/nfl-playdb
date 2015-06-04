package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the conv database table.
 *
 */
@Entity
@NamedQuery(name="Conv.findAll", query="SELECT c FROM Conv c")
public class Conv implements Serializable {
	private static final long serialVersionUID = 1L;
	private String type;
	private Play play;
	private Player convPasser;
	private Player convCarrier;
	private Player convTarget;

	public Conv() {
	}


	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
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
	@JoinColumn(name="psr", referencedColumnName="player")
	public Player getConvPasser() {
		return this.convPasser;
	}

	public void setConvPasser(final Player convPasser) {
		this.convPasser = convPasser;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="bc", referencedColumnName="player")
	public Player getConvCarrier() {
		return this.convCarrier;
	}

	public void setConvCarrier(final Player convCarrier) {
		this.convCarrier = convCarrier;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="trg", referencedColumnName="player")
	public Player getConvTarget() {
		return this.convTarget;
	}

	public void setConvTarget(final Player convTarget) {
		this.convTarget = convTarget;
	}

}