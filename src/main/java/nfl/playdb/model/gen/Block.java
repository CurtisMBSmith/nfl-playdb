package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the block database table.
 *
 */
@Entity
@NamedQuery(name="Block.findAll", query="SELECT b FROM Block b")
public class Block implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private Play play;
	private Player blocker;
	private Player blockRecoverer;

	public Block() {
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
	@JoinColumn(name="blk", referencedColumnName="player")
	public Player getBlocker() {
		return this.blocker;
	}

	public void setBlocker(final Player blocker) {
		this.blocker = blocker;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="brcv", referencedColumnName="player")
	public Player getBlockRecoverer() {
		return this.blockRecoverer;
	}

	public void setBlockRecoverer(final Player blockRecoverer) {
		this.blockRecoverer = blockRecoverer;
	}

}