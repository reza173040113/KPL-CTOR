import static org.junit.Assert.*;
import org.ifunpas.kpl.code.C;
import org.junit.Test;

public class TestC {
	
	C c = new C();
	@Test
	public void test() {
		int n1 = 3;
		int n2 = 5;
		int hasil = c.add(n1, n2);
		
		assertEquals(8, hasil, 0);
		
	}
	
	@Test
	public void test2() {
		int n1 = 3;
		int n2 = 1;
		int hasil = c.sub(n1, n2);
		
		assertEquals(2, hasil, 0);
		
	}
	
	@Test
	public void test3() {
		double n1 = 4;
		double n2 = 2;
		double hasil = c.mul(n1, n2);
		
		assertEquals(8.0, hasil, 0);
		
	}
	
	@Test
	public void test4() {
		double n1 = 4;
		double n2 = 2;
		double hasil = c.div(n1, n2);
		
		assertEquals(2.0, hasil, 0);
		
	}

}
