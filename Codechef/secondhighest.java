import java.util.Scanner;
class input{
	static Scanner inp = new Scanner(System.in);
	static int[] GetSeparatedInput(int n){
		//String str = new String();
		String str = inp.nextLine();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			int c = str.indexOf(" ");
			if(c!=-1){
				String temp = str.substring(0,c);
				arr[i]=Integer.parseInt(temp);
				str=str.substring(c+1,str.length());				
			}
			else{
				arr[i]=Integer.parseInt(str);
			}
		}
		return arr;
	}
	static int TestCaseInput(){
		int t = inp.nextInt();
		inp.nextLine();
		return t;
	}
}
class print{
	static void printarray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	static void printint(int a){
		System.out.println(a);
	}
}
public class Main {
	static int sec(int a,int b,int c){
		if((a>=b && a<=c)||(a<=b && a>=c)){
			return a;
		}
		else if((b>=a && b<=c)||(b<=a && b>=c)){
			return b;
		}
		else if((c>=a && c<=b)||(c<=a && c>=b)){
			return c;
		}
		return 0;
	}
	public static void main(String[] args) {
		int t = input.TestCaseInput();
		int[] num = new int[t];
		for(int i=0;i<t;i++){
			int[] temp = input.GetSeparatedInput(3);
			int ans = sec(temp[0],temp[1],temp[2]);
			num[i]=ans;
		}
		print.printarray(num);
	}
}