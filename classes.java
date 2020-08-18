public class classes {
	public static void main(String[] args) {
		//class with only data members, no functions/arguements
		class Data {
			int i;
			float f;
			boolean b;
		}
		Data d = new Data();// new object made of class Data()
		d.i = 47;//data member used
		d.f = 1.1f; 
		System.out.println(d.i);
		System.out.println(d.f);
		
		//class with functions
		class str {
			int len (String s) {//a method which returns int, name len and takes one string argument
				return s.length();
			}
			//class method that doesnt return anything
			void nothing() {
				return;
			}
		}
		str s = new str();
		int l = s.len("poojan");
		System.out.println(l);
		
		
		
		
	}
}
