public class primitive {
	public static void main(String[] args) {
		
		//boolean takes only 'true' or 'false'
		boolean bool1 = true;//primitive initialization
		Boolean bool2 = new Boolean(false);//nonprimitive initialization using wrappers
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		//char takes only one unicode character
		char c1 = 'x';
		Character c2 = new Character(c1);//nonprimitive initialization of a pre existing variable.
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();		
		//byte takes integer values from -128 to 127 (inclusive)
		byte b = 88;
		System.out.println(b);
		System.out.println();	
		//short takes integer values from -2^15 to 2^15 -1
		short s = 2000;
		System.out.println(s);
		System.out.println();
		//int takes integer values from -2^31 to 2^31 -1
		int i = 938399;
		System.out.println(i);
		System.out.println();
		//long takes integer values from -2^63 to 2^63 -1
		long l = 938383929;
		System.out.print(l);
		System.out.println();
		//float takes decimal values
		float f = 3;
		System.out.println(f);
		System.out.println();
		//double takes 'larger' decimal values
		double d = 93030.9993;
		System.out.println(d);
	}
}
