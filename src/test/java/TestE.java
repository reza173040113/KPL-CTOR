import static org.junit.Assert.*;

import org.ifunpas.kpl.code.E;
import org.junit.Test;

public class TestE {

	@Test
	public void testE1() {
		E e = new E();
		String nama = "waladi widarno";
		e.tambahData(nama);
		String n = "waladi widarno";
		e.tampilData();
		boolean hasil = e.contains(n);
		
		assertEquals(n, hasil, true);
	}
	
	@Test
	public void testE2() {
		E e = new E();
		String nama = "Reza Pramita";
		e.tambahData(nama);
		String n = "Reza Pramita";
		e.tampilData();
		boolean hasil = e.contains(n);
		
		assertEquals(n, hasil, true);
	}
	
	@Test
	public void testE3() {
		E e = new E();
		String nama = "Nurul Fauziah";
		e.tambahData(nama);
		String n = "Nurul Fauziah";
		e.tampilData();
		boolean hasil = e.contains(n);
		
		assertEquals(n, hasil, true);
	}
}
