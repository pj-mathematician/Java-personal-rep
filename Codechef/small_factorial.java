import java.util.Scanner;
import java.math.BigInteger;
class math{
	BigInteger fact(int a){
		BigInteger prod = BigInteger.ONE;
		for(int i = 1;i<=a;i++){
			prod=prod.multiply(BigInteger.valueOf(i));
		}
	return prod;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		math mat=new math();
		//input.nextLine();
		int t = input.nextInt();
		input.nextLine();
		BigInteger[] num = new BigInteger[t];
		for(int i=0;i<t;i++){
			int n=input.nextInt();
			BigInteger temp=mat.fact(n);
			num[i]=temp;
			System.out.println(temp);
		}
	/*	for(int p=0;p<t;p++){
			System.out.println(num[p]);
			*/
		
	}
}