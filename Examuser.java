package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EXAMUSER database table.
 * 
 */
@Entity
@NamedQuery(name="Examuser.findAll", query="SELECT e FROM Examuser e")
public class Examuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int userid;

	private String city;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String emailid;

	private long mobile;

	private String password;

	private String qual;

	@Column(name="\"STATE\"")
	private String state;

	private String username;

	private int yoc;

	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="examuser")
	private List<Result> results;

	//bi-directional many-to-one association to Sessiondetail
	@OneToMany(mappedBy="examuser")
	private List<Sessiondetail> sessiondetails;

	//bi-directional many-to-one association to Useroption
	@OneToMany(mappedBy="examuser")
	private List<Useroption> useroptions;

	public Examuser() {
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getMobile() {
		return this.mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQual() {
		return this.qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getYoc() {
		return this.yoc;
	}

	public void setYoc(int yoc) {
		this.yoc = yoc;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Result addResult(Result result) {
		getResults().add(result);
		result.setExamuser(this);

		return result;
	}

	public Result removeResult(Result result) {
		getResults().remove(result);
		result.setExamuser(null);

		return result;
	}

	public List<Sessiondetail> getSessiondetails() {
		return this.sessiondetails;
	}

	public void setSessiondetails(List<Sessiondetail> sessiondetails) {
		this.sessiondetails = sessiondetails;
	}

	public Sessiondetail addSessiondetail(Sessiondetail sessiondetail) {
		getSessiondetails().add(sessiondetail);
		sessiondetail.setExamuser(this);

		return sessiondetail;
	}

	public Sessiondetail removeSessiondetail(Sessiondetail sessiondetail) {
		getSessiondetails().remove(sessiondetail);
		sessiondetail.setExamuser(null);

		return sessiondetail;
	}

	public List<Useroption> getUseroptions() {
		return this.useroptions;
	}

	public void setUseroptions(List<Useroption> useroptions) {
		this.useroptions = useroptions;
	}

	public Useroption addUseroption(Useroption useroption) {
		getUseroptions().add(useroption);
		useroption.setExamuser(this);

		return useroption;
	}

	public Useroption removeUseroption(Useroption useroption) {
		getUseroptions().remove(useroption);
		useroption.setExamuser(null);

		return useroption;
	}

}