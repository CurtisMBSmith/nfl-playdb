package nfl.playdb.model.gen;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the team database table.
 * 
 */
@Entity
@NamedQuery(name="Team.findAll", query="SELECT t FROM Team t")
public class Team implements Serializable {
	private static final long serialVersionUID = 1L;
	private int bpy;
	private int bry;
	private BigDecimal dbp;
	private BigDecimal dbr;
	private BigDecimal dbs;
	private byte dla;
	private byte dlp;
	private int dly;
	private byte dma;
	private int dmy;
	private byte dp;
	private byte dra;
	private byte drv;
	private int dry;
	private byte dsp;
	private byte dum;
	private byte fgat;
	private byte fgm;
	private int fgy;
	private byte fsp;
	private byte fum;
	private int gpy;
	private byte i20;
	private byte ifd;
	private byte int_;
	private byte ir;
	private int iry;
	private byte kr;
	private int kry;
	private byte l3a;
	private byte l3c;
	private BigDecimal lbp;
	private BigDecimal lbr;
	private BigDecimal lbs;
	private byte lcpa;
	private int lcpy;
	private byte lcra;
	private int lcry;
	private byte lea;
	private int ley;
	private byte lga;
	private int lgy;
	private BigDecimal lnp;
	private BigDecimal lnr;
	private byte lpc;
	private byte lta;
	private int lty;
	private byte mda;
	private int mdy;
	private byte mpc;
	private byte nha;
	private int npy;
	private byte ohp;
	private byte p1a;
	private int p1y;
	private byte p2a;
	private int p2y;
	private byte p3a;
	private int p3y;
	private byte pa;
	private byte pbep;
	private byte pc;
	private int pen;
	private byte pfd;
	private byte pfn;
	private int pld;
	private int plo;
	private byte pr;
	private int pry;
	private byte pts;
	private byte pu;
	private int py;
	private byte q1p;
	private byte q1pa;
	private int q1py;
	private byte q1ra;
	private int q1ry;
	private byte q2p;
	private byte q3p;
	private byte q4p;
	private byte qba;
	private int qby;
	private byte r1a;
	private int r1y;
	private byte r2a;
	private int r2y;
	private byte r3a;
	private int r3y;
	private byte ra;
	private byte rba;
	private int rby;
	private byte rea;
	private int rey;
	private byte rfd;
	private byte rga;
	private int rgy;
	private byte rta;
	private byte rtd;
	private int rty;
	private int ry;
	private byte rza;
	private byte rzc;
	private byte rzpa;
	private int rzpy;
	private byte rzra;
	private int rzry;
	private byte s1pp;
	private byte s1rp;
	private byte s2pp;
	private byte s2rp;
	private byte s3a;
	private byte s3c;
	private byte s3pp;
	private byte s3rp;
	private int sfpy;
	private byte sga;
	private int sgy;
	private byte sk;
	private int sky;
	private byte sla;
	private int sly;
	private byte sma;
	private int smy;
	private byte spc;
	private byte spp;
	private byte sra;
	private byte srp;
	private int sry;
	private byte stf;
	private byte tb;
	private byte td;
	private byte tdp;
	private byte tdr;
	private byte tdt;
	private byte tea;
	private int tey;
	private int tid;
	private String tname;
	private BigDecimal top;
	private byte wr1a;
	private int wr1y;
	private byte wr3a;
	private int wr3y;
	private Game game;

	public Team() {
	}


	public int getBpy() {
		return this.bpy;
	}

	public void setBpy(int bpy) {
		this.bpy = bpy;
	}


	public int getBry() {
		return this.bry;
	}

	public void setBry(int bry) {
		this.bry = bry;
	}


	public BigDecimal getDbp() {
		return this.dbp;
	}

	public void setDbp(BigDecimal dbp) {
		this.dbp = dbp;
	}


	public BigDecimal getDbr() {
		return this.dbr;
	}

	public void setDbr(BigDecimal dbr) {
		this.dbr = dbr;
	}


	public BigDecimal getDbs() {
		return this.dbs;
	}

	public void setDbs(BigDecimal dbs) {
		this.dbs = dbs;
	}


	public byte getDla() {
		return this.dla;
	}

	public void setDla(byte dla) {
		this.dla = dla;
	}


	public byte getDlp() {
		return this.dlp;
	}

	public void setDlp(byte dlp) {
		this.dlp = dlp;
	}


	public int getDly() {
		return this.dly;
	}

