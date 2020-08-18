import java.util.Scanner;
public class Main {
	static String first(String s){
		int c = s.indexOf(" ");
		String str = s.substring(0,c);
		return str;
	}
	static String second(String s){
		int l = s.length();
		int c = s.indexOf(" ");
		String str = s.substring(c+1,l);
		return str;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inp = input.nextLine();
		String fir = first(inp);
		String sec = second(inp);
		float wd = Float.parseFloat(fir);
		float bal = Float.parseFloat(sec);
		if(bal > wd+0.50)
			if(wd%5==0)
				System.out.println(bal-wd-0.50);
			else
				System.out.println(bal);
		else
			System.out.println(bal);
		//System.out.println(bal);
	}
}
