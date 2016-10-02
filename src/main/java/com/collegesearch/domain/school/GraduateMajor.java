package com.collegesearch.domain.school;
// Generated Jul 22, 2016 11:35:09 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * GraduateMajor generated by hbm2java
 */
@Entity
@Table(name = "graduate_major", catalog = "school")
public class GraduateMajor implements java.io.Serializable {

	private String id;
	private String name;
	private Set<GraduateSchoolMajor> graduateSchoolMajors = new HashSet<GraduateSchoolMajor>(0);

	public GraduateMajor() {
	}

	public GraduateMajor(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public GraduateMajor(String id, String name, Set<GraduateSchoolMajor> graduateSchoolMajors) {
		this.id = id;
		this.name = name;
		this.graduateSchoolMajors = graduateSchoolMajors;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false, length = 10)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "graduateMajor")
	public Set<GraduateSchoolMajor> getGraduateSchoolMajors() {
		return this.graduateSchoolMajors;
	}

	public void setGraduateSchoolMajors(Set<GraduateSchoolMajor> graduateSchoolMajors) {
		this.graduateSchoolMajors = graduateSchoolMajors;
	}

}