/**
 * 
 */
package com.sample.project;

/**
 * @author arunramachand.subra
 *
 */
public class SampleJavaApp {

	public static void main(String[] args) {
		System.out.println("1. This is the master branch code");
		feature2();
		feature2BugFix1();
	}
	
	public static void feature2() {
		System.out.println("3. This is the 2nd feature");
	}
	
	public static void feature2BugFix1() {
		System.out.println("3. This is the 2nd feature Bug Fix 1");
	}
}
