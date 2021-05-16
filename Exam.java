package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EXAM database table.
 * 
 */
@Entity
@NamedQuery(name="Exam.findAll", query="SELECT e FROM Exam e")
public class Exam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int examid;

	private String endtime;

	@Temporal(TemporalType.DATE)
	private Date exdate;

	private String exname;

	private String starttime;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="exam")
	private List<Question> questions;

	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="exam")
	private List<Result> results;

	public Exam() {
	}

	public int getExamid() {
		return this.examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Date getExdate() {
		return this.exdate;
	}

	public void setExdate(Date exdate) {
		this.exdate = exdate;
	}

	public String getExname() {
		return this.exname;
	}

	public void setExname(String exname) {
		this.exname = exname;
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setExam(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setExam(null);

		return question;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Result addResult(Result result) {
		getResults().add(result);
		result.setExam(this);

		return result;
	}

	public Result removeResult(Result result) {
		getResults().remove(result);
		result.setExam(null);

		return result;
	}

}