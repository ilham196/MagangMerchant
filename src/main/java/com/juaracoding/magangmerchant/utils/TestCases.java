package com.juaracoding.magangmerchant.utils;

public enum TestCases {

	T1("Testing the authentication"),
	T2("Testing Send QR page"),
	T3("Testing Received QR page"),
	T4("Testing Delivery to MD page"),
	T5("Testing Distribusi page"),
	T6("Testing Worklist New Data page"),
	T7("Testing Monitoring MD page"),
	T8("Testing Completed Data page"),
	T9("Testing Monitoring MD page");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
