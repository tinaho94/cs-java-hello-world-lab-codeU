package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String s = System.getProperty("java.version");
    	String[] arr = s.split("\\.");
    	return Double.valueOf(arr[0] + "." + arr[1]);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
    	System.out.println(getVersion());
    }
}