import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.ifunpas.kpl.code.Math;

public class TestMath {
	Math m = new Math();

	@Test
	public void test() {
		int hasil = m.mod(8, 2);
		assertEquals(0, hasil);
	}
	
	@Test
	public void test2() {
		double x = 4;
		double hasil = m.sqrt(x);
		assertEquals(2, hasil,0.001);
	}
}
