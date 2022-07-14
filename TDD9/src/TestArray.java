import static org.junit.Assert.*;

import org.junit.Test;

public class TestArray {

	@Test
	public void test1() 
	{
		
	   StringClass stringclass = new StringClass();
	   String  str = "It @ is # a 1234 pen-";
	   String expected = "It is a pen";
	   
	   String actual = stringclass.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}
	
	
	@Test
	public void test2() 
	{
		
	   StringClass stringclass = new StringClass();
	   String  str = "This@ is 456$ * bike*";
	   String expected = "This is bike";
	   
	   String actual = stringclass.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}

}
