package nfl.playdb.model.gen;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * The persistent class for the play database table.
 *
 */
@Entity
@NamedQuery(name="Play.findAll", query="SELECT p FROM Play p")
public class Play implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pid;
	private byte blk;
	private String def;
	private byte dseq;
	private byte dwn;
	private byte fd;
	private byte fum;
	private byte int_;
	private byte len;
	private byte min;
	private byte nh;
	private String off;
	private int olid;
	private byte pen;
	private byte pts;
	private byte ptsd;
	private byte ptso;
	private byte qtr;
	private byte saf;
	private byte sec;
	private byte sg;
	private byte sk;
	private byte tck;
	private byte timd;
	private byte timo;
	private String type;
	private byte yfog;
	private byte ytg;
	private byte zone;
	private Block blockedKick;
	private Conv conversion;
	private Fgxp fieldGoalOrXP;
	private Fumble fumble;
	private Intercpt interception;
	private Koff kickOff;
	private Pass pass;
	private Penalty penalty;
	private Game game;
	private Punt punt;
	private Rush rush;
	private List<Sack> sacks;
	private Safety safety;
	private List<Tackle> tackles;

	public Play() {
	}

	@Id
	public int getPid() {
		return pid;
	}


	public void setPid(final int pid) {
		this.pid = pid;
	}


	public byte getBlk() {
		return this.blk;
	}

	public void setBlk(final byte blk) {
		this.blk = blk;
	}


	public String getDef() {
		return this.def;
	}

	public void setDef(final String def) {
		this.def = def;
	}


	public byte getDseq() {
		return this.dseq;
	}

	public void setDseq(final byte dseq) {
		this.dseq = dseq;
	}


	public byte getDwn() {
		return this.dwn;
	}

	public void setDwn(final byte dwn) {
		this.dwn = dwn;
	}


	public byte getFd() {
		return this.fd;
	}

	public void setFd(final byte fd) {
		this.fd = fd;
	}


	public byte getFum() {
		return this.fum;
	}

	public void setFum(final byte fum) {
		this.fum = fum;
	}


	@Column(name="int")
	public byte getInt_() {
		return this.int_;
	}

	public void setInt_(final byte int_) {
		this.int_ = int_;
	}


	public byte getLen() {
		return this.len;
	}

	public void setLen(final byte len) {
		this.len = len;
	}


	public byte getMin() {
		return this.min;
	}

	public void setMin(final byte min) {
		this.min = min;
	}


	public byte getNh() {
		return this.nh;
	}

	public void setNh(final byte nh) {
		this.nh = nh;
	}


	public String getOff() {
		return this.off;
	}

	public void setOff(final String off) {
		this.off = off;
	}


	public int getOlid() {
		return this.olid;
	}

	public void setOlid(final int olid) {
		this.olid = olid;
	}


	public byte getPen() {
		return this.pen;
	}

	public void setPen(final byte pen) {
		this.pen = pen;
	}


	public byte getPts() {
		return this.pts;
	}

	public void setPts(final byte pts) {
		this.pts = pts;
	}


	public byte getPtsd() {
		return this.ptsd;
	}

	public void setPtsd(final byte ptsd) {
		this.ptsd = ptsd;
	}


	public byte getPtso() {
		return this.ptso;
	}

	public void setPtso(final byte ptso) {
		this.ptso = ptso;
	}


	public byte getQtr() {
		return this.qtr;
	}

	public void setQtr(final byte qtr) {
		this.qtr = qtr;
	}


	public byte getSaf() {
		return this.saf;
	}

	public void setSaf(final byte saf) {
		this.saf = saf;
	}


	public byte getSec() {
		return this.sec;
	}

	public void setSec(final byte sec) {
		this.sec = sec;
	}


	public byte getSg() {
		return this.sg;
	}

	public void setSg(final byte sg) {
		this.sg = sg;
	}


	public byte getSk() {
		return this.sk;
	}

	public void setSk(final byte sk) {
		this.sk = sk;
	}


	public byte getTck() {
		return this.tck;
	}

	public void setTck(final byte tck) {
		this.tck = tck;
	}


	public byte getTimd() {
		return this.timd;
	}

	public void setTimd(final byte timd) {
		this.timd = timd;
	}


	public byte getTimo() {
		return this.timo;
	}

	public void setTimo(final byte timo) {
		this.timo = timo;
	}


	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}


	public byte getYfog() {
		return this.yfog;
	}

	public void setYfog(final byte yfog) {
		this.yfog = yfog;
	}


	public byte getYtg() {
		return this.ytg;
	}

	public void setYtg(final byte ytg) {
		this.ytg = ytg;
	}


	public byte getZone() {
		return this.zone;
	}

	public void setZone(final byte zone) {
		this.zone = zone;
	}


	//bi-directional one-to-one association to Block
	@OneToOne(mappedBy="play")
	public Block getBlockedKick() {
		return this.blockedKick;
	}

	public void setBlockedKick(final Block blockedKick) {
		this.blockedKick = blockedKick;
	}


	//bi-directional one-to-one association to Conv
	@OneToOne(mappedBy="play")
	public Conv getConversion() {
		return this.conversion;
	}

	public void setConversion(final Conv conversion) {
		this.conversion = conversion;
	}


	//bi-directional one-to-one association to Fgxp
	@OneToOne(mappedBy="play")
	public Fgxp getFieldGoalOrXP() {
		return this.fieldGoalOrXP;
	}

	public void setFieldGoalOrXP(final Fgxp fieldGoalOrXP) {
		this.fieldGoalOrXP = fieldGoalOrXP;
	}


	//bi-directional one-to-one association to Fumble
	@OneToOne(mappedBy="play")
	public Fumble getFumble() {
		return this.fumble;
	}

	public void setFumble(final Fumble fumble) {
		this.fumble = fumble;
	}


	//bi-directional one-to-one association to Intercpt
	@OneToOne(mappedBy="play")
	public Intercpt getInterception() {
		return this.interception;
	}

	public void setInterception(final Intercpt interception) {
		this.interception = interception;
	}


	//bi-directional one-to-one association to Koff
	@OneToOne(mappedBy="play")
	public Koff getKickOff() {
		return this.kickOff;
	}

	public void setKickOff(final Koff kickOff) {
		this.kickOff = kickOff;
	}


	//bi-directional one-to-one association to Pass
	@OneToOne(mappedBy="play")
	public Pass getPass() {
		return this.pass;
	}

	public void setPass(final Pass pass) {
		this.pass = pass;
	}


	//bi-directional one-to-one association to Penalty
	@OneToOne(mappedBy="play")
	public Penalty getPenalty() {
		return this.penalty;
	}

	public void setPenalty(final Penalty penalty) {
		this.penalty = penalty;
	}


	//bi-directional many-to-one association to Game
	@ManyToOne
	@JoinColumn(name="gid", referencedColumnName="gid")
	public Game getGame() {
		return this.game;
	}

	public void setGame(final Game game) {
		this.game = game;
	}


	//bi-directional one-to-one association to Punt
	@OneToOne(mappedBy="play")
	public Punt getPunt() {
		return this.punt;
	}

	public void setPunt(final Punt punt) {
		this.punt = punt;
	}


	//bi-directional one-to-one association to Rush
	@OneToOne(mappedBy="play")
	public Rush getRush() {
		return this.rush;
	}

	public void setRush(final Rush rush) {
		this.rush = rush;
	}


	//bi-directional many-to-one association to Sack
	@OneToMany(mappedBy="play")
	public List<Sack> getSacks() {
		return this.sacks;
	}

	public void setSacks(final List<Sack> sacks) {
		this.sacks = sacks;
	}

	public Sack addSack(final Sack sack) {
		getSacks().add(sack);
		sack.setPlay(this);

		return sack;
	}

	public Sack removeSack(final Sack sack) {
		getSacks().remove(sack);
		sack.setPlay(null);

		return sack;
	}


	//bi-directional one-to-one association to Safety
	@OneToOne(mappedBy="play")
	public Safety getSafety() {
		return this.safety;
	}

	public void setSafety(final Safety safety) {
		this.safety = safety;
	}


	//bi-directional many-to-one association to Tackle
	@OneToMany(mappedBy="play")
	public List<Tackle> getTackles() {
		return this.tackles;
	}

	public void setTackles(final List<Tackle> tackles) {
		this.tackles = tackles;
	}

	public Tackle addTackle(final Tackle tackle) {
		getTackles().add(tackle);
		tackle.setPlay(this);

		return tackle;
	}

	public Tackle removeTackle(final Tackle tackle) {
		getTackles().remove(tackle);
		tackle.setPlay(null);

		return tackle;
	}

}