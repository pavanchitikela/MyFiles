package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the LEVELS database table.
 * 
 */
@Entity
@Table(name="LEVELS")
@NamedQuery(name="Level.findAll", query="SELECT l FROM Level l")
public class Level implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int levelid;

	private int cutoffmarks;

	private int duration;

	private int qstcount;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="level")
	private List<Question> questions;

	//bi-directional many-to-one association to Result
	@OneToMany(mappedBy="level")
	private List<Result> results;

	public Level() {
	}

	public int getLevelid() {
		return this.levelid;
	}

	public void setLevelid(int levelid) {
		this.levelid = levelid;
	}

	public int getCutoffmarks() {
		return this.cutoffmarks;
	}

	public void setCutoffmarks(int cutoffmarks) {
		this.cutoffmarks = cutoffmarks;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getQstcount() {
		return this.qstcount;
	}

	public void setQstcount(int qstcount) {
		this.qstcount = qstcount;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setLevel(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setLevel(null);

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
		result.setLevel(this);

		return result;
	}

	public Result removeResult(Result result) {
		getResults().remove(result);
		result.setLevel(null);

		return result;
	}

}