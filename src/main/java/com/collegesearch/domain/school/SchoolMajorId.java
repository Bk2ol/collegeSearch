package com.collegesearch.domain.school;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SchoolMajorId implements java.io.Serializable {

	private static final long serialVersionUID = 835149990758703320L;
	
	private int schoolId;
	private String majorId;

	public SchoolMajorId() {
	}

	public SchoolMajorId(int schoolId, String majorId) {
		this.schoolId = schoolId;
		this.majorId = majorId;
	}

	@Column(name = "School_Id", nullable = false)
	public int getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	@Column(name = "Major_Id", nullable = false)
	public String getMajorId() {
		return this.majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SchoolMajorId))
			return false;
		SchoolMajorId castOther = (SchoolMajorId) other;

		return (this.getSchoolId() == castOther.getSchoolId())
				&& (this.getMajorId() == castOther.getMajorId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSchoolId();
		result = 37 * result + this.getMajorId().hashCode();
		return result;
	}
}


