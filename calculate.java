import java.util.*;

class calculate {
	int add(int x,int y) {
		int z = x+y;
		return z;
	}
	int prod(int x,int y) {
		int z;
		z=x*y;
		return z;
	}
	float div(int x,int y) {
		float z = x/y;
		return z;
	}
}
public class calculator {
	static void prt(int s) {
		System.out.println(s);
	}
	static void prd(double d) {
		System.out.println(d);
	}
	static void prf(float f) {
		System.out.println(f);
	}
	public static void main(String[] args) {
		calculate calc = new calculate();
		prf(calc.div(6,3));
	}
}
