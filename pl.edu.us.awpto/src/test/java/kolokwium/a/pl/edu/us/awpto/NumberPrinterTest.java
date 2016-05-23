package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberPrinterTest
{
	@Test(expected = RuntimeException.class)
	public void test()
	{
		NumberPrinter obj = new NumberPrinter();
		
		obj.printNumbers(-7);
	}
	
	
}