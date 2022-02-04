package com.juaracoding.magangmerchant.utils;

public enum TestCases {

	T1("Testing the authentication"),
	T2("Testing Upload JO Page");
//	T3("Testing Send QR page"),
//	T4("Testing Received QR page"),
	/*T5("Testing Delivery to MD page"),
	T6("Testing Distribusi page"),
	T7("Testing Worklist New Data page"),
	T8("Testing Monitoring MD page"),
	T9("Testing Completed Data page"),
	T10("Testing Monitoring MD page"); */
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
	
}
