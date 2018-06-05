package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test2 {
	@Test
	public void test() throws Exception {
		System.err.println("*** DELIBERATELY SLEEPING TO SIMULATE A SLOW TEST WHICH GETS INTERRUPTED - INTERRUPT THE TEST NOW! ***");
		Thread.sleep(1000 * 60 * 60);
	}	
}