package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USEROPTIONS database table.
 * 
 */
@Entity
@Table(name="USEROPTIONS")
@NamedQuery(name="Useroption.findAll", query="SELECT u FROM Useroption u")
public class Useroption implements Serializable {
	private static final long serialVersionUID = 1L;

	private String usoption;

	//bi-directional many-to-one association to Examuser
	@ManyToOne
	@JoinColumn(name="USERID")
	private Examuser examuser;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="QSID")
	private Question question;

	public Useroption() {
	}

	public String getUsoption() {
		return this.usoption;
	}

	public void setUsoption(String usoption) {
		this.usoption = usoption;
	}

	public Examuser getExamuser() {
		return this.examuser;
	}

	public void setExamuser(Examuser examuser) {
		this.examuser = examuser;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}