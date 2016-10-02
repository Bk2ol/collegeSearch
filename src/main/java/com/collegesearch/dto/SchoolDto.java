package com.collegesearch.dto;

import com.collegesearch.domain.school.School;

public class SchoolDto {
	private Integer rankOverall;
	private Integer totalCost;
	private Integer size;
	private Float   averageGpa;
	private Float   acceptRate;
	private String  schoolName;
	private String sat125and75;
    private String ToeflMinAndAvg;
	private String  applicationDeadline;
	private String  state;
	private String setting;
	private String type;
	private String category;
	
	public SchoolDto(School school) {
		this.schoolName = school.getName();
		this.rankOverall = school.getRankOverall();
		if(school.getRoomBoard() != null && school.getTuitionFee() != null) {
			this.totalCost = school.getRoomBoard()+school.getTuitionFee();
		}else {
			this.totalCost = null;
		}
		this.averageGpa = school.getAverageGpa();
		this.acceptRate = school.getAcceptRate();
		
		StringBuilder sBuilder1=new StringBuilder();
		if(school.getSat1Percentile25() != null) {
			sBuilder1.append(school.getSat1Percentile25());
		}else {
			sBuilder1.append("--");
		}
		sBuilder1.append(" / ");
		if(school.getSat1Percentile75() !=null) {
			sBuilder1.append(school.getSat1Percentile75());
		}else {
			sBuilder1.append("--");
		}
		this.sat125and75 = sBuilder1.toString();
		
		StringBuilder sBuilder2 = new StringBuilder();
		if(school.getInternationalStudentApplication()==null) {
			sBuilder2.append("UNKNOWN");
		}else {
			if(school.getInternationalStudentApplication().getMinimumToeflScore() != null) {
				sBuilder2.append(school.getInternationalStudentApplication().getMinimumToeflScore() + " ");
			}else {
				sBuilder2.append("--");
			}
			sBuilder2.append(" / ");
			if(school.getInternationalStudentApplication().getAverageToeflScore() != null) {
				sBuilder2.append(school.getInternationalStudentApplication().getAverageToeflScore());
			}else {
				sBuilder2.append("--");
			}
		}
		this.ToeflMinAndAvg = sBuilder2.toString();
		this.applicationDeadline = school.getApplicationDeadline();
		this.state = school.getState();
		this.type = school.getType();
		this.setting = school.getSetting();
		this.category = school.getCategory();
		if(school.getSize() != null) {
			this.size = school.getSize();
		}else {
			this.size = -1;
		}
	}
	
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Integer getRankOverall() {
		return rankOverall;
	}
	public void setRankOverall(Integer rankOverall) {
		this.rankOverall = rankOverall;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	public Float getAverageGpa() {
		return averageGpa;
	}
	public void setAverageGpa(Float averageGpa) {
		this.averageGpa = averageGpa;
	}
	public Float getAcceptRate() {
		return acceptRate;
	}
	public void setAcceptRate(Float acceptRate) {
		this.acceptRate = acceptRate;
	}
	public String getSat125and75() {
		return sat125and75;
	}
	public void setSat125and75(String sat125and75) {
		this.sat125and75 = sat125and75;
	}
	public String getToeflMinAndAvg() {
		return ToeflMinAndAvg;
	}
	public void setToeflMinAndAvg(String toeflMinAndAvg) {
		ToeflMinAndAvg = toeflMinAndAvg;
	}
	public String getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(String applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getSetting() {
		return setting;
	}
	public void setSetting(String setting) {
		this.setting = setting;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
