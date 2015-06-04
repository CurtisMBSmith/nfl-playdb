package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the kicker database table.
 * 
 */
@Entity
@NamedQuery(name="Kicker.findAll", query="SELECT k FROM Kicker k")
public class Kicker implements Serializable {
	private static final long serialVersionUID = 1L;
	private byte fgl;
	private byte fgm;
	private byte fgs;
	private BigDecimal fpts;
	private byte game;
	private byte pat;
	private byte seas;
	private String team;
	private int uid;
	private int year;
	private Game kickerGame;
	private Player kicker;

	public Kicker() {
	}


	public byte getFgl() {
		return this.fgl;
	}

	public void setFgl(byte fgl) {
		this.fgl = fgl;
	}


	public byte getFgm() {
		return this.fgm;
	}

	public void setFgm(byte fgm) {
		this.fgm = fgm;
	}


	public byte getFgs() {
		return this.fgs;
	}

	public void setFgs(byte fgs) {
		this.fgs = fgs;
	}


	public BigDecimal getFpts() {
		return this.fpts;
	}

	public void setFpts(BigDecimal fpts) {
		this.fpts = fpts;
	}


	public byte getGame() {
		return this.game;
	}

	public void setGame(byte game) {
		this.game = game;
	}


	public byte getPat() {
		return this.pat;
	}

	public void setPat(byte pat) {
		this.pat = pat;
	}


	public byte getSeas() {
		return this.seas;
	}

	public void setSeas(byte seas) {
		this.seas = seas;
	}


	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}


	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	//bi-directional many-to-one association to Game
	@ManyToOne
	@JoinColumn(name="gid", referencedColumnName="gid")
	public Game getKickerGame() {
		return this.kickerGame;
	}

	public void setKickerGame(Game kickerGame) {
		this.kickerGame = kickerGame;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="player", referencedColumnName="player")
	public Player getKicker() {
		return this.kicker;
	}

	public void setKicker(Player kicker) {
		this.kicker = kicker;
	}

}