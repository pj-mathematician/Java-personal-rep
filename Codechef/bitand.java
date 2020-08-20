import java.util.Scanner;
class input {
	static Scanner inp = new Scanner(System.in);
	static int[] GetSeparatedInput(int n) {
		//String str = new String();
		String str = inp.nextLine();
	//	inp.nextLine();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int c = str.indexOf(" ");
			if (c != -1) {
				String temp = str.substring(0, c);
				arr[i] = Integer.parseInt(temp);
				str = str.substring(c + 1, str.length());
			} else {
				arr[i] = Integer.parseInt(str);
			}
		}
		return arr;
	}
	static int TestCaseInput() {
		int t = inp.nextInt();
		inp.nextLine();
		return t;
	}
}
class print {
	static void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		int t = input.TestCaseInput();
		int[] ans = new int[t];
		//int count = 0;
		for (int m = 0; m < t; m++) {
			int count=0;
			int n = input.TestCaseInput();
			int[] ar = input.GetSeparatedInput(n);
			for (int i = 0; i < n - 1; i++) {
				for (int j = i+1; j < n; j++) {
					if ((ar[i] & ar[j]) == ar[i]) {
						count++;
					}
				}
			}
			ans[m] = count;
		}
		print.printarray(ans);
	}
}