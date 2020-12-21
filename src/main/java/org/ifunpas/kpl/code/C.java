package org.ifunpas.kpl.code;

public class C  extends A implements MulAndDivInterface{
	
	private double n1;
	private double n2;
	private B b;
	public C() {
		System.out.println("Ctor dikelas C");
		b = new B();
	}
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public String toString() {
		b.toString();
		return "toString di kelas C";
	}

	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		int hasil = n1+n2;
		return hasil;
	}

	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		int hasil = n1-n2;
		return hasil;
	}

	public double mul(double n1, double n2) {
		// TODO Auto-generated method stub
		double hasil = n1*n2;
		return hasil;
	}

	public double div(double n1, double n2) {
		// TODO Auto-generated method stub
		double hasil = n1/n2;
		return hasil;
	}
	
	
	
}
