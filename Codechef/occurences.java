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
			for(int j = 0;j<l;j++){
				char c = s.charAt(j);
				int m = Integer.parseInt(String.valueOf(c));
				//System.out.println(c);
				if(m==4){
					sum += 1;
				}
			}
			num[i]=sum;
		}
		for(int p=0;p<t;p++){
			System.out.println(num[p]);
		}
				
	}
}