package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the penalty database table.
 * 
 */
@Entity
@NamedQuery(name="Penalty.findAll", query="SELECT p FROM Penalty p")
public class Penalty implements Serializable {
	private static final long serialVersionUID = 1L;
	private String act;
	private byte cat;
	private String desc;
	private byte pey;
	private String ptm;
	private int uid;
	private Play play;
	private Player penalizedPlayer;

	public Penalty() {
	}


	public String getAct() {
		return this.act;
	}

	public void setAct(String act) {
		this.act = act;
	}


	public byte getCat() {
		return this.cat;
	}

	public void setCat(byte cat) {
		this.cat = cat;
	}


	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public byte getPey() {
		return this.pey;
	}

	public void setPey(byte pey) {
		this.pey = pey;
	}


	public String getPtm() {
		return this.ptm;
	}

	public void setPtm(String ptm) {
		this.ptm = ptm;
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	//bi-directional one-to-one association to Play
	@OneToOne
	@JoinColumn(name="pid", referencedColumnName="pid")
	public Play getPlay() {
		return this.play;
	}

	public void setPlay(Play play) {
		this.play = play;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="pen", referencedColumnName="player")
	public Player getPenalizedPlayer() {
		return this.penalizedPlayer;
	}

	public void setPenalizedPlayer(Player penalizedPlayer) {
		this.penalizedPlayer = penalizedPlayer;
	}

}