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
		feature1();
		feature2();
		feature2BugFix1();
		release020HotFix1();
		feature3();
		feature3BugFix1();
	}

	public static void feature1() {
		System.out.println("2. This is a feature implementation");
	}

	public static void feature2() {
		System.out.println("3. This is the 2nd feature");
	}

	public static void feature2BugFix1() {
		System.out.println("3.1 This is the 2nd feature Bug Fix 1");
	}

	public static void feature1BugFix1() {
		System.out.println("2.1 This is the 2nd feature Bug Fix 1");
	}
	
	public static void release020HotFix1() {
		System.out.println("3.2 This is the 2nd feature Hot Fix 1");
	}

	public static void feature3() {
		System.out.println("4. This is the 3rd feature implementation");
	}
	
	public static void feature3BugFix1() {
		System.out.println("4.1 This is the 3rd feature Bug Fix 1");
	}

}
