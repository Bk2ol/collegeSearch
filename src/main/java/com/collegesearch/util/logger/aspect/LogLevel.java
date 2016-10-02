package com.collegesearch.util.logger.aspect;

public enum LogLevel {
  
	TRACE("TRACE"), 
	DEBUG("DEBUG"), 
	WARN("WARN"),
	ERROR("ERROR"),
	INFO("INFO"), 
	FATAL("FATAL");	
  
  public final String name;

  private LogLevel(String name) {
		this.name = name;
  }

  public String getName() {
		return name;
  }
    
}