	public void setDly(int dly) {
		this.dly = dly;
	}


	public byte getDma() {
		return this.dma;
	}

	public void setDma(byte dma) {
		this.dma = dma;
	}


	public int getDmy() {
		return this.dmy;
	}

	public void setDmy(int dmy) {
		this.dmy = dmy;
	}


	public byte getDp() {
		return this.dp;
	}

	public void setDp(byte dp) {
		this.dp = dp;
	}


	public byte getDra() {
		return this.dra;
	}

	public void setDra(byte dra) {
		this.dra = dra;
	}


	public byte getDrv() {
		return this.drv;
	}

	public void setDrv(byte drv) {
		this.drv = drv;
	}


	public int getDry() {
		return this.dry;
	}

	public void setDry(int dry) {
		this.dry = dry;
	}


	public byte getDsp() {
		return this.dsp;
	}

	public void setDsp(byte dsp) {
		this.dsp = dsp;
	}


	public byte getDum() {
		return this.dum;
	}

	public void setDum(byte dum) {
		this.dum = dum;
	}


	public byte getFgat() {
		return this.fgat;
	}

	public void setFgat(byte fgat) {
		this.fgat = fgat;
	}


	public byte getFgm() {
		return this.fgm;
	}

	public void setFgm(byte fgm) {
		this.fgm = fgm;
	}


	public int getFgy() {
		return this.fgy;
	}

	public void setFgy(int fgy) {
		this.fgy = fgy;
	}


	public byte getFsp() {
		return this.fsp;
	}

	public void setFsp(byte fsp) {
		this.fsp = fsp;
	}


	public byte getFum() {
		return this.fum;
	}

	public void setFum(byte fum) {
		this.fum = fum;
	}


	public int getGpy() {
		return this.gpy;
	}

	public void setGpy(int gpy) {
		this.gpy = gpy;
	}


	public byte getI20() {
		return this.i20;
	}

	public void setI20(byte i20) {
		this.i20 = i20;
	}


	public byte getIfd() {
		return this.ifd;
	}

	public void setIfd(byte ifd) {
		this.ifd = ifd;
	}


	@Column(name="int")
	public byte getInt_() {
		return this.int_;
	}

	public void setInt_(byte int_) {
		this.int_ = int_;
	}


	public byte getIr() {
		return this.ir;
	}

	public void setIr(byte ir) {
		this.ir = ir;
	}


	public int getIry() {
		return this.iry;
	}

	public void setIry(int iry) {
		this.iry = iry;
	}


	public byte getKr() {
		return this.kr;
	}

	public void setKr(byte kr) {
		this.kr = kr;
	}


	public int getKry() {
		return this.kry;
	}

	public void setKry(int kry) {
		this.kry = kry;
	}


	public byte getL3a() {
		return this.l3a;
	}

	public void setL3a(byte l3a) {
		this.l3a = l3a;
	}


	public byte getL3c() {
		return this.l3c;
	}

	public void setL3c(byte l3c) {
		this.l3c = l3c;
	}


	public BigDecimal getLbp() {
		return this.lbp;
	}

	public void setLbp(BigDecimal lbp) {
		this.lbp = lbp;
	}


	public BigDecimal getLbr() {
		return this.lbr;
	}

	public void setLbr(BigDecimal lbr) {
		this.lbr = lbr;
	}


	public BigDecimal getLbs() {
		return this.lbs;
	}

	public void setLbs(BigDecimal lbs) {
		this.lbs = lbs;
	}


	public byte getLcpa() {
		return this.lcpa;
	}

	public void setLcpa(byte lcpa) {
		this.lcpa = lcpa;
	}


	public int getLcpy() {
		return this.lcpy;
	}

	public void setLcpy(int lcpy) {
		this.lcpy = lcpy;
	}


	public byte getLcra() {
		return this.lcra;
	}

	public void setLcra(byte lcra) {
		this.lcra = lcra;
	}


	public int getLcry() {
		return this.lcry;
	}

	public void setLcry(int lcry) {
		this.lcry = lcry;
	}


	public byte getLea() {
		return this.lea;
	}

	public void setLea(byte lea) {
		this.lea = lea;
	}


	public int getLey() {
		return this.ley;
	}

	public void setLey(int ley) {
		this.ley = ley;
	}


	public byte getLga() {
		return this.lga;
	}

	public void setLga(byte lga) {
		this.lga = lga;
	}


	public int getLgy() {
		return this.lgy;
	}

