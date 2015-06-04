package nfl.playdb.model.gen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the player database table.
 *
 */
@Entity
@NamedQuery(name="Player.findAll", query="SELECT p FROM Player p")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	private String player;
	private byte bench;
	private int broad;
	private String col;
	private BigDecimal cone;
	private String cteam;
	private int dpos;
	private String dv;
	private String fname;
	private BigDecimal forty;
	private byte height;
	private String lname;
	private String pname;
	private String pos1;
	private String pos2;
	private BigDecimal shuttle;
	private int start;
	private BigDecimal vertical;
	private int weight;
	private int yob;
	private List<Block> blockedKicks;
	private List<Block> recoveredBlocks;
	private List<Conv> convPasses;
	private List<Conv> convCarries;
	private List<Conv> convTargets;
	private List<Defense> defenseGameStats;
	private List<Fgxp> fieldGoalsAndXPs;
	private List<Fumble> fumbles1;
	private List<Fumble> fumbleRecoveries;
	private List<Fumble> fumblesForced;
	private List<Intercpt> interceptions;
	private List<Intercpt> interceptedPasses;
	private List<Kicker> kickerGameStats;
	private List<Koff> kickOffs;
	private List<Koff> kickOffReturns;
	private List<Offense> offensiveGameStats;
	private List<Oline> snapsAtCentre;
	private List<Oline> snapsAtLeftGuard;
	private List<Oline> snapsAtLeftTackle;
	private List<Oline> snapsAtRightGuard;
	private List<Oline> snapsAtRightTackle;
	private List<Pass> passes1;
	private List<Pass> targets;
	private List<Pass> defenderPassTargets;
	private List<Penalty> penalties;
	private List<Punt> punts1;
	private List<Punt> puntReturns;
	private List<Redzone> redzoneStats;
	private List<Rush> rushes;
	private List<Sack> sacksTaken;
	private List<Sack> sacks;
	private List<Safety> safeties;
	private List<Tackle> tackles;

	public Player() {
	}

	@Id
	public String getPlayer() {
		return player;
	}


	public void setPlayer(final String player) {
		this.player = player;
	}


	public byte getBench() {
		return this.bench;
	}

	public void setBench(final byte bench) {
		this.bench = bench;
	}


	public int getBroad() {
		return this.broad;
	}

	public void setBroad(final int broad) {
		this.broad = broad;
	}


	public String getCol() {
		return this.col;
	}

	public void setCol(final String col) {
		this.col = col;
	}


	public BigDecimal getCone() {
		return this.cone;
	}

	public void setCone(final BigDecimal cone) {
		this.cone = cone;
	}


	public String getCteam() {
		return this.cteam;
	}

	public void setCteam(final String cteam) {
		this.cteam = cteam;
	}


	public int getDpos() {
		return this.dpos;
	}

	public void setDpos(final int dpos) {
		this.dpos = dpos;
	}


	public String getDv() {
		return this.dv;
	}

	public void setDv(final String dv) {
		this.dv = dv;
	}


	public String getFname() {
		return this.fname;
	}

	public void setFname(final String fname) {
		this.fname = fname;
	}


	public BigDecimal getForty() {
		return this.forty;
	}

	public void setForty(final BigDecimal forty) {
		this.forty = forty;
	}


	public byte getHeight() {
		return this.height;
	}

	public void setHeight(final byte height) {
		this.height = height;
	}


	public String getLname() {
		return this.lname;
	}

	public void setLname(final String lname) {
		this.lname = lname;
	}


	public String getPname() {
		return this.pname;
	}

	public void setPname(final String pname) {
		this.pname = pname;
	}


	public String getPos1() {
		return this.pos1;
	}

	public void setPos1(final String pos1) {
		this.pos1 = pos1;
	}


	public String getPos2() {
		return this.pos2;
	}

	public void setPos2(final String pos2) {
		this.pos2 = pos2;
	}


	public BigDecimal getShuttle() {
		return this.shuttle;
	}

	public void setShuttle(final BigDecimal shuttle) {
		this.shuttle = shuttle;
	}


	public int getStart() {
		return this.start;
	}

	public void setStart(final int start) {
		this.start = start;
	}


	public BigDecimal getVertical() {
		return this.vertical;
	}

	public void setVertical(final BigDecimal vertical) {
		this.vertical = vertical;
	}


	public int getWeight() {
		return this.weight;
	}

	public void setWeight(final int weight) {
		this.weight = weight;
	}


	public int getYob() {
		return this.yob;
	}

	public void setYob(final int yob) {
		this.yob = yob;
	}


	//bi-directional many-to-one association to Block
	@OneToMany(mappedBy="blocker")
	public List<Block> getBlockedKicks() {
		return this.blockedKicks;
	}

	public void setBlockedKicks(final List<Block> blockedKicks) {
		this.blockedKicks = blockedKicks;
	}

	public Block addBlockedKick(final Block blockedKick) {
		getBlockedKicks().add(blockedKick);
		blockedKick.setBlocker(this);

		return blockedKick;
	}

	public Block removeBlockedKick(final Block blockedKick) {
		getBlockedKicks().remove(blockedKick);
		blockedKick.setBlocker(null);

		return blockedKick;
	}


	//bi-directional many-to-one association to Block
	@OneToMany(mappedBy="blockRecoverer")
	public List<Block> getRecoveredBlocks() {
		return this.recoveredBlocks;
	}

	public void setRecoveredBlocks(final List<Block> recoveredBlocks) {
		this.recoveredBlocks = recoveredBlocks;
	}

	public Block addRecoveredBlock(final Block recoveredBlock) {
		getRecoveredBlocks().add(recoveredBlock);
		recoveredBlock.setBlockRecoverer(this);

		return recoveredBlock;
	}

	public Block removeRecoveredBlock(final Block recoveredBlock) {
		getRecoveredBlocks().remove(recoveredBlock);
		recoveredBlock.setBlockRecoverer(null);

		return recoveredBlock;
	}


	//bi-directional many-to-one association to Conv
	@OneToMany(mappedBy="convPasser")
	public List<Conv> getConvPasses() {
		return this.convPasses;
	}

	public void setConvPasses(final List<Conv> convPasses) {
		this.convPasses = convPasses;
	}

	public Conv addConvPass(final Conv convPass) {
		getConvPasses().add(convPass);
		convPass.setConvPasser(this);

		return convPass;
	}

	public Conv removeConvPass(final Conv convPass) {
		getConvPasses().remove(convPass);
		convPass.setConvPasser(null);

		return convPass;
	}


	//bi-directional many-to-one association to Conv
	@OneToMany(mappedBy="convCarrier")
	public List<Conv> getConvCarries() {
		return this.convCarries;
	}

	public void setConvCarries(final List<Conv> convCarries) {
		this.convCarries = convCarries;
	}

	public Conv addConvCarry(final Conv convCarry) {
		getConvCarries().add(convCarry);
		convCarry.setConvCarrier(this);

		return convCarry;
	}

	public Conv removeConvCarry(final Conv convCarry) {
		getConvCarries().remove(convCarry);
		convCarry.setConvCarrier(null);

		return convCarry;
	}


	//bi-directional many-to-one association to Conv
	@OneToMany(mappedBy="convTarget")
	public List<Conv> getConvTargets() {
		return this.convTargets;
	}

	public void setConvTargets(final List<Conv> convTargets) {
		this.convTargets = convTargets;
	}

	public Conv addConvTarget(final Conv convTarget) {
		getConvTargets().add(convTarget);
		convTarget.setConvTarget(this);

		return convTarget;
	}

	public Conv removeConvTarget(final Conv convTarget) {
		getConvTargets().remove(convTarget);
		convTarget.setConvTarget(null);

		return convTarget;
	}


	//bi-directional many-to-one association to Defense
	@OneToMany(mappedBy="defender")
	public List<Defense> getDefenseGameStats() {
		return this.defenseGameStats;
	}

	public void setDefenseGameStats(final List<Defense> defenseGameStats) {
		this.defenseGameStats = defenseGameStats;
	}

	public Defense addDefenseGameStat(final Defense defenseGameStat) {
		getDefenseGameStats().add(defenseGameStat);
		defenseGameStat.setDefender(this);

		return defenseGameStat;
	}

	public Defense removeDefenseGameStat(final Defense defenseGameStat) {
		getDefenseGameStats().remove(defenseGameStat);
		defenseGameStat.setDefender(null);

		return defenseGameStat;
	}


	//bi-directional many-to-one association to Fgxp
	@OneToMany(mappedBy="kicker")
	public List<Fgxp> getFieldGoalsAndXPs() {
		return this.fieldGoalsAndXPs;
	}

	public void setFieldGoalsAndXPs(final List<Fgxp> fieldGoalsAndXPs) {
		this.fieldGoalsAndXPs = fieldGoalsAndXPs;
	}

	public Fgxp addFieldGoalsAndXP(final Fgxp fieldGoalsAndXP) {
		getFieldGoalsAndXPs().add(fieldGoalsAndXP);
		fieldGoalsAndXP.setKicker(this);

		return fieldGoalsAndXP;
	}

	public Fgxp removeFieldGoalsAndXP(final Fgxp fieldGoalsAndXP) {
		getFieldGoalsAndXPs().remove(fieldGoalsAndXP);
		fieldGoalsAndXP.setKicker(null);

		return fieldGoalsAndXP;
	}


	//bi-directional many-to-one association to Fumble
	@OneToMany(mappedBy="fumbler")
	public List<Fumble> getFumbles1() {
		return this.fumbles1;
	}

	public void setFumbles1(final List<Fumble> fumbles1) {
		this.fumbles1 = fumbles1;
	}

	public Fumble addFumbles1(final Fumble fumbles1) {
		getFumbles1().add(fumbles1);
		fumbles1.setFumbler(this);

		return fumbles1;
	}

	public Fumble removeFumbles1(final Fumble fumbles1) {
		getFumbles1().remove(fumbles1);
		fumbles1.setFumbler(null);

		return fumbles1;
	}


	//bi-directional many-to-one association to Fumble
	@OneToMany(mappedBy="recoverer")
	public List<Fumble> getFumbleRecoveries() {
		return this.fumbleRecoveries;
	}

	public void setFumbleRecoveries(final List<Fumble> fumbleRecoveries) {
		this.fumbleRecoveries = fumbleRecoveries;
	}

	public Fumble addFumbleRecovery(final Fumble fumbleRecovery) {
		getFumbleRecoveries().add(fumbleRecovery);
		fumbleRecovery.setRecoverer(this);

		return fumbleRecovery;
	}

	public Fumble removeFumbleRecovery(final Fumble fumbleRecovery) {
		getFumbleRecoveries().remove(fumbleRecovery);
		fumbleRecovery.setRecoverer(null);

		return fumbleRecovery;
	}


	//bi-directional many-to-one association to Fumble
	@OneToMany(mappedBy="fumbleForcer")
	public List<Fumble> getFumblesForced() {
		return this.fumblesForced;
	}

	public void setFumblesForced(final List<Fumble> fumblesForced) {
		this.fumblesForced = fumblesForced;
	}

	public Fumble addFumblesForced(final Fumble fumblesForced) {
		getFumblesForced().add(fumblesForced);
		fumblesForced.setFumbleForcer(this);

		return fumblesForced;
	}

	public Fumble removeFumblesForced(final Fumble fumblesForced) {
		getFumblesForced().remove(fumblesForced);
		fumblesForced.setFumbleForcer(null);

		return fumblesForced;
	}


	//bi-directional many-to-one association to Intercpt
	@OneToMany(mappedBy="interceptor")
	public List<Intercpt> getInterceptions() {
		return this.interceptions;
	}

	public void setInterceptions(final List<Intercpt> interceptions) {
		this.interceptions = interceptions;
	}

	public Intercpt addInterception(final Intercpt interception) {
		getInterceptions().add(interception);
		interception.setInterceptor(this);

		return interception;
	}

	public Intercpt removeInterception(final Intercpt interception) {
		getInterceptions().remove(interception);
		interception.setInterceptor(null);

		return interception;
	}


	//bi-directional many-to-one association to Intercpt
	@OneToMany(mappedBy="passer")
	public List<Intercpt> getInterceptedPasses() {
		return this.interceptedPasses;
	}

	public void setInterceptedPasses(final List<Intercpt> interceptedPasses) {
		this.interceptedPasses = interceptedPasses;
	}

	public Intercpt addInterceptedPass(final Intercpt interceptedPass) {
		getInterceptedPasses().add(interceptedPass);
		interceptedPass.setPasser(this);

		return interceptedPass;
	}

	public Intercpt removeInterceptedPass(final Intercpt interceptedPass) {
		getInterceptedPasses().remove(interceptedPass);
		interceptedPass.setPasser(null);

		return interceptedPass;
	}


	//bi-directional many-to-one association to Kicker
	@OneToMany(mappedBy="kicker")
	public List<Kicker> getKickerGameStats() {
		return this.kickerGameStats;
	}

	public void setKickerGameStats(final List<Kicker> kickerGameStats) {
		this.kickerGameStats = kickerGameStats;
	}

	public Kicker addKickerGameStat(final Kicker kickerGameStat) {
		getKickerGameStats().add(kickerGameStat);
		kickerGameStat.setKicker(this);

		return kickerGameStat;
	}

	public Kicker removeKickerGameStat(final Kicker kickerGameStat) {
		getKickerGameStats().remove(kickerGameStat);
		kickerGameStat.setKicker(null);

		return kickerGameStat;
	}


	//bi-directional many-to-one association to Koff
	@OneToMany(mappedBy="kickOffKicker")
	public List<Koff> getKickOffs() {
		return this.kickOffs;
	}

	public void setKickOffs(final List<Koff> kickOffs) {
		this.kickOffs = kickOffs;
	}

	public Koff addKickOff(final Koff kickOff) {
		getKickOffs().add(kickOff);
		kickOff.setKickOffKicker(this);

		return kickOff;
	}

	public Koff removeKickOff(final Koff kickOff) {
		getKickOffs().remove(kickOff);
		kickOff.setKickOffKicker(null);

		return kickOff;
	}


	//bi-directional many-to-one association to Koff
	@OneToMany(mappedBy="kickReturner")
	public List<Koff> getKickOffReturns() {
		return this.kickOffReturns;
	}

	public void setKickOffReturns(final List<Koff> kickOffReturns) {
		this.kickOffReturns = kickOffReturns;
	}

	public Koff addKickOffReturn(final Koff kickOffReturn) {
		getKickOffReturns().add(kickOffReturn);
		kickOffReturn.setKickReturner(this);

		return kickOffReturn;
	}

	public Koff removeKickOffReturn(final Koff kickOffReturn) {
		getKickOffReturns().remove(kickOffReturn);
		kickOffReturn.setKickReturner(null);

		return kickOffReturn;
	}


	//bi-directional many-to-one association to Offense
	@OneToMany(mappedBy="playerObj")
	public List<Offense> getOffensiveGameStats() {
		return this.offensiveGameStats;
	}

	public void setOffensiveGameStats(final List<Offense> offensiveGameStats) {
		this.offensiveGameStats = offensiveGameStats;
	}

	public Offense addOffensiveGameStat(final Offense offensiveGameStat) {
		getOffensiveGameStats().add(offensiveGameStat);
		offensiveGameStat.setPlayerObj(this);

		return offensiveGameStat;
	}

	public Offense removeOffensiveGameStat(final Offense offensiveGameStat) {
		getOffensiveGameStats().remove(offensiveGameStat);
		offensiveGameStat.setPlayerObj(null);

		return offensiveGameStat;
	}


	//bi-directional many-to-one association to Oline
	@OneToMany(mappedBy="centre")
	public List<Oline> getSnapsAtCentre() {
		return this.snapsAtCentre;
	}

	public void setSnapsAtCentre(final List<Oline> snapsAtCentre) {
		this.snapsAtCentre = snapsAtCentre;
	}

	public Oline addSnapsAtCentre(final Oline snapsAtCentre) {
		getSnapsAtCentre().add(snapsAtCentre);
		snapsAtCentre.setCentre(this);

		return snapsAtCentre;
	}

	public Oline removeSnapsAtCentre(final Oline snapsAtCentre) {
		getSnapsAtCentre().remove(snapsAtCentre);
		snapsAtCentre.setCentre(null);

		return snapsAtCentre;
	}


	//bi-directional many-to-one association to Oline
	@OneToMany(mappedBy="leftGuard")
	public List<Oline> getSnapsAtLeftGuard() {
		return this.snapsAtLeftGuard;
	}

	public void setSnapsAtLeftGuard(final List<Oline> snapsAtLeftGuard) {
		this.snapsAtLeftGuard = snapsAtLeftGuard;
	}

	public Oline addSnapsAtLeftGuard(final Oline snapsAtLeftGuard) {
		getSnapsAtLeftGuard().add(snapsAtLeftGuard);
		snapsAtLeftGuard.setLeftGuard(this);

		return snapsAtLeftGuard;
	}

	public Oline removeSnapsAtLeftGuard(final Oline snapsAtLeftGuard) {
		getSnapsAtLeftGuard().remove(snapsAtLeftGuard);
		snapsAtLeftGuard.setLeftGuard(null);

		return snapsAtLeftGuard;
	}


	//bi-directional many-to-one association to Oline
	@OneToMany(mappedBy="leftTackle")
	public List<Oline> getSnapsAtLeftTackle() {
		return this.snapsAtLeftTackle;
	}

	public void setSnapsAtLeftTackle(final List<Oline> snapsAtLeftTackle) {
		this.snapsAtLeftTackle = snapsAtLeftTackle;
	}

	public Oline addSnapsAtLeftTackle(final Oline snapsAtLeftTackle) {
		getSnapsAtLeftTackle().add(snapsAtLeftTackle);
		snapsAtLeftTackle.setLeftTackle(this);

		return snapsAtLeftTackle;
	}

	public Oline removeSnapsAtLeftTackle(final Oline snapsAtLeftTackle) {
		getSnapsAtLeftTackle().remove(snapsAtLeftTackle);
		snapsAtLeftTackle.setLeftTackle(null);

		return snapsAtLeftTackle;
	}


	//bi-directional many-to-one association to Oline
	@OneToMany(mappedBy="rightGuard")
	public List<Oline> getSnapsAtRightGuard() {
		return this.snapsAtRightGuard;
	}

	public void setSnapsAtRightGuard(final List<Oline> snapsAtRightGuard) {
		this.snapsAtRightGuard = snapsAtRightGuard;
	}

	public Oline addSnapsAtRightGuard(final Oline snapsAtRightGuard) {
		getSnapsAtRightGuard().add(snapsAtRightGuard);
		snapsAtRightGuard.setRightGuard(this);

		return snapsAtRightGuard;
	}

	public Oline removeSnapsAtRightGuard(final Oline snapsAtRightGuard) {
		getSnapsAtRightGuard().remove(snapsAtRightGuard);
		snapsAtRightGuard.setRightGuard(null);

		return snapsAtRightGuard;
	}


	//bi-directional many-to-one association to Oline
	@OneToMany(mappedBy="rightTackle")
	public List<Oline> getSnapsAtRightTackle() {
		return this.snapsAtRightTackle;
	}

	public void setSnapsAtRightTackle(final List<Oline> snapsAtRightTackle) {
		this.snapsAtRightTackle = snapsAtRightTackle;
	}

	public Oline addSnapsAtRightTackle(final Oline snapsAtRightTackle) {
		getSnapsAtRightTackle().add(snapsAtRightTackle);
		snapsAtRightTackle.setRightTackle(this);

		return snapsAtRightTackle;
	}

	public Oline removeSnapsAtRightTackle(final Oline snapsAtRightTackle) {
		getSnapsAtRightTackle().remove(snapsAtRightTackle);
		snapsAtRightTackle.setRightTackle(null);

		return snapsAtRightTackle;
	}


	//bi-directional many-to-one association to Pass
	@OneToMany(mappedBy="passer")
	public List<Pass> getPasses1() {
		return this.passes1;
	}

	public void setPasses1(final List<Pass> passes1) {
		this.passes1 = passes1;
	}

	public Pass addPasses1(final Pass passes1) {
		getPasses1().add(passes1);
		passes1.setPasser(this);

		return passes1;
	}

	public Pass removePasses1(final Pass passes1) {
		getPasses1().remove(passes1);
		passes1.setPasser(null);

		return passes1;
	}


	//bi-directional many-to-one association to Pass
	@OneToMany(mappedBy="target")
	public List<Pass> getTargets() {
		return this.targets;
	}

	public void setTargets(final List<Pass> targets) {
		this.targets = targets;
	}

	public Pass addTarget(final Pass target) {
		getTargets().add(target);
		target.setTarget(this);

		return target;
	}

	public Pass removeTarget(final Pass target) {
		getTargets().remove(target);
		target.setTarget(null);

		return target;
	}


	//bi-directional many-to-one association to Pass
	@OneToMany(mappedBy="defender")
	public List<Pass> getDefenderPassTargets() {
		return this.defenderPassTargets;
	}

	public void setDefenderPassTargets(final List<Pass> defenderPassTargets) {
		this.defenderPassTargets = defenderPassTargets;
	}

	public Pass addDefenderPassTarget(final Pass defenderPassTarget) {
		getDefenderPassTargets().add(defenderPassTarget);
		defenderPassTarget.setDefender(this);

		return defenderPassTarget;
	}

	public Pass removeDefenderPassTarget(final Pass defenderPassTarget) {
		getDefenderPassTargets().remove(defenderPassTarget);
		defenderPassTarget.setDefender(null);

		return defenderPassTarget;
	}


	//bi-directional many-to-one association to Penalty
	@OneToMany(mappedBy="penalizedPlayer")
	public List<Penalty> getPenalties() {
		return this.penalties;
	}

	public void setPenalties(final List<Penalty> penalties) {
		this.penalties = penalties;
	}

	public Penalty addPenalty(final Penalty penalty) {
		getPenalties().add(penalty);
		penalty.setPenalizedPlayer(this);

		return penalty;
	}

	public Penalty removePenalty(final Penalty penalty) {
		getPenalties().remove(penalty);
		penalty.setPenalizedPlayer(null);

		return penalty;
	}


	//bi-directional many-to-one association to Punt
	@OneToMany(mappedBy="punterObj")
	public List<Punt> getPunts1() {
		return this.punts1;
	}

	public void setPunts1(final List<Punt> punts1) {
		this.punts1 = punts1;
	}

	public Punt addPunts1(final Punt punts1) {
		getPunts1().add(punts1);
		punts1.setPunterObj(this);

		return punts1;
	}

	public Punt removePunts1(final Punt punts1) {
		getPunts1().remove(punts1);
		punts1.setPunterObj(null);

		return punts1;
	}


	//bi-directional many-to-one association to Punt
	@OneToMany(mappedBy="puntReturner")
	public List<Punt> getPuntReturns() {
		return this.puntReturns;
	}

	public void setPuntReturns(final List<Punt> puntReturns) {
		this.puntReturns = puntReturns;
	}

	public Punt addPuntReturn(final Punt puntReturn) {
		getPuntReturns().add(puntReturn);
		puntReturn.setPuntReturner(this);

		return puntReturn;
	}

	public Punt removePuntReturn(final Punt puntReturn) {
		getPuntReturns().remove(puntReturn);
		puntReturn.setPuntReturner(null);

		return puntReturn;
	}


	//bi-directional many-to-one association to Redzone
	@OneToMany(mappedBy="playerObj")
	public List<Redzone> getRedzoneStats() {
		return this.redzoneStats;
	}

	public void setRedzoneStats(final List<Redzone> redzoneStats) {
		this.redzoneStats = redzoneStats;
	}

	public Redzone addRedzoneStat(final Redzone redzoneStat) {
		getRedzoneStats().add(redzoneStat);
		redzoneStat.setPlayerObj(this);

		return redzoneStat;
	}

	public Redzone removeRedzoneStat(final Redzone redzoneStat) {
		getRedzoneStats().remove(redzoneStat);
		redzoneStat.setPlayerObj(null);

		return redzoneStat;
	}


	//bi-directional many-to-one association to Rush
	@OneToMany(mappedBy="ballCarrier")
	public List<Rush> getRushes() {
		return this.rushes;
	}

	public void setRushes(final List<Rush> rushes) {
		this.rushes = rushes;
	}

	public Rush addRushe(final Rush rushe) {
		getRushes().add(rushe);
		rushe.setBallCarrier(this);

		return rushe;
	}

	public Rush removeRushe(final Rush rushe) {
		getRushes().remove(rushe);
		rushe.setBallCarrier(null);

		return rushe;
	}


	//bi-directional many-to-one association to Sack
	@OneToMany(mappedBy="quarterback")
	public List<Sack> getSacksTaken() {
		return this.sacksTaken;
	}

	public void setSacksTaken(final List<Sack> sacksTaken) {
		this.sacksTaken = sacksTaken;
	}

	public Sack addSacksTaken(final Sack sacksTaken) {
		getSacksTaken().add(sacksTaken);
		sacksTaken.setQuarterback(this);

		return sacksTaken;
	}

	public Sack removeSacksTaken(final Sack sacksTaken) {
		getSacksTaken().remove(sacksTaken);
		sacksTaken.setQuarterback(null);

		return sacksTaken;
	}


	//bi-directional many-to-one association to Sack
	@OneToMany(mappedBy="sackingPlayer")
	public List<Sack> getSacks() {
		return this.sacks;
	}

	public void setSacks(final List<Sack> sacks) {
		this.sacks = sacks;
	}

	public Sack addSack(final Sack sack) {
		getSacks().add(sack);
		sack.setSackingPlayer(this);

		return sack;
	}

	public Sack removeSack(final Sack sack) {
		getSacks().remove(sack);
		sack.setSackingPlayer(null);

		return sack;
	}


	//bi-directional many-to-one association to Safety
	@OneToMany(mappedBy="defender")
	public List<Safety> getSafeties() {
		return this.safeties;
	}

	public void setSafeties(final List<Safety> safeties) {
		this.safeties = safeties;
	}

	public Safety addSafety(final Safety safety) {
		getSafeties().add(safety);
		safety.setDefender(this);

		return safety;
	}

	public Safety removeSafety(final Safety safety) {
		getSafeties().remove(safety);
		safety.setDefender(null);

		return safety;
	}


	//bi-directional many-to-one association to Tackle
	@OneToMany(mappedBy="tackler")
	public List<Tackle> getTackles() {
		return this.tackles;
	}

	public void setTackles(final List<Tackle> tackles) {
		this.tackles = tackles;
	}

	public Tackle addTackle(final Tackle tackle) {
		getTackles().add(tackle);
		tackle.setTackler(this);

		return tackle;
	}

	public Tackle removeTackle(final Tackle tackle) {
		getTackles().remove(tackle);
		tackle.setTackler(null);

		return tackle;
	}

}