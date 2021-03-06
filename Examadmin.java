package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EXAMADMIN database table.
 * 
 */
@Entity
@NamedQuery(name="Examadmin.findAll", query="SELECT e FROM Examadmin e")
public class Examadmin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int adminid;

	private String email;

	private String password;

	private String username;

	public Examadmin() {
	}

	public int getAdminid() {
		return this.adminid;
	}

	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}