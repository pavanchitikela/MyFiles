package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SESSIONDETAILS database table.
 * 
 */
@Entity
@Table(name="SESSIONDETAILS")
@NamedQuery(name="Sessiondetail.findAll", query="SELECT s FROM Sessiondetail s")
public class Sessiondetail implements Serializable {
	private static final long serialVersionUID = 1L;

	private String logintime;

	private String logoutime;

	//bi-directional many-to-one association to Examuser
	@ManyToOne
	@JoinColumn(name="USERID")
	private Examuser examuser;

	public Sessiondetail() {
	}

	public String getLogintime() {
		return this.logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

	public String getLogoutime() {
		return this.logoutime;
	}

	public void setLogoutime(String logoutime) {
		this.logoutime = logoutime;
	}

	public Examuser getExamuser() {
		return this.examuser;
	}

	public void setExamuser(Examuser examuser) {
		this.examuser = examuser;
	}

}