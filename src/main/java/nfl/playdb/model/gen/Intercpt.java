package nfl.playdb.model.gen;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


/**
 * The persistent class for the intercpt database table.
 *
 */
@Entity
@NamedQuery(name="Intercpt.findAll", query="SELECT i FROM Intercpt i")
public class Intercpt implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private byte iry;
	private Play play;
	private Player interceptor;
	private Player passer;

	public Intercpt() {
	}

	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(final int pid) {
		this.pid = pid;
	}


	public byte getIry() {
		return this.iry;
	}

	public void setIry(final byte iry) {
		this.iry = iry;
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
	@JoinColumn(name="int", referencedColumnName="player")
	public Player getInterceptor() {
		return this.interceptor;
	}

	public void setInterceptor(final Player interceptor) {
		this.interceptor = interceptor;
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

}