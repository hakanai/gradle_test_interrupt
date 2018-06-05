package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class Test5 {
	@Test
	public void test1() {
		// success
	}	

	@Test
	public void test2() {
		fail("failed");
	}	
}