import static org.junit.Assert.*;

import org.junit.Test;

public class HCFTest {

	@Test
	public void test() 
	{
		Main main = new Main();
		int num1 = 404;
		int num2 = 96;
		
		int expected = 9696;
		
		int actual = main.ffindHCF(num1, num2);
		assertEquals(expected,actual);
	}
	
	
	

}
