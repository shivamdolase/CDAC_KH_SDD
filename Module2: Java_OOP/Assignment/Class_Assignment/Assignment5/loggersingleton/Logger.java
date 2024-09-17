package org.example.loggersingleton;

public class Logger {
	private static Logger instance=null;
	
	private String message;
	private Logger() {
		message="";
	}
	
	static {
		instance = new Logger();
	}
	public static Logger getInstance() {
		if( instance == null ){ 
	        instance = new Logger( ); 
	      } 
		return instance;
	}
	public void log(String message) {
		this.message=message;
	}
	public String getLog() {
		return this.message;
	}
	public void clearLog() {
		this.message="log message is cleared";
	}
	
	
	
}
