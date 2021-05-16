package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the QUESTIONS database table.
 * 
 */
@Entity
@Table(name="QUESTIONS")
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int qsid;

	private String crctopt;

	private String opta;

	private String optb;

	private String optc;

	private String optd;

	private String question;

	//bi-directional many-to-one association to Exam
	@ManyToOne
	@JoinColumn(name="EXAMID")
	private Exam exam;

	//bi-directional many-to-one association to Level
	@ManyToOne
	@JoinColumn(name="LEVELID")
	private Level level;

	//bi-directional many-to-one association to Useroption
	@OneToMany(mappedBy="question")
	private List<Useroption> useroptions;

	public Question() {
	}

	public int getQsid() {
		return this.qsid;
	}

	public void setQsid(int qsid) {
		this.qsid = qsid;
	}

	public String getCrctopt() {
		return this.crctopt;
	}

	public void setCrctopt(String crctopt) {
		this.crctopt = crctopt;
	}

	public String getOpta() {
		return this.opta;
	}

	public void setOpta(String opta) {
		this.opta = opta;
	}

	public String getOptb() {
		return this.optb;
	}

	public void setOptb(String optb) {
		this.optb = optb;
	}

	public String getOptc() {
		return this.optc;
	}

	public void setOptc(String optc) {
		this.optc = optc;
	}

	public String getOptd() {
		return this.optd;
	}

	public void setOptd(String optd) {
		this.optd = optd;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Exam getExam() {
		return this.exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public List<Useroption> getUseroptions() {
		return this.useroptions;
	}

	public void setUseroptions(List<Useroption> useroptions) {
		this.useroptions = useroptions;
	}

	public Useroption addUseroption(Useroption useroption) {
		getUseroptions().add(useroption);
		useroption.setQuestion(this);

		return useroption;
	}

	public Useroption removeUseroption(Useroption useroption) {
		getUseroptions().remove(useroption);
		useroption.setQuestion(null);

		return useroption;
	}

}