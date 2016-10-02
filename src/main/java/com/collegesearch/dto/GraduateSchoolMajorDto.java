package com.collegesearch.dto;


import com.collegesearch.domain.school.GraduateSchoolMajor;


public class GraduateSchoolMajorDto {
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
	
	public GraduateSchoolMajorDto(String schoolName, String majorName, String degree, String test,String languageTest, String phone, String email, Integer rank, String admissionWebpage,
			String Deadline) {
		super();
		this.schoolName = schoolName;
		this.majorName = majorName;
		this.degree = degree;
		this.test=test;
		this.languageTest=languageTest;
		this.phone = phone;
		this.email = email;
		this.rank = rank;
		this.admissionWebpage = admissionWebpage;
		this.deadline = Deadline;
	}
	
	public GraduateSchoolMajorDto(GraduateSchoolMajor graduateSchoolMajor){
		this.schoolName = graduateSchoolMajor.getSchool().getName();
		this.majorName = graduateSchoolMajor.getGraduateMajor().getName();
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

	public String getdeadline() {
		return deadline;
	}

	public void setdeadline(String deadline) {
		this.deadline = deadline;
	}
}
