package Com.TDDString_Of_Array;

import static org.junit.Assert.*;

import org.junit.Test;

import Com.TDDString_Of_Array.StringArray;

public class StringArray_Tests {

	@Test
	public void test1() {
		
		StringArray arrayclass = new StringArray();
		
		String [] str = {"apple","orange","banana","lemon"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayclass.StringConcate(str);
		
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void test2() {
		
		StringArray arrayclass = new StringArray();
		
		String [] str = {"APPLE","ORANGE","BANANA","LEMON"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayclass.StringConcate(str);
		
		assertEquals(expected,actual);
	}
	
}

