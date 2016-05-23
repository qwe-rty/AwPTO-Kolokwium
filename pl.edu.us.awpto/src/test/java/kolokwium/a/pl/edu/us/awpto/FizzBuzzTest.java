package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest
{
	private int parameter;
	private String expected; 
	
	public FizzBuzzTest(int testParameter, String expected) {
		 this.parameter = testParameter;
		 this.expected = expected;
		 }
	
	@Parameters
	public static Collection<Object[]> none()
	{
		Object[][] none = new Object[][] { {1, ""+1}, {2, ""+2}, {4, ""+4}, {5, "Buzz"}, {9, "Fizz"}, {15, "FizzBuzz"}, {60, "FizzBuzz"}  };
		return Arrays.asList(none);
	}
	@Test
	public void test() {
		
		FizzBuzz obj = new FizzBuzz();
		
		assertEquals("Test", expected, obj.calculate(parameter));
		/*
		if(parameter % 3 == 0 && parameter % 5 == 0)
			assertEquals("Test", "FizzBuzz", obj.calculate(parameter));
		else if(parameter % 3 == 0)
			assertEquals("Test 3", "Fizz", obj.calculate(parameter));
		else if(parameter % 5 == 0)
			assertEquals("Test 3", "Buzz", obj.calculate(parameter));
		else
			assertEquals("Test 3", ""+parameter, obj.calculate(parameter));
		*/
		
	}
	
	
	
}