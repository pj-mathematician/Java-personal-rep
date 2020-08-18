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
	static int add(int a,int b){
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input.nextLine();
		int t = input.nextInt();
		input.nextLine();
		int[] num = new int[t];
		for(int i=0;i<t;i++){
			String inp = input.nextLine();
			String fir = first(inp);
			String sec = second(inp);
			int a = Integer.parseInt(fir);
			int b = Integer.parseInt(sec);
			int sum = a+b;
			num[i]=sum;
		}
		for(int j=0;j<t;j++){
			System.out.println(num[j]);
		}	
	}
}