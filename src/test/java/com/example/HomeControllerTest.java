package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HomeControllerTest {

	@Test
	public void test() {
		HomeController hc = new HomeController();
		assertEquals(hc.sum(2, 2), 5);
	}

}
