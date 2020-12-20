
import static org.junit.Assert.assertEquals;

import org.ifunpas.kpl.code.D;
import org.junit.Test;

public class TestD {

	D d = new D();
	
	@Test
	public void testD1() {
		double n1 = 30;
		double n2 = 2;
		
		double hasil = d.pow(n1, n2);
		
		assertEquals(900.0, hasil, 0);
	}
	
	@Test
	public void testD2() {
		double n1 = 3;
		double n2 = 4;
		
		double hasil = d.pow(n1, n2);
		
		assertEquals(81.0, hasil, 0);
	}
	
	@Test
	public void testD3() {
		double n1 = 2;
		double n2 = 6;
		
		double hasil = d.pow(n1, n2);
		
		assertEquals(64.0, hasil, 0);
	}

}