	public void setLgy(int lgy) {
		this.lgy = lgy;
	}


	public BigDecimal getLnp() {
		return this.lnp;
	}

	public void setLnp(BigDecimal lnp) {
		this.lnp = lnp;
	}


	public BigDecimal getLnr() {
		return this.lnr;
	}

	public void setLnr(BigDecimal lnr) {
		this.lnr = lnr;
	}


	public byte getLpc() {
		return this.lpc;
	}

	public void setLpc(byte lpc) {
		this.lpc = lpc;
	}


	public byte getLta() {
		return this.lta;
	}

	public void setLta(byte lta) {
		this.lta = lta;
	}


	public int getLty() {
		return this.lty;
	}

	public void setLty(int lty) {
		this.lty = lty;
	}


	public byte getMda() {
		return this.mda;
	}

	public void setMda(byte mda) {
		this.mda = mda;
	}


	public int getMdy() {
		return this.mdy;
	}

	public void setMdy(int mdy) {
		this.mdy = mdy;
	}


	public byte getMpc() {
		return this.mpc;
	}

	public void setMpc(byte mpc) {
		this.mpc = mpc;
	}


	public byte getNha() {
		return this.nha;
	}

	public void setNha(byte nha) {
		this.nha = nha;
	}


	public int getNpy() {
		return this.npy;
	}

	public void setNpy(int npy) {
		this.npy = npy;
	}


	public byte getOhp() {
		return this.ohp;
	}

	public void setOhp(byte ohp) {
		this.ohp = ohp;
	}


	public byte getP1a() {
		return this.p1a;
	}

	public void setP1a(byte p1a) {
		this.p1a = p1a;
	}


	public int getP1y() {
		return this.p1y;
	}

	public void setP1y(int p1y) {
		this.p1y = p1y;
	}


	public byte getP2a() {
		return this.p2a;
	}

	public void setP2a(byte p2a) {
		this.p2a = p2a;
	}


	public int getP2y() {
		return this.p2y;
	}

	public void setP2y(int p2y) {
		this.p2y = p2y;
	}


	public byte getP3a() {
		return this.p3a;
	}

	public void setP3a(byte p3a) {
		this.p3a = p3a;
	}


	public int getP3y() {
		return this.p3y;
	}

	public void setP3y(int p3y) {
		this.p3y = p3y;
	}


	public byte getPa() {
		return this.pa;
	}

	public void setPa(byte pa) {
		this.pa = pa;
	}


	public byte getPbep() {
		return this.pbep;
	}

	public void setPbep(byte pbep) {
		this.pbep = pbep;
	}


	public byte getPc() {
		return this.pc;
	}

	public void setPc(byte pc) {
		this.pc = pc;
	}


	public int getPen() {
		return this.pen;
	}

	public void setPen(int pen) {
		this.pen = pen;
	}


	public byte getPfd() {
		return this.pfd;
	}

	public void setPfd(byte pfd) {
		this.pfd = pfd;
	}


	public byte getPfn() {
		return this.pfn;
	}

	public void setPfn(byte pfn) {
		this.pfn = pfn;
	}


	public int getPld() {
		return this.pld;
	}

	public void setPld(int pld) {
		this.pld = pld;
	}


	public int getPlo() {
		return this.plo;
	}

	public void setPlo(int plo) {
		this.plo = plo;
	}


	public byte getPr() {
		return this.pr;
	}

	public void setPr(byte pr) {
		this.pr = pr;
	}


	public int getPry() {
		return this.pry;
	}

	public void setPry(int pry) {
		this.pry = pry;
	}


	public byte getPts() {
		return this.pts;
	}

	public void setPts(byte pts) {
		this.pts = pts;
	}


	public byte getPu() {
		return this.pu;
	}

	public void setPu(byte pu) {
		this.pu = pu;
	}


	public int getPy() {
		return this.py;
	}

	public void setPy(int py) {
		this.py = py;
	}


	public byte getQ1p() {
		return this.q1p;
	}

	public void setQ1p(byte q1p) {
		this.q1p = q1p;
	}


	public byte getQ1pa() {
		return this.q1pa;
	}

	public void setQ1pa(byte q1pa) {
		this.q1pa = q1pa;
	}


	public int getQ1py() {
		return this.q1py;
	}

	public void setQ1py(int q1py) {
		this.q1py = q1py;
	}


	public byte getQ1ra() {
		return this.q1ra;
	}

