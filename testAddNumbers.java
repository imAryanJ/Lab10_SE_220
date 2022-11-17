package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers
{
	@Test
	public void test()
	{
		assertEquals(300,jUnitFunctions.addNumbers(100,200));
		assertEquals(500,jUnitFunctions.addNumbers(300,200));
		assertEquals(800,jUnitFunctions.addNumbers(600,200));
		assertEquals(1000,jUnitFunctions.addNumbers(100,900));
		assertEquals(120,jUnitFunctions.addNumbers(100,20));
	}

}