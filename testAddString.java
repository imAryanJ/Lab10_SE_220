package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString
{
	@Test
	public void test()
	{
		assertEquals("HelloHello",jUnitFunctions.addStrings("Hello","Hello"));
		assertEquals("HelloRekhi",jUnitFunctions.addStrings("Hello","Rekhi"));
		assertEquals("HelloSatya",jUnitFunctions.addStrings("Hello","Satya"));
		assertEquals("HelloHellO",jUnitFunctions.addStrings("Hello","HellO"));
		assertEquals("Helloh",jUnitFunctions.addStrings("Hello","h"));
	}

}