import java.util.Scanner;
class input {
	static Scanner inp = new Scanner(System.in);
	static int[] GetSeparatedInput(int n) {
		//String str = new String();
		String str = inp.nextLine();
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
//public class Main {
//	public static void main(String[] args) {
//		int[] arr = new int[3];
//		arr = input.GetSeparatedInput(3);
//		for(int i=0;i<3;i++){
//			System.out.println(arr[i]);
//		}
//	}
//}