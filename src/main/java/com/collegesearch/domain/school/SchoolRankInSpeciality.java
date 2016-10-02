package com.collegesearch.domain.school;

// Generated Aug 10, 2015 3:42:22 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.search.annotations.ContainedIn;

@Entity
@Table(name = "school_speciality", catalog = "School")
public class SchoolRankInSpeciality implements java.io.Serializable {

	private static final long serialVersionUID = 6749990758703320L;
	private Integer schoolId;
	private String  schoolName;
	private String  speciality;
	private Integer rank;
	private Float   score;
	
	private School  school;
	
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "school"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name="School_Id", unique=true, nullable=false)
	public Integer getSchoolId() {
		return schoolId;
	}
	
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
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
	
	@Column(name="school_name")
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Column(name="speciality")
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	@Column(name="rank")
	public Integer getRank() {
		return rank;
	}
	
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	
	@Column(name="score")
	public Float getScore() {
		return score;
	}
	public void setScore(Float score) {
		this.score = score;
	}
	    
	
}
