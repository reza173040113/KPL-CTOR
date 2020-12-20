package org.ifunpas.kpl.code;

public class MainApp {

	public static void main(String[] args) {
		C c = new C();
		System.out.println("Penjumlahan 2+2 = "+c.add(2, 2));
		System.out.println("pengurangan 2-2 = "+c.sub(2, 2));
		System.out.println("perkalian 2*2 = "+c.mul(2, 2));
		System.out.println("pembagian 2/2 = "+c.div(2, 2));
	}

}
