package nfl.playdb.model.gen;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the game database table.
 *
 */
@Entity
@NamedQuery(name="Game.findAll", query="SELECT g FROM Game g")
public class Game implements Serializable {
	private static final long serialVersionUID = 1L;
	private int gid;
	private String cond;
	private String day;
	private String h;
	private String humd;
	private byte ou;
	private byte ptsh;
	private byte ptsv;
	private int seas;
	private BigDecimal sprv;
	private String stad;
	private String surf;
	private String temp;
	private String v;
	private String wdir;
	private byte wk;
	private String wspd;
	private List<Defense> defenderGameStats;
	private List<Drive> drives;
	private List<Kicker> kickerStats;
	private List<Offense> offensivePlayerStats;
	private List<Play> plays;
	private List<Redzone> redzoneStats;
	private List<Team> teamGameStats;

	public Game() {
	}

	@Id
	public int getGid() {
		return gid;
	}


	public void setGid(final int gid) {
		this.gid = gid;
	}


	public String getCond() {
		return this.cond;
	}

	public void setCond(final String cond) {
		this.cond = cond;
	}


	public String getDay() {
		return this.day;
	}

	public void setDay(final String day) {
		this.day = day;
	}


	public String getH() {
		return this.h;
	}

	public void setH(final String h) {
		this.h = h;
	}


	public String getHumd() {
		return this.humd;
	}

	public void setHumd(final String humd) {
		this.humd = humd;
	}


	public byte getOu() {
		return this.ou;
	}

	public void setOu(final byte ou) {
		this.ou = ou;
	}


	public byte getPtsh() {
		return this.ptsh;
	}

	public void setPtsh(final byte ptsh) {
		this.ptsh = ptsh;
	}


	public byte getPtsv() {
		return this.ptsv;
	}

	public void setPtsv(final byte ptsv) {
		this.ptsv = ptsv;
	}


	public int getSeas() {
		return this.seas;
	}

	public void setSeas(final int seas) {
		this.seas = seas;
	}


	public BigDecimal getSprv() {
		return this.sprv;
	}

	public void setSprv(final BigDecimal sprv) {
		this.sprv = sprv;
	}


	public String getStad() {
		return this.stad;
	}

	public void setStad(final String stad) {
		this.stad = stad;
	}


	public String getSurf() {
		return this.surf;
	}

	public void setSurf(final String surf) {
		this.surf = surf;
	}


	public String getTemp() {
		return this.temp;
	}

	public void setTemp(final String temp) {
		this.temp = temp;
	}


	public String getV() {
		return this.v;
	}

	public void setV(final String v) {
		this.v = v;
	}


	public String getWdir() {
		return this.wdir;
	}

	public void setWdir(final String wdir) {
		this.wdir = wdir;
	}


	public byte getWk() {
		return this.wk;
	}

	public void setWk(final byte wk) {
		this.wk = wk;
	}


	public String getWspd() {
		return this.wspd;
	}

	public void setWspd(final String wspd) {
		this.wspd = wspd;
	}


	//bi-directional many-to-one association to Defense
	@OneToMany(mappedBy="gameObj")
	public List<Defense> getDefenderGameStats() {
		return this.defenderGameStats;
	}

	public void setDefenderGameStats(final List<Defense> defenderGameStats) {
		this.defenderGameStats = defenderGameStats;
	}

	public Defense addDefenderGameStat(final Defense defenderGameStat) {
		getDefenderGameStats().add(defenderGameStat);
		defenderGameStat.setGameObj(this);

		return defenderGameStat;
	}

	public Defense removeDefenderGameStat(final Defense defenderGameStat) {
		getDefenderGameStats().remove(defenderGameStat);
		defenderGameStat.setGameObj(null);

		return defenderGameStat;
	}


	//bi-directional many-to-one association to Drive
	@OneToMany(mappedBy="game")
	public List<Drive> getDrives() {
		return this.drives;
	}

	public void setDrives(final List<Drive> drives) {
		this.drives = drives;
	}

	public Drive addDrive(final Drive drive) {
		getDrives().add(drive);
		drive.setGame(this);

		return drive;
	}

	public Drive removeDrive(final Drive drive) {
		getDrives().remove(drive);
		drive.setGame(null);

		return drive;
	}


	//bi-directional many-to-one association to Kicker
	@OneToMany(mappedBy="kickerGame")
	public List<Kicker> getKickerStats() {
		return this.kickerStats;
	}

	public void setKickerStats(final List<Kicker> kickerStats) {
		this.kickerStats = kickerStats;
	}

	public Kicker addKickerStat(final Kicker kickerStat) {
		getKickerStats().add(kickerStat);
		kickerStat.setKickerGame(this);

		return kickerStat;
	}

	public Kicker removeKickerStat(final Kicker kickerStat) {
		getKickerStats().remove(kickerStat);
		kickerStat.setKickerGame(null);

		return kickerStat;
	}


	//bi-directional many-to-one association to Offense
	@OneToMany(mappedBy="gameObj")
	public List<Offense> getOffensivePlayerStats() {
		return this.offensivePlayerStats;
	}

	public void setOffensivePlayerStats(final List<Offense> offensivePlayerStats) {
		this.offensivePlayerStats = offensivePlayerStats;
	}

	public Offense addOffensivePlayerStat(final Offense offensivePlayerStat) {
		getOffensivePlayerStats().add(offensivePlayerStat);
		offensivePlayerStat.setGameObj(this);

		return offensivePlayerStat;
	}

	public Offense removeOffensivePlayerStat(final Offense offensivePlayerStat) {
		getOffensivePlayerStats().remove(offensivePlayerStat);
		offensivePlayerStat.setGameObj(null);

		return offensivePlayerStat;
	}


	//bi-directional many-to-one association to Play
	@OneToMany(mappedBy="game")
	public List<Play> getPlays() {
		return this.plays;
	}

	public void setPlays(final List<Play> plays) {
		this.plays = plays;
	}

	public Play addPlay(final Play play) {
		getPlays().add(play);
		play.setGame(this);

		return play;
	}

	public Play removePlay(final Play play) {
		getPlays().remove(play);
		play.setGame(null);

		return play;
	}


	//bi-directional many-to-one association to Redzone
	@OneToMany(mappedBy="game")
	public List<Redzone> getRedzoneStats() {
		return this.redzoneStats;
	}

	public void setRedzoneStats(final List<Redzone> redzoneStats) {
		this.redzoneStats = redzoneStats;
	}

	public Redzone addRedzoneStat(final Redzone redzoneStat) {
		getRedzoneStats().add(redzoneStat);
		redzoneStat.setGame(this);

		return redzoneStat;
	}

	public Redzone removeRedzoneStat(final Redzone redzoneStat) {
		getRedzoneStats().remove(redzoneStat);
		redzoneStat.setGame(null);

		return redzoneStat;
	}


	//bi-directional many-to-one association to Team
	@OneToMany(mappedBy="game")
	public List<Team> getTeamGameStats() {
		return this.teamGameStats;
	}

	public void setTeamGameStats(final List<Team> teamGameStats) {
		this.teamGameStats = teamGameStats;
	}

	public Team addTeamGameStat(final Team teamGameStat) {
		getTeamGameStats().add(teamGameStat);
		teamGameStat.setGame(this);

		return teamGameStat;
	}

	public Team removeTeamGameStat(final Team teamGameStat) {
		getTeamGameStats().remove(teamGameStat);
		teamGameStat.setGame(null);

		return teamGameStat;
	}

}