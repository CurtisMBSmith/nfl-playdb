package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the fumble database table.
 *
 */
@Entity
@NamedQuery(name="Fumble.findAll", query="SELECT f FROM Fumble f")
public class Fumble implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private Play play;
	private Player fumbler;
	private Player recoverer;
	private Player fumbleForcer;

	public Fumble() {
	}

	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(final int pid) {
		this.pid = pid;
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
	@JoinColumn(name="fum", referencedColumnName="player")
	public Player getFumbler() {
		return this.fumbler;
	}

	public void setFumbler(final Player fumbler) {
		this.fumbler = fumbler;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="frcv", referencedColumnName="player")
	public Player getRecoverer() {
		return this.recoverer;
	}

	public void setRecoverer(final Player recoverer) {
		this.recoverer = recoverer;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="forc", referencedColumnName="player")
	public Player getFumbleForcer() {
		return this.fumbleForcer;
	}

	public void setFumbleForcer(final Player fumbleForcer) {
		this.fumbleForcer = fumbleForcer;
	}

}