	public void setQ1ra(byte q1ra) {
		this.q1ra = q1ra;
	}


	public int getQ1ry() {
		return this.q1ry;
	}

	public void setQ1ry(int q1ry) {
		this.q1ry = q1ry;
	}


	public byte getQ2p() {
		return this.q2p;
	}

	public void setQ2p(byte q2p) {
		this.q2p = q2p;
	}


	public byte getQ3p() {
		return this.q3p;
	}

	public void setQ3p(byte q3p) {
		this.q3p = q3p;
	}


	public byte getQ4p() {
		return this.q4p;
	}

	public void setQ4p(byte q4p) {
		this.q4p = q4p;
	}


	public byte getQba() {
		return this.qba;
	}

	public void setQba(byte qba) {
		this.qba = qba;
	}


	public int getQby() {
		return this.qby;
	}

	public void setQby(int qby) {
		this.qby = qby;
	}


	public byte getR1a() {
		return this.r1a;
	}

	public void setR1a(byte r1a) {
		this.r1a = r1a;
	}


	public int getR1y() {
		return this.r1y;
	}

	public void setR1y(int r1y) {
		this.r1y = r1y;
	}


	public byte getR2a() {
		return this.r2a;
	}

	public void setR2a(byte r2a) {
		this.r2a = r2a;
	}


	public int getR2y() {
		return this.r2y;
	}

	public void setR2y(int r2y) {
		this.r2y = r2y;
	}


	public byte getR3a() {
		return this.r3a;
	}

	public void setR3a(byte r3a) {
		this.r3a = r3a;
	}


	public int getR3y() {
		return this.r3y;
	}

	public void setR3y(int r3y) {
		this.r3y = r3y;
	}


	public byte getRa() {
		return this.ra;
	}

	public void setRa(byte ra) {
		this.ra = ra;
	}


	public byte getRba() {
		return this.rba;
	}

	public void setRba(byte rba) {
		this.rba = rba;
	}


	public int getRby() {
		return this.rby;
	}

	public void setRby(int rby) {
		this.rby = rby;
	}


	public byte getRea() {
		return this.rea;
	}

	public void setRea(byte rea) {
		this.rea = rea;
	}


	public int getRey() {
		return this.rey;
	}

	public void setRey(int rey) {
		this.rey = rey;
	}


	public byte getRfd() {
		return this.rfd;
	}

	public void setRfd(byte rfd) {
		this.rfd = rfd;
	}


	public byte getRga() {
		return this.rga;
	}

	public void setRga(byte rga) {
		this.rga = rga;
	}


	public int getRgy() {
		return this.rgy;
	}

	public void setRgy(int rgy) {
		this.rgy = rgy;
	}


	public byte getRta() {
		return this.rta;
	}

	public void setRta(byte rta) {
		this.rta = rta;
	}


	public byte getRtd() {
		return this.rtd;
	}

	public void setRtd(byte rtd) {
		this.rtd = rtd;
	}


	public int getRty() {
		return this.rty;
	}

	public void setRty(int rty) {
		this.rty = rty;
	}


	public int getRy() {
		return this.ry;
	}

	public void setRy(int ry) {
		this.ry = ry;
	}


	public byte getRza() {
		return this.rza;
	}

	public void setRza(byte rza) {
		this.rza = rza;
	}


	public byte getRzc() {
		return this.rzc;
	}

	public void setRzc(byte rzc) {
		this.rzc = rzc;
	}


	public byte getRzpa() {
		return this.rzpa;
	}

	public void setRzpa(byte rzpa) {
		this.rzpa = rzpa;
	}


	public int getRzpy() {
		return this.rzpy;
	}

	public void setRzpy(int rzpy) {
		this.rzpy = rzpy;
	}


	public byte getRzra() {
		return this.rzra;
	}

	public void setRzra(byte rzra) {
		this.rzra = rzra;
	}


	public int getRzry() {
		return this.rzry;
	}

	public void setRzry(int rzry) {
		this.rzry = rzry;
	}


	public byte getS1pp() {
		return this.s1pp;
	}

	public void setS1pp(byte s1pp) {
		this.s1pp = s1pp;
	}


	public byte getS1rp() {
		return this.s1rp;
	}

	public void setS1rp(byte s1rp) {
		this.s1rp = s1rp;
	}


	public byte getS2pp() {
		return this.s2pp;
	}

	public void setS2pp(byte s2pp) {
		this.s2pp = s2pp;
	}


