package com.bt.general;

import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to ANT1, testing webhook !! " + getLocalCurrentDate());
	}

	public static Date getLocalCurrentDate() {
		return new Date();
	}

}
