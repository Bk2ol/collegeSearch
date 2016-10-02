package com.collegesearch.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.collegesearch.domain.school.Major;
import com.collegesearch.domain.school.School;



public class SchoolDetailDto{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5639192850209639494L;

	private String  name;
	private String  type;
	private String  city;
	private String  state;
	private String  setting;
	private Integer size;
	private Integer tuitionFee;
	private Integer instateTuitionFee;
	private Integer roomBoard;
	private String  applicationDeadline;
	private String  satActReceivedDeadline;
	private String  earlyDecisionDeadline;
	private Float   percentageClassesFewerThan20Students;
    private Float   percentageClassesMoreThan50Students;
    private Float   percentageClassesBetween25And50Students;
  	private Integer applicationFee;
	private Integer sat1Percentile25;
	private Integer sat1Percentile75;
	private Integer actPercentile25;
	private Integer actPercentile75;
	private String  satActNotRequired;
	private Integer numberOfRequiredSat2;
	private Float   averageGpa;
	private Float   acceptRate;
	private Integer averageFreshmanRetentionRate;
    private Integer sixYearGraduationRate;
	private Integer rankOverall;
	private Float   reputationScore;
	private String  selectivity;
	private Integer hsClassTop10Percentage;
	private Float   studentFacultyRatio;
	private String  category;
	private String  calendar;
	private String  Phone;
	private String  website;
	private Integer maxResults;
	private Integer totalCost;
	private Integer averageSAT;
	
	private String  applicationDeadlineFall;
    private String  applicationDeadlineSpring;
    private String  separateApplicationFormRrequired;
    private String  conditionalAdmissionOffered;
    private String  toeflAcceptedInsteadOfSatOrAct;
    private Integer minimumToeflScore;
    private Integer averageToeflScore;
    private Float   minimumIeltsScore;
    private Float   averageIeltsScore;
    private Integer internationalStudentsApplying;
    private Integer internationalStudentsAccepted;
    private Integer internationalFreshmenEnrolled;
    private String  financialAid;
    private String  contact;
	private List<String> Major = new ArrayList<>();
	
