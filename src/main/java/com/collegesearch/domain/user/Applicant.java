package com.collegesearch.domain.user;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Applicant implements java.io.Serializable {

	private static final long serialVersionUID = 6749990758703320L;
	
	private Integer sat1ReadingScore;
	private Integer sat1MathScore;
	private Integer sat1EssayScore;
	private Integer sat1TotalScore;
	//private List<Map<String, Integer>> satSubjectScores;
	private List<String> satSubjects = new ArrayList<String>();
	//private String[] satSubjects = new String[10];
	private Integer actScore;
	private Integer toeflScore;
	private Integer ieltsScore;
	private Float gpaScore;

	
	public Integer getActScore() {
		return actScore;
	}

	public void setActScore(Integer actScore) {
		this.actScore = actScore;
	}
	
	public Integer getToeflScore() {
		return toeflScore;
	}

	public void setToeflScore(Integer toeflScore) {
		this.toeflScore = toeflScore;
	}

	public Integer getIeltsScore() {
		return ieltsScore;
	}

	public void setIeltsScore(Integer ieltsScore) {
		this.ieltsScore = ieltsScore;
	}
	
	public Float getGpaScore() {
		return gpaScore;
	}

	public void setGpaScore(Float gpaScore) {
		this.gpaScore = gpaScore;
	}

	public Integer getSat1ReadingScore() {
		return sat1ReadingScore;
	}

	public void setSat1ReadingScore(Integer sat1ReadingScore) {
		this.sat1ReadingScore = sat1ReadingScore;
	}

	public Integer getSat1MathScore() {
		return sat1MathScore;
	}

	public void setSat1MathScore(Integer sat1MathScore) {
		this.sat1MathScore = sat1MathScore;
	}

	public Integer getSat1EssayScore() {
		return sat1EssayScore;
	}

	public void setSat1EssayScore(Integer sat1EssayScore) {
		this.sat1EssayScore = sat1EssayScore;
	}

	public Integer getSat1TotalScore() {
		return sat1TotalScore;
	}

	public void setSat1TotalScore(Integer sat1TotalScore) {
		this.sat1TotalScore = sat1TotalScore;
	}

	public List<String> getSatSubjects() {
		return satSubjects;
	}

	public void setSatSubjects(List<String> satSubjects) {
		this.satSubjects = satSubjects;
	}

	public Applicant() {
	}

	
	/*
	@Transient
	public Integer getAdjustedSat1Standard() {
		if(sat1Percentile25 <= 0 || sat1Percentile75 <= 0) {
			adjustedSat1Standard = 0;
			return 0;
		}	
		float sat = 0.0f;
		if(acceptRate <= 10) 
		   sat = actPercentile75 * 1.2f; //for top 10 return 120% of Percentile75;
		else if(acceptRate > 10 && acceptRate <= 20) 
			  sat = actPercentile75 * 1.15f; //for top 10-25 return 115% of Percentile75
		else if(acceptRate > 20 && acceptRate <= 30) 
			   sat = actPercentile75 * 1.1f; //for top 20-30 return 110% of Percentile75
		else if(acceptRate > 30 && acceptRate <= 40)
			   sat = actPercentile75 * 1.05f; //for top 30-40 return 105% of Percentile75
		else if(acceptRate > 40 && acceptRate <= 50) 
			   sat = actPercentile75 * 1.0f;  //for top 40-50 return 100% of Percentile75
		else if(acceptRate > 50 && acceptRate <= 60) 
			   sat = actPercentile75 * 0.9f;  
		else if(acceptRate > 60 && acceptRate <= 70) //for top 40-60 return (Percentile25 + Percentile75)/2
			   sat = actPercentile75 * 0.8f;  //for top 60-70 return 80% of Percentile75
			//adjustedActStandard = (actPercentile25 + actPercentile75)/2; //for top 50-60 return 90% of Percentile75
		else if(acceptRate > 70)                     //for top > 60 Percentile25
			   sat = actPercentile25;
		adjustedSat1Standard = Math.round(sat);
		return adjustedSat1Standard;
	}

	public void setAdjustedSat1Standard(Integer adjustedSat1Standard) {
		this.adjustedSat1Standard = adjustedSat1Standard;
	}
	
	@Transient
	public boolean isSat1ScoreSatisfied(int sat1Score){
		if(getAdjustedSat1Standard() == 0 )
		   return false;	
		return (sat1Score >= getAdjustedSat1Standard());
	}
	
	@Transient
	public Integer getAdjustedActStandard() {
		if(actPercentile25 <= 0 || actPercentile75 <= 0) {
			adjustedActStandard = 0;
			return 0;
		}	
		float act = 0.0f;
		if(acceptRate <= 10) 
		   act = actPercentile75 * 1.2f; //for top 10 return 120% of Percentile75;
		else if(acceptRate > 10 && acceptRate <= 20) 
			  act = actPercentile75 * 1.15f; //for top 10-25 return 115% of Percentile75
		else if(acceptRate > 20 && acceptRate <= 30) 
			   act = actPercentile75 * 1.1f; //for top 20-30 return 110% of Percentile75
		else if(acceptRate > 30 && acceptRate <= 40)
			   act = actPercentile75 * 1.05f; //for top 30-40 return 105% of Percentile75
		else if(acceptRate > 40 && acceptRate <= 50) 
			   act = actPercentile75 * 1.0f;  //for top 40-50 return 100% of Percentile75
		else if(acceptRate > 50 && acceptRate <= 60) 
			   act = actPercentile75 * 0.9f;  
		else if(acceptRate > 60 && acceptRate <= 70) //for top 40-60 return (Percentile25 + Percentile75)/2
			   act = actPercentile75 * 0.8f;  //for top 60-70 return 80% of Percentile75
			//adjustedActStandard = (actPercentile25 + actPercentile75)/2; //for top 50-60 return 90% of Percentile75
		else if(acceptRate > 70)                     //for top > 60 Percentile25
			   act = actPercentile25;
		adjustedActStandard = Math.round(act);
		return adjustedActStandard;
	}

	public void setAdjustedActStandard(Integer adjustedActStandard) {
		this.adjustedActStandard = adjustedActStandard;
	}
	
	@Transient
	public boolean isActScoreSatisfied(int actScore){
		if(getAdjustedActStandard() == 0 )
		   return false;	
		return (actScore >= getAdjustedActStandard());
	}
	*/
	
	
}
