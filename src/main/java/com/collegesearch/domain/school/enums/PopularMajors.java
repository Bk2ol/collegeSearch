package com.collegesearch.domain.school.enums;

public enum PopularMajors {
	
	AccountingL("Accounting"), 
	Agriculture("Agriculture"),
	Biology("Biology"), 
	Business_in_Finance("Business_Finance"),
	Communications("Communications"), 
	Computer_Science_and_Computer_Engineering("Computer Science and Computer Engineering"), 
	Criminology("Criminology"),
	Education("Education"), 
	Engineering("Engineering"),
	English_Literature_and_Language("English Literature and Language"),
	Environmental_Studies("Environmental Studies"), 
	Health_Services("Health Services"),
	History("History"),
	Journalism("Journalism"), 
	Marketing_and_Sales("Marketing and Sales"),
	Mathematics("Mathematics"),
	Mechanical_Engineering("Mechanical Engineering"), 
	Nursing("Nursing"),
	Political_Science_and_Government("Political Science and Government"),
	Psychology("Psychology");
   	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String description;
		 
	private PopularMajors(String description){
		 this.description = description;
	}
	
	public String getDescription(){
		 return description;
	}

	public void setDescription(String description){
		this.description = description;
	}
		 
	public static PopularMajors instanceOf(String key){
		for(PopularMajors state : values()){ 
		    if(state.getDescription().equalsIgnoreCase(key))
	            return state;				        
		}
	    return null;
	}

}
