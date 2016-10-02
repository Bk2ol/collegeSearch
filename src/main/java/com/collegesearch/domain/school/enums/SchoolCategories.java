package com.collegesearch.domain.school.enums;


public enum SchoolCategories {
	
	NU("National University"),
    NLAC("National Liberal Arts College"),
    RU_N("Regional University-North"),
    RU_S("Regional University-south"),
    RU_MW("Regional University-Midwest"),
    RU_W("Regional University-West"),
    RC_N("Regional College-North"),
    RC_S("Regional College-South"),
    RC_MW("Regional College-Midwest"),
    RC_W("Regional College-West"),
    Art_Schools("Art Schools"),
    Business_Schools("Business Schools"),
    Engineering_Schools("Engineering Schools");

	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String description;
		 
	private SchoolCategories(String description){
		 this.description = description;
	}
	
	public String getDescription(){
		 return description;
	}

	public void setDescription(String description){
		this.description = description;
	}
		 
	public static SchoolCategories instanceOf(String key){
		for(SchoolCategories state : values()){ 
		    if(state.getDescription().equalsIgnoreCase(key))
	            return state;				        
		}
	    return null;
	}

}
