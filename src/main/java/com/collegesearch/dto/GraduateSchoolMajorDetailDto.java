package com.collegesearch.dto;

import com.collegesearch.domain.school.GraduateSchoolMajor;

public class GraduateSchoolMajorDetailDto {
	private String  type;
	private String  city;
	private String  state;
	private String  setting;
	private Integer size;
	private Integer tuitionFee;
	private Integer instateTuitionFee;
	private Integer roomBoard;
	private String schoolName;
	private String majorName;
	private String degree;
	private String test;
	private String languageTest;
	private String phone;
	private String email;
	private Integer rank;
	private String admissionWebpage;
	private String deadline;
	private Integer rankOverall;
	private Float   percentageClassesFewerThan20Students;
    private Float   percentageClassesMoreThan50Students;
    private Float   percentageClassesBetween25And50Students;
	private Float   reputationScore;
	private String  selectivity;
	private Float   studentFacultyRatio;
	private String  category;
	private String  website;

	public GraduateSchoolMajorDetailDto(GraduateSchoolMajor graduateSchoolMajor){
		if(graduateSchoolMajor.getSchool() != null) {
			this.schoolName = graduateSchoolMajor.getSchool().getName();
			this.rankOverall = graduateSchoolMajor.getSchool().getRankOverall();                            
			this.percentageClassesFewerThan20Students = graduateSchoolMajor.getSchool().getPercentageClassesFewerThan20Students();   
			this.percentageClassesMoreThan50Students = graduateSchoolMajor.getSchool().getPercentageClassesMoreThan50Students();    
			this.percentageClassesBetween25And50Students = graduateSchoolMajor.getSchool().getPercentageClassesBetween25And50Students();
			this.reputationScore = graduateSchoolMajor.getSchool().getReputationScore();                        
			this.selectivity = graduateSchoolMajor.getSchool().getSelectivity();                            
			this.studentFacultyRatio = graduateSchoolMajor.getSchool().getStudentFacultyRatio();                    
			this.category = graduateSchoolMajor.getSchool().getCategory();                               
			this.website = graduateSchoolMajor.getSchool().getWebsite();
			this.type = graduateSchoolMajor.getSchool().getType();              
			this.city = graduateSchoolMajor.getSchool().getCity();              
			this.state = graduateSchoolMajor.getSchool().getState();             
			this.setting = graduateSchoolMajor.getSchool().getSetting();           
			this.size = graduateSchoolMajor.getSchool().getSize();              
			this.tuitionFee = graduateSchoolMajor.getSchool().getTuitionFee();        
			this.instateTuitionFee = graduateSchoolMajor.getSchool().getInstateTuitionFee(); 
			this.roomBoard = graduateSchoolMajor.getSchool().getRoomBoard();         
		}
		if(graduateSchoolMajor.getGraduateMajor()!=null) {
			this.majorName = graduateSchoolMajor.getGraduateMajor().getName();
		}
		if(graduateSchoolMajor.getDegree() == "PHDMS") {
			this.degree = "PHD & Master";
		}else if(graduateSchoolMajor.getDegree() == "MS") {
			this.degree = "Master";
		}else {
			this.degree = graduateSchoolMajor.getDegree();
		}
		StringBuilder sBuilder = new StringBuilder("");
		if(graduateSchoolMajor.getToefl() != null) {
			sBuilder.append("Toefl/");
			if(graduateSchoolMajor.getToefl() == 0) {
				sBuilder.append("--");
			}else {
				sBuilder.append(graduateSchoolMajor.getToefl()+" ");
			}
		}
		if(graduateSchoolMajor.getIelts() != null) {
			sBuilder.append("Ielts/");
			if(graduateSchoolMajor.getIelts() == 0) {
				sBuilder.append("--");
			}else {
				sBuilder.append(graduateSchoolMajor.getIelts()+" ");
			}
		}
		this.languageTest=sBuilder.toString();
		
		StringBuilder sBuilder2=new StringBuilder("");
		if(graduateSchoolMajor.getGre()!=null) {
			sBuilder2.append("Gre/");
			if(graduateSchoolMajor.getGre() == 0) {
				sBuilder2.append("--");
			}else {
				sBuilder2.append(graduateSchoolMajor.getGre()+" ");
			}
		}
		if(graduateSchoolMajor.getGmat()!=null) {
			sBuilder2.append("Gmat/");
			if(graduateSchoolMajor.getGmat() == 0) {
				sBuilder2.append("--");
			}else {
				sBuilder2.append(graduateSchoolMajor.getGmat()+" ");
			}
		}
		if(graduateSchoolMajor.getLsat()!=null) {
			sBuilder2.append("Lsat/");
			if(graduateSchoolMajor.getLsat() == 0) {
				sBuilder2.append("--");
			}else {
				sBuilder2.append(graduateSchoolMajor.getLsat()+" ");
			}
		}
		this.test=sBuilder2.toString();
		this.phone = graduateSchoolMajor.getPhone();
		this.email = graduateSchoolMajor.getEmail();
		this.rank = graduateSchoolMajor.getRank();
		StringBuilder sBuilder3=new StringBuilder("");
		sBuilder3.append("Fall: ");
		if(graduateSchoolMajor.getFallApplicationDeadline() != null) {
			if(graduateSchoolMajor.getFallApplicationDeadline() / 1000 == 0) { // check the digit of that date
				sBuilder3.append("0");
			}
			sBuilder3.append(graduateSchoolMajor.getFallApplicationDeadline() / 100 + ".");
			if(graduateSchoolMajor.getFallApplicationDeadline()%100 < 10) {
				sBuilder3.append("0");
			}
			sBuilder3.append(graduateSchoolMajor.getFallApplicationDeadline()%100);
		}else {
			sBuilder3.append("--");
		}
		sBuilder3.append(" Spring: ");
		if(graduateSchoolMajor.getSpringApplicationDeadline() != null) {
			if(graduateSchoolMajor.getSpringApplicationDeadline() / 1000 == 0) { // check the digit of that date
				sBuilder3.append("0");
			}
			sBuilder3.append(graduateSchoolMajor.getSpringApplicationDeadline() / 100 + ".");
			if(graduateSchoolMajor.getSpringApplicationDeadline()%100 < 10) {
				sBuilder3.append("0");
			}
			sBuilder3.append(graduateSchoolMajor.getSpringApplicationDeadline()%100);
		}else {
			sBuilder3.append("--");
		}
		deadline=sBuilder3.toString();
		this.admissionWebpage = graduateSchoolMajor.getAdmissionWebpage();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getSetting() {
		return setting;
	}
	public void setSetting(String setting) {
		this.setting = setting;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getTuitionFee() {
		return tuitionFee;
	}
	public void setTuitionFee(Integer tuitionFee) {
		this.tuitionFee = tuitionFee;
	}
	public Integer getInstateTuitionFee() {
		return instateTuitionFee;
	}
	public void setInstateTuitionFee(Integer instateTuitionFee) {
		this.instateTuitionFee = instateTuitionFee;
	}
	public Integer getRoomBoard() {
		return roomBoard;
	}
	public void setRoomBoard(Integer roomBoard) {
		this.roomBoard = roomBoard;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getLanguageTest() {
		return languageTest;
	}
	public void setLanguageTest(String languageTest) {
		this.languageTest = languageTest;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRank() {
		return rank;
	}
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	public String getAdmissionWebpage() {
		return admissionWebpage;
	}
	public void setAdmissionWebpage(String admissionWebpage) {
		this.admissionWebpage = admissionWebpage;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public Integer getRankOverall() {
		return rankOverall;
	}
	public void setRankOverall(Integer rankOverall) {
		this.rankOverall = rankOverall;
	}
	public Float getPercentageClassesFewerThan20Students() {
		return percentageClassesFewerThan20Students;
	}
	public void setPercentageClassesFewerThan20Students(Float percentageClassesFewerThan20Students) {
		this.percentageClassesFewerThan20Students = percentageClassesFewerThan20Students;
	}
	public Float getPercentageClassesMoreThan50Students() {
		return percentageClassesMoreThan50Students;
	}
	public void setPercentageClassesMoreThan50Students(Float percentageClassesMoreThan50Students) {
		this.percentageClassesMoreThan50Students = percentageClassesMoreThan50Students;
	}
	public Float getPercentageClassesBetween25And50Students() {
		return percentageClassesBetween25And50Students;
	}
	public void setPercentageClassesBetween25And50Students(Float percentageClassesBetween25And50Students) {
		this.percentageClassesBetween25And50Students = percentageClassesBetween25And50Students;
	}
	public Float getReputationScore() {
		return reputationScore;
	}
	public void setReputationScore(Float reputationScore) {
		this.reputationScore = reputationScore;
	}
	public String getSelectivity() {
		return selectivity;
	}
	public void setSelectivity(String selectivity) {
		this.selectivity = selectivity;
	}
	public Float getStudentFacultyRatio() {
		return studentFacultyRatio;
	}
	public void setStudentFacultyRatio(Float studentFacultyRatio) {
		this.studentFacultyRatio = studentFacultyRatio;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

}