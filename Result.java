package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "RESULT" database table.
 * 
 */
@Entity
@Table(name="\"RESULT\"")
@NamedQuery(name="Result.findAll", query="SELECT r FROM Result r")
public class Result implements Serializable {
	private static final long serialVersionUID = 1L;

	private int attemptedqs;

	private int crctans;

	private int incrctans;

	private int marksscored;

	private int nonattemptedqs;

	private Double percentage;

	private int resultid;

	private int status;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="EXAMID")
	private Exam exam;

	//bi-directional many-to-one association to Examuser
	@ManyToOne
	@JoinColumn(name="USERID")
	private Examuser examuser;

	//bi-directional many-to-one association to Level
	@ManyToOne
	@JoinColumn(name="LEVELID")
	private Level level;

	public Result() {
	}

	public int getAttemptedqs() {
		return this.attemptedqs;
	}

	public void setAttemptedqs(int attemptedqs) {
		this.attemptedqs = attemptedqs;
	}

	public int getCrctans() {
		return this.crctans;
	}

	public void setCrctans(int crctans) {
		this.crctans = crctans;
	}

	public int getIncrctans() {
		return this.incrctans;
	}

	public void setIncrctans(int incrctans) {
		this.incrctans = incrctans;
	}

	public int getMarksscored() {
		return this.marksscored;
	}

	public void setMarksscored(int marksscored) {
		this.marksscored = marksscored;
	}

	public int getNonattemptedqs() {
		return this.nonattemptedqs;
	}

	public void setNonattemptedqs(int nonattemptedqs) {
		this.nonattemptedqs = nonattemptedqs;
	}

	public Double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public int getResultid() {
		return this.resultid;
	}

	public void setResultid(int resultid) {
		this.resultid = resultid;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Examuser getExamuser() {
		return this.examuser;
	}

	public void setExamuser(Examuser examuser) {
		this.examuser = examuser;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}