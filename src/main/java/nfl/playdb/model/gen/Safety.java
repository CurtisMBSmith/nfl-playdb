package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the safety database table.
 *
 */
@Entity
@NamedQuery(name="Safety.findAll", query="SELECT s FROM Safety s")
public class Safety implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private Play play;
	private Player defender;

	public Safety() {
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
	@JoinColumn(name="saf", referencedColumnName="player")
	public Player getDefender() {
		return this.defender;
	}

	public void setDefender(final Player defender) {
		this.defender = defender;
	}

}