	public SchoolDetailDto(School school) {
		this.name = school.getName();                                    
		this.type = school.getType();                                    
		this.city = school.getCity();                                    
		this.state = school.getState();                                   
		this.setting = school.getSetting();                                 
		this.size = school.getSize();                                    
		this.tuitionFee = school.getTuitionFee();                              
		this.instateTuitionFee = school.getInstateTuitionFee();                       
		this.roomBoard = school.getRoomBoard();                               
		this.applicationDeadline = school.getApplicationDeadline();                     
		this.satActReceivedDeadline = school.getSatActReceivedDeadline();                  
		this.earlyDecisionDeadline = school.getEarlyDecisionDeadline();                   
		this.percentageClassesFewerThan20Students = school.getPercentageClassesFewerThan20Students();    
		this.percentageClassesMoreThan50Students = school.getPercentageClassesMoreThan50Students();     
		this.percentageClassesBetween25And50Students = school.getPercentageClassesBetween25And50Students(); 
		this.applicationFee = school.getApplicationFee();                          
		this.sat1Percentile25 = school.getSat1Percentile25();                        
		this.sat1Percentile75 = school.getSat1Percentile75();                        
		this.actPercentile25 = school.getActPercentile25();                         
		this.actPercentile75 = school.getActPercentile75();                         
		this.satActNotRequired = school.getSatActNotRequired();                       
		this.numberOfRequiredSat2 = school.getNumberOfRequiredSat2();                    
		this.averageGpa = school.getAverageGpa();                              
		this.acceptRate = school.getAcceptRate();                              
		this.averageFreshmanRetentionRate = school.getAverageFreshmanRetentionRate();            
		this.sixYearGraduationRate = school.getSixYearGraduationRate();                    
		this.rankOverall = school.getRankOverall();                             
		this.reputationScore = school.getReputationScore();                         
		this.selectivity = school.getSelectivity();                             
		this.hsClassTop10Percentage = school.getHsClassTop10Percentage();                  
		this.studentFacultyRatio = school.getStudentFacultyRatio();                     
		this.category = school.getCategory();                                
		this.calendar = school.getCalendar();                                
		this.Phone = school.getPhone();                                   
		this.website = school.getWebsite();                                 
		this.maxResults = school.getMaxResults();                              
		this.totalCost = school.getTotalCost();                               
		this.averageSAT = school.getAverageSAT();                              
		                                         

		if( school.getInternationalStudentApplication() != null) {
			this.applicationDeadlineFall = school.getInternationalStudentApplication().getApplicationDeadlineFall();
			this.applicationDeadlineSpring = school.getInternationalStudentApplication().getApplicationDeadlineSpring();
			this.separateApplicationFormRrequired = school.getInternationalStudentApplication().getSeparateApplicationFormRrequired();
			this.conditionalAdmissionOffered = school.getInternationalStudentApplication().getConditionalAdmissionOffered();
			this.toeflAcceptedInsteadOfSatOrAct = school.getInternationalStudentApplication().getToeflAcceptedInsteadOfSatOrAct();
			this.minimumToeflScore = school.getInternationalStudentApplication().getMinimumToeflScore();
			this.averageToeflScore = school.getInternationalStudentApplication().getAverageToeflScore();
			this.minimumIeltsScore = school.getInternationalStudentApplication().getMinimumIeltsScore();
			this.averageIeltsScore = school.getInternationalStudentApplication().getAverageIeltsScore();
			this.internationalFreshmenEnrolled = school.getInternationalStudentApplication().getInternationalFreshmenEnrolled();
			this.internationalStudentsAccepted = school.getInternationalStudentApplication().getInternationalStudentsAccepted();
			this.internationalStudentsApplying = school.getInternationalStudentApplication().getInternationalStudentsApplying();
			this.financialAid = school.getInternationalStudentApplication().getFinancialAid();
			this.contact = school.getInternationalStudentApplication().getContact();
		}
		if(school.getBestMajors() != null) {
			Set<Major> tmpArr = school.getBestMajors();
			for(Major major : tmpArr) {
				this.Major.add(major.getName());
			}
		}
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getApplicationDeadline() {
		return applicationDeadline;
	}
	public void setApplicationDeadline(String applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
	}
	public String getSatActReceivedDeadline() {
		return satActReceivedDeadline;
	}
	public void setSatActReceivedDeadline(String satActReceivedDeadline) {
		this.satActReceivedDeadline = satActReceivedDeadline;
	}
	public String getEarlyDecisionDeadline() {
		return earlyDecisionDeadline;
	}
	public void setEarlyDecisionDeadline(String earlyDecisionDeadline) {
		this.earlyDecisionDeadline = earlyDecisionDeadline;
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
	public Integer getApplicationFee() {
		return applicationFee;
	}
	public void setApplicationFee(Integer applicationFee) {
		this.applicationFee = applicationFee;
	}
	public Integer getSat1Percentile25() {
		return sat1Percentile25;
	}
	public void setSat1Percentile25(Integer sat1Percentile25) {
		this.sat1Percentile25 = sat1Percentile25;
	}
	public Integer getSat1Percentile75() {
		return sat1Percentile75;
	}
	public void setSat1Percentile75(Integer sat1Percentile75) {
		this.sat1Percentile75 = sat1Percentile75;
	}
	public Integer getActPercentile25() {
		return actPercentile25;
	}
	public void setActPercentile25(Integer actPercentile25) {
		this.actPercentile25 = actPercentile25;
	}
	public Integer getActPercentile75() {
		return actPercentile75;
	}
	public void setActPercentile75(Integer actPercentile75) {
		this.actPercentile75 = actPercentile75;
	}
	public String getSatActNotRequired() {
		return satActNotRequired;
	}
	public void setSatActNotRequired(String satActNotRequired) {
		this.satActNotRequired = satActNotRequired;
	}
	public Integer getNumberOfRequiredSat2() {
		return numberOfRequiredSat2;
	}
	public void setNumberOfRequiredSat2(Integer numberOfRequiredSat2) {
		this.numberOfRequiredSat2 = numberOfRequiredSat2;
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
	public Integer getAverageFreshmanRetentionRate() {
		return averageFreshmanRetentionRate;
	}
	public void setAverageFreshmanRetentionRate(Integer averageFreshmanRetentionRate) {
		this.averageFreshmanRetentionRate = averageFreshmanRetentionRate;
	}
	public Integer getSixYearGraduationRate() {
		return sixYearGraduationRate;
	}
	public void setSixYearGraduationRate(Integer sixYearGraduationRate) {
		this.sixYearGraduationRate = sixYearGraduationRate;
	}
	public Integer getRankOverall() {
		return rankOverall;
	}
	public void setRankOverall(Integer rankOverall) {
		this.rankOverall = rankOverall;
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
	public Integer getHsClassTop10Percentage() {
		return hsClassTop10Percentage;
	}
	public void setHsClassTop10Percentage(Integer hsClassTop10Percentage) {
		this.hsClassTop10Percentage = hsClassTop10Percentage;
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
	public String getCalendar() {
		return calendar;
	}
	public void setCalendar(String calendar) {
		this.calendar = calendar;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Integer getMaxResults() {
		return maxResults;
	}
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	public Integer getAverageSAT() {
		return averageSAT;
	}
	public void setAverageSAT(Integer averageSAT) {
		this.averageSAT = averageSAT;
	}
	public List<String> getMajor() {
		return Major;
	}
	public void setMajor(List<String> major) {
		Major = major;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getApplicationDeadlineFall() {
		return applicationDeadlineFall;
	}
	public void setApplicationDeadlineFall(String applicationDeadlineFall) {
		this.applicationDeadlineFall = applicationDeadlineFall;
	}
	public String getApplicationDeadlineSpring() {
		return applicationDeadlineSpring;
	}
	public void setApplicationDeadlineSpring(String applicationDeadlineSpring) {
		this.applicationDeadlineSpring = applicationDeadlineSpring;
	}
	public String getSeparateApplicationFormRrequired() {
		return separateApplicationFormRrequired;
	}
	public void setSeparateApplicationFormRrequired(String separateApplicationFormRrequired) {
		this.separateApplicationFormRrequired = separateApplicationFormRrequired;
	}
	public String getConditionalAdmissionOffered() {
		return conditionalAdmissionOffered;
	}
	public void setConditionalAdmissionOffered(String conditionalAdmissionOffered) {
		this.conditionalAdmissionOffered = conditionalAdmissionOffered;
	}
	public String getToeflAcceptedInsteadOfSatOrAct() {
		return toeflAcceptedInsteadOfSatOrAct;
	}
	public void setToeflAcceptedInsteadOfSatOrAct(String toeflAcceptedInsteadOfSatOrAct) {
		this.toeflAcceptedInsteadOfSatOrAct = toeflAcceptedInsteadOfSatOrAct;
	}
	public Integer getMinimumToeflScore() {
		return minimumToeflScore;
	}
	public void setMinimumToeflScore(Integer minimumToeflScore) {
		this.minimumToeflScore = minimumToeflScore;
	}
	public Integer getAverageToeflScore() {
		return averageToeflScore;
	}
	public void setAverageToeflScore(Integer averageToeflScore) {
		this.averageToeflScore = averageToeflScore;
	}
	public Float getMinimumIeltsScore() {
		return minimumIeltsScore;
	}
	public void setMinimumIeltsScore(Float minimumIeltsScore) {
		this.minimumIeltsScore = minimumIeltsScore;
	}
	public Float getAverageIeltsScore() {
		return averageIeltsScore;
	}
	public void setAverageIeltsScore(Float averageIeltsScore) {
		this.averageIeltsScore = averageIeltsScore;
	}
	public Integer getInternationalStudentsApplying() {
		return internationalStudentsApplying;
	}
	public void setInternationalStudentsApplying(Integer internationalStudentsApplying) {
		this.internationalStudentsApplying = internationalStudentsApplying;
	}
	public Integer getInternationalStudentsAccepted() {
		return internationalStudentsAccepted;
	}
	public void setInternationalStudentsAccepted(Integer internationalStudentsAccepted) {
		this.internationalStudentsAccepted = internationalStudentsAccepted;
	}
	public Integer getInternationalFreshmenEnrolled() {
		return internationalFreshmenEnrolled;
	}
	public void setInternationalFreshmenEnrolled(Integer internationalFreshmenEnrolled) {
		this.internationalFreshmenEnrolled = internationalFreshmenEnrolled;
	}
	public String getFinancialAid() {
		return financialAid;
	}
	public void setFinancialAid(String financialAid) {
		this.financialAid = financialAid;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
}
