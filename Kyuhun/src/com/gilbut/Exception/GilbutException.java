package com.gilbut.Exception;

public class GilbutException extends Exception {
	private static final long serialVersionID=-5416594838948964L;
	
 public GilbutException(String message){
	 
	 super(message);
 }
 
 public GilbutException(String message,Throwable cause) {
	 super(message,cause);
 }

 public GilbutException(Throwable cause) {
	 super(cause);
}
}


