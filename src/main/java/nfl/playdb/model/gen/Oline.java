package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oline database table.
 * 
 */
@Entity
@NamedQuery(name="Oline.findAll", query="SELECT o FROM Oline o")
public class Oline implements Serializable {
	private static final long serialVersionUID = 1L;
	private int olid;
	private Player centre;
	private Player leftGuard;
	private Player leftTackle;
	private Player rightGuard;
	private Player rightTackle;

	public Oline() {
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getOlid() {
		return this.olid;
	}

	public void setOlid(int olid) {
		this.olid = olid;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="c", referencedColumnName="player")
	public Player getCentre() {
		return this.centre;
	}

	public void setCentre(Player centre) {
		this.centre = centre;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="lg", referencedColumnName="player")
	public Player getLeftGuard() {
		return this.leftGuard;
	}

	public void setLeftGuard(Player leftGuard) {
		this.leftGuard = leftGuard;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="lt", referencedColumnName="player")
	public Player getLeftTackle() {
		return this.leftTackle;
	}

	public void setLeftTackle(Player leftTackle) {
		this.leftTackle = leftTackle;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="rg", referencedColumnName="player")
	public Player getRightGuard() {
		return this.rightGuard;
	}

	public void setRightGuard(Player rightGuard) {
		this.rightGuard = rightGuard;
	}


	//bi-directional many-to-one association to Player
	@ManyToOne
	@JoinColumn(name="rt", referencedColumnName="player")
	public Player getRightTackle() {
		return this.rightTackle;
	}

	public void setRightTackle(Player rightTackle) {
		this.rightTackle = rightTackle;
	}

}