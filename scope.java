public class scope {
	public static void main(String[] args) {
		int x = 12;
		{
			int y = 30;
			//int x = 45 is illegal
			System.out.println(x);//x is available here
			System.out.println(y);//y is available here
		}
		System.out.println(x);//x is available here
		//System.out.println(y) y isnt available here(out of scope)
	}
}