	public byte getS2rp() {
		return this.s2rp;
	}

	public void setS2rp(byte s2rp) {
		this.s2rp = s2rp;
	}


	public byte getS3a() {
		return this.s3a;
	}

	public void setS3a(byte s3a) {
		this.s3a = s3a;
	}


	public byte getS3c() {
		return this.s3c;
	}

	public void setS3c(byte s3c) {
		this.s3c = s3c;
	}


	public byte getS3pp() {
		return this.s3pp;
	}

	public void setS3pp(byte s3pp) {
		this.s3pp = s3pp;
	}


	public byte getS3rp() {
		return this.s3rp;
	}

	public void setS3rp(byte s3rp) {
		this.s3rp = s3rp;
	}


	public int getSfpy() {
		return this.sfpy;
	}

	public void setSfpy(int sfpy) {
		this.sfpy = sfpy;
	}


	public byte getSga() {
		return this.sga;
	}

	public void setSga(byte sga) {
		this.sga = sga;
	}


	public int getSgy() {
		return this.sgy;
	}

	public void setSgy(int sgy) {
		this.sgy = sgy;
	}


	public byte getSk() {
		return this.sk;
	}

	public void setSk(byte sk) {
		this.sk = sk;
	}


	public int getSky() {
		return this.sky;
	}

	public void setSky(int sky) {
		this.sky = sky;
	}


	public byte getSla() {
		return this.sla;
	}

	public void setSla(byte sla) {
		this.sla = sla;
	}


	public int getSly() {
		return this.sly;
	}

	public void setSly(int sly) {
		this.sly = sly;
	}


	public byte getSma() {
		return this.sma;
	}

	public void setSma(byte sma) {
		this.sma = sma;
	}


	public int getSmy() {
		return this.smy;
	}

	public void setSmy(int smy) {
		this.smy = smy;
	}


	public byte getSpc() {
		return this.spc;
	}

	public void setSpc(byte spc) {
		this.spc = spc;
	}


	public byte getSpp() {
		return this.spp;
	}

	public void setSpp(byte spp) {
		this.spp = spp;
	}


	public byte getSra() {
		return this.sra;
	}

	public void setSra(byte sra) {
		this.sra = sra;
	}


	public byte getSrp() {
		return this.srp;
	}

	public void setSrp(byte srp) {
		this.srp = srp;
	}


	public int getSry() {
		return this.sry;
	}

	public void setSry(int sry) {
		this.sry = sry;
	}


	public byte getStf() {
		return this.stf;
	}

	public void setStf(byte stf) {
		this.stf = stf;
	}


	public byte getTb() {
		return this.tb;
	}

	public void setTb(byte tb) {
		this.tb = tb;
	}


	public byte getTd() {
		return this.td;
	}

	public void setTd(byte td) {
		this.td = td;
	}


	public byte getTdp() {
		return this.tdp;
	}

	public void setTdp(byte tdp) {
		this.tdp = tdp;
	}


	public byte getTdr() {
		return this.tdr;
	}

	public void setTdr(byte tdr) {
		this.tdr = tdr;
	}


	public byte getTdt() {
		return this.tdt;
	}

	public void setTdt(byte tdt) {
		this.tdt = tdt;
	}


	public byte getTea() {
		return this.tea;
	}

	public void setTea(byte tea) {
		this.tea = tea;
	}


	public int getTey() {
		return this.tey;
	}

	public void setTey(int tey) {
		this.tey = tey;
	}


	@Id
	@Column(insertable=false, updatable=false)
	public int getTid() {
		return this.tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}


	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}


	public BigDecimal getTop() {
		return this.top;
	}

	public void setTop(BigDecimal top) {
		this.top = top;
	}


	public byte getWr1a() {
		return this.wr1a;
	}

	public void setWr1a(byte wr1a) {
		this.wr1a = wr1a;
	}


	public int getWr1y() {
		return this.wr1y;
	}

	public void setWr1y(int wr1y) {
		this.wr1y = wr1y;
	}


	public byte getWr3a() {
		return this.wr3a;
	}

	public void setWr3a(byte wr3a) {
		this.wr3a = wr3a;
	}


	public int getWr3y() {
		return this.wr3y;
	}

	public void setWr3y(int wr3y) {
		this.wr3y = wr3y;
	}


	//bi-directional many-to-one association to Game
	@ManyToOne
	@JoinColumn(name="gid", referencedColumnName="gid")
	public Game getGame() {
		return this.game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}