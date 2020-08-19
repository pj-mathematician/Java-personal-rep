import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input.nextLine();
		int t = input.nextInt();
		input.nextLine();
		int[] num = new int[t];
		for(int i=0;i<t;i++){
			String s = input.next();
			int l = s.length();
			int sum=0;
			char c = s.charAt(0);
			int m = Integer.parseInt(String.valueOf(c));
			char d = s.charAt(l-1);
			int k = Integer.parseInt(String.valueOf(d));
			sum=m+k;
			num[i]=sum;
		}
		for(int p=0;p<t;p++){
			System.out.println(num[p]);
		}
				
	}
}