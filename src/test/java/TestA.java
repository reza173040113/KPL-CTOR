import static org.junit.Assert.assertEquals;

import org.ifunpas.kpl.code.A;
import org.junit.Test;

public class TestA {
	A a = new A();
	
	@Test
	public void test() {
		int hasil = a.add(8, 2);
		assertEquals(10, hasil);
	}
	
	@Test
	public void test2() {
		int hasil = a.sub(4,2);
		assertEquals(2, hasil);
	}
	@Test
	public void test3() {
		int hasil = a.add(6, 6);
		assertEquals(12, hasil);
	}
	
	@Test
	public void test4() {
		int hasil = a.sub(10,2);
		assertEquals(8, hasil);
	}
}
