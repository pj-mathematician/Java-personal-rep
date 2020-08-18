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
		int n = Integer.parseInt(fir);
		int k = Integer.parseInt(sec);		
		int sum = 0;
		int t = 0;
		for(int i =0;i<n;i++){
			t = input.nextInt();
			input.nextLine();
			//System.out.println(t);
			if(t%k==0)
				sum++;
		}
		System.out.println(sum);
		
	}
}
