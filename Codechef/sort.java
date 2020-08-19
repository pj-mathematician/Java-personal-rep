import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//input.nextLine();
		int t = input.nextInt();
		input.nextLine();
		int[] num = new int[t];
		for(int i=0;i<t;i++){
			int s = input.nextInt();
			num[i]=s;
		}
		Arrays.sort(num);
		for(int j=0;j<t;j++){
			System.out.println(num[j]);
		
		}
	}
}