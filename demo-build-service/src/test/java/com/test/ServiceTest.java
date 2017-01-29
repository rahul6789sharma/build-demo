package com.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class ServiceTest {

	@BeforeClass
	public static void oneTimeSetUp() {
		// System.setProperty("AOR_CONFIG_DIR", "C:\\config");
		System.out.println("@BeforeClass - oneTimeSetUp");
		
	}

	@AfterClass
	public static void oneTimeTearDown() {
		
		System.out.println("@AfterClass - oneTimeTearDown");
	}

	@Before
	public void runBeforeTestMethod() {
		System.out.println("@runBeforeTestMethod - oneTimeTearDown");
	}

	@org.junit.Test
	public void serviceTest() {
		fail();
	}
}
