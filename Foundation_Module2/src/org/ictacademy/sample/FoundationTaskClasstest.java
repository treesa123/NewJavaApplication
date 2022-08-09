package org.ictacademy.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class FoundationTaskClasstest {
    FoundationTaskClass testobj = new FoundationTaskClass();
	@Test
	public void test() {
//		fail("Not yet implemented");
		int out = testobj.CalculateSimpleInterest(1000, 1, 1);
		assertEquals(10,out);
	}
	@Test
	public void test2( ) {
		int out = testobj.CalculateCompoundInterest(100, 1, 1, 1);
		assertEquals(201,out);
	}
    @Test
    public void test3() {
    	int out = testobj.CalculatePerimeterOfRectangle(100, 200);
    	assertEquals(600,out);
    }
    @Test
    public void Test4()
    {
    	assertTrue(testobj.CheckEven(4));
    }
}
