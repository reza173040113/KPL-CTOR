import static org.junit.Assert.assertEquals;

import org.ifunpas.kpl.code.Math;
import org.junit.Test;

public class TestMath {
	Math m = new Math();
	
	@Test
	public void test() {
		int hasil = m.mod(4, 2);
		assertEquals(0, hasil);
	}
	
	@Test
	public void test2() {
		int hasil = m.mod(5, 2);
		assertEquals(1, hasil);
	}
	@Test
	public void test3() {
		double hasil = m.sqrt(4);
		assertEquals(2, hasil,0.001);
	}
	
	@Test
	public void test4() {
		double hasil = m.sqrt(16);
		assertEquals(4, hasil,0.001);
	}

}
