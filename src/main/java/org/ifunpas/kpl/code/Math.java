package org.ifunpas.kpl.code;
public class Math {
	
	public int mod(int n1, int n2) {
		int x = n1 % n2;
		return x;
	}
	
	public double sqrt(double sqrt) {
		double temp;

		double sr = sqrt / 2;

		do {
			temp = sr;
			sr = (temp + (sqrt / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	}

}
