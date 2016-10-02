package com.collegesearch.domain.school;
// Generated Oct 28, 2015 3:05:03 PM by Hibernate Tools 4.0.0


import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.search.annotations.ContainedIn;

/**
 * SchoolInternationalApplication generated by hbm2java
 */
@Entity
@Table(name="school_international_application",catalog="School")
public class SchoolInternationalApplication  implements java.io.Serializable {


	private static final long serialVersionUID = -5646749990758703320L;
    private int     id;
    private String  name;
    private String  applicationDeadlineFall;
    private String  applicationDeadlineSpring;
    private String  separateApplicationFormRrequired;
    private String  conditionalAdmissionOffered;
    private String  toeflAcceptedInsteadOfSatOrAct;
    private Integer minimumToeflScore;
    private Integer averageToeflScore;
    private Float   minimumIeltsScore;
    private Float   averageIeltsScore;
    private Integer toeflScore;
	private Float   ieltsScore;
    private Integer internationalStudentsApplying;
    private Integer internationalStudentsAccepted;
    private Integer internationalFreshmenEnrolled;
    private String  financialAid;
    private String  contact;
    private String  note;
    private School  school;
    private Float   internationalStudentAcceptRate;
    private Float   internationalStudentRetentionRate;
    private String  website;

       
    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "school"))
	@Id
	@GeneratedValue(generator = "generator")
    @Column(name="Id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@ContainedIn
    public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name="Name", nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="Application_Deadline_Fall", length=10)
    public String getApplicationDeadlineFall() {
        return this.applicationDeadlineFall;
    }
    
    public void setApplicationDeadlineFall(String applicationDeadlineFall) {
        this.applicationDeadlineFall = applicationDeadlineFall;
    }
    
    @Column(name="Application_Deadline_Spring", length=20)
    public String getApplicationDeadlineSpring() {
        return this.applicationDeadlineSpring;
    }
    
    public void setApplicationDeadlineSpring(String applicationDeadlineSpring) {
        this.applicationDeadlineSpring = applicationDeadlineSpring;
    }
    
    @Column(name="Separate_Application_Form_Rrequired", length=10)
    public String getSeparateApplicationFormRrequired() {
        return this.separateApplicationFormRrequired;
    }
    
    public void setSeparateApplicationFormRrequired(String separateApplicationFormRrequired) {
        this.separateApplicationFormRrequired = separateApplicationFormRrequired;
    }
    
    @Column(name="Conditional_Admission_Offered", length=10)
    public String getConditionalAdmissionOffered() {
        return this.conditionalAdmissionOffered;
    }
    
    public void setConditionalAdmissionOffered(String conditionalAdmissionOffered) {
        this.conditionalAdmissionOffered = conditionalAdmissionOffered;
    }
    
    @Column(name="TOEFL_Accepted_Instead_Of_SAT_Or_ACT", length=10)
    public String getToeflAcceptedInsteadOfSatOrAct() {
        return this.toeflAcceptedInsteadOfSatOrAct;
    }
    
    public void setToeflAcceptedInsteadOfSatOrAct(String toeflAcceptedInsteadOfSatOrAct) {
        this.toeflAcceptedInsteadOfSatOrAct = toeflAcceptedInsteadOfSatOrAct;
    }
    
    @Column(name="Minimum_TOEFL_Score_Required", length=10)
    public Integer getMinimumToeflScore() {
        return this.minimumToeflScore;
    }
    
    public void setMinimumToeflScore(Integer minimumToeflScore) {
        this.minimumToeflScore = minimumToeflScore;
    }
    
    @Column(name="Average_TOEFL_Score_Required", length=10)
    public Integer getAverageToeflScore() {
        return this.averageToeflScore;
    }
    
    public void setAverageToeflScore(Integer averageToeflScore) {
        this.averageToeflScore = averageToeflScore;
    }
    
    @Column(name="Minimum_IELTS_Score_Required", length=10)
    public Float getMinimumIeltsScore() {
        return this.minimumIeltsScore;
    }
    
    public void setMinimumIeltsScore(Float minimumIeltsScore) {
        this.minimumIeltsScore = minimumIeltsScore;
    }
    
    @Column(name="Average_IELTS_Score_Required", length=10)
    public Float getAverageIeltsScore() {
        return this.averageIeltsScore;
    }
    
    public void setAverageIeltsScore(Float averageIeltsScore) {
        this.averageIeltsScore = averageIeltsScore;
    }
    
    @Column(name="International_Students_Applying")
    public Integer getInternationalStudentsApplying() {
        return this.internationalStudentsApplying;
    }
    
    public void setInternationalStudentsApplying(Integer internationalStudentsApplying) {
        this.internationalStudentsApplying = internationalStudentsApplying;
    }
    
    @Column(name="International_Students_Accepted")
    public Integer getInternationalStudentsAccepted() {
        return this.internationalStudentsAccepted;
    }
    
    public void setInternationalStudentsAccepted(Integer internationalStudentsAccepted) {
        this.internationalStudentsAccepted = internationalStudentsAccepted;
    }
    
    @Column(name="International_Freshmen_Enrolled")
    public Integer getInternationalFreshmenEnrolled() {
        return this.internationalFreshmenEnrolled;
    }
    
    public void setInternationalFreshmenEnrolled(Integer internationalFreshmenEnrolled) {
        this.internationalFreshmenEnrolled = internationalFreshmenEnrolled;
    }
    
    @Column(name="Intl_Financial_Aid", length=25)
    public String getFinancialAid() {
        return this.financialAid;
    }
    
    public void setFinancialAid(String financialAid) {
        this.financialAid = financialAid;
    }
    
    @Column(name="Contact", length=250)
    public String getContact() {
        return this.contact;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
 
    @Column(name="Note", length=150)
    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

	@Transient
	public Integer getToeflScore() {
		return toeflScore;
	}

	public void setToeflScore(Integer toeflScore) {
		this.toeflScore = toeflScore;
	}
	
	@Transient
	public Float getIeltsScore() {
		return ieltsScore;
	}

	public void setIeltsScore(Float ieltsScore) {
		this.ieltsScore = ieltsScore;
	}
    
    public SchoolInternationalApplication() {
    }
	
    public SchoolInternationalApplication(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Transient
    public Float getInternationalStudentAcceptRate() {
    	Float f = null;
    	if(internationalStudentAcceptRate == null && internationalStudentsAccepted != null && internationalStudentsApplying != null){
    	   f =((float)internationalStudentsAccepted/internationalStudentsApplying)*100.0f;
    	   DecimalFormat df = new DecimalFormat("###.#");
    	   return Float.valueOf(df.format(f));
    	}   
    	else
		   return internationalStudentAcceptRate;
	}

	public void setInternationalStudentAcceptRate(Float internationalStudentAcceptRate) {
		this.internationalStudentAcceptRate = internationalStudentAcceptRate;
	}

	@Transient
	public Float getInternationalStudentRetentionRate() {
		Float f = null;
    	if(internationalStudentRetentionRate == null && internationalFreshmenEnrolled != null && internationalStudentsAccepted != null){
    	   f =((float)internationalFreshmenEnrolled/internationalStudentsAccepted)*100.0f;
    	   DecimalFormat df = new DecimalFormat("###.#");
    	   return Float.valueOf(df.format(f));
    	}   
		else
		   return internationalStudentRetentionRate;
	}

	public void setInternationalStudentRetentionRate(Float internationalStudentRetentionRate) {
			this.internationalStudentRetentionRate = internationalStudentRetentionRate;
	}

    @Transient
    public String getWebsite() {
    	if(website == null && contact != null && contact.indexOf("@") >= 0 && contact.indexOf(".edu") > 0){
    	   website = contact.substring(contact.indexOf("@")+1, contact.indexOf(".edu")+4);
    	   while(website.indexOf(".") != website.lastIndexOf(".")){
    		  website = website.substring(website.indexOf(".")+1); 
    	   }	  
     	}
		return "www."+website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
    
    public SchoolInternationalApplication(int id, String name, String applicationDeadlineFall, 
    		String applicationDeadlineSpring, String separateApplicationFormRrequired, 
    		String conditionalAdmissionOffered, String toeflAcceptedInsteadOfSatOrAct, 
    		Integer minimumToeflScoreRequired, Integer averageToeflScoreRequired, 
    		Float minimumIeltsScoreRequired, Float averageIeltsScoreRequired, 
    		Integer internationalStudentsApplying, Integer internationalStudentsAccepted, 
    		Integer internationalFreshmenEnrolled, String intlFinancialAid, String contact, String note) {
       this.id = id;
       this.name = name;
       this.applicationDeadlineFall = applicationDeadlineFall;
       this.applicationDeadlineSpring = applicationDeadlineSpring;
       this.separateApplicationFormRrequired = separateApplicationFormRrequired;
       this.conditionalAdmissionOffered = conditionalAdmissionOffered;
       this.toeflAcceptedInsteadOfSatOrAct = toeflAcceptedInsteadOfSatOrAct;
       this.minimumToeflScore = minimumToeflScoreRequired;
       this.averageToeflScore = averageToeflScoreRequired;
       this.minimumIeltsScore = minimumIeltsScoreRequired;
       this.averageIeltsScore = averageIeltsScoreRequired;
       this.internationalStudentsApplying = internationalStudentsApplying;
       this.internationalStudentsAccepted = internationalStudentsAccepted;
       this.internationalFreshmenEnrolled = internationalFreshmenEnrolled;
       this.financialAid = intlFinancialAid;
       this.contact = contact;
       this.note = note;
    }

}

