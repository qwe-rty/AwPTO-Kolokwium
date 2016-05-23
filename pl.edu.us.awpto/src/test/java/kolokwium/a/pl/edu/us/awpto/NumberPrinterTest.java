package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberPrinterTest
{
	@Test(expected = RuntimeException.class)
	public void test()
	{
		NumberPrinter obj = new NumberPrinter();
		
		try{
	        this.obj.printNumbers(-1);                  
	        fail();
	    }
	    catch(IllegalArgumentException iae){
	        return;
	        }
	    fail();
		
	}
	
	
	
	
}