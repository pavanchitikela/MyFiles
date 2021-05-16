package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FORGOTPASSWORD database table.
 * 
 */
@Entity
@NamedQuery(name="Forgotpassword.findAll", query="SELECT f FROM Forgotpassword f")
public class Forgotpassword implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emailid;

	@Temporal(TemporalType.DATE)
	private Date exprdate;

	private String token;

	public Forgotpassword() {
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Date getExprdate() {
		return this.exprdate;
	}

	public void setExprdate(Date exprdate) {
		this.exprdate = exprdate;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}