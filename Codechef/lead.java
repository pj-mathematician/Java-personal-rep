import java.util.Scanner;
class game{
	int[] cummulative(int[] ar){
		int len=ar.length;
		int[] car = new int[len];
		for(int i=0;i<len;i++){
			int sum =0;
			for(int j=0;j<=i;j++){
				sum+=ar[j];
			}
			car[i]=sum;
		}
		return car;
	}
	int[] diff(int[] car1,int[] car2){
		int len=car1.length;
		int[] dar=new int[len];
		for(int i=0;i<len;i++){
			int dif=0;
			if(car1[i]>=car2[i]){
				dif=car1[i]-car2[i];
			}
			else{
				dif=car2[i]-car1[i];
			}
			dar[i]=dif;
		}
		return dar;
	}
	int[] win(int[] car1,int[] car2){
		int len=car1.length;
		int[] dar=new int[len];
		for(int i=0;i<len;i++){
			int dif=0;
			if(car1[i]>=car2[i]){
				dif=1;
			}
			else{
				dif=2;
			}
			dar[i]=dif;
		}
		return dar;		
	}
	int max(int[] dar){
		int len=dar.length;
		int maxi=0;
		for(int i=0;i<len;i++){
			if(dar[i]>=dar[maxi]){
				maxi=i;
			}
		}
		return maxi;
	}
	
}
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
		game g = new game();
		//input.nextLine();
		int t = input.nextInt();
		input.nextLine();
		int[] ar1 = new int[t];
		int[] ar2 = new int[t];
		for(int i=0;i<t;i++){
			String inp = input.nextLine();
			String fir = first(inp);
			String sec = second(inp);
			int a = Integer.parseInt(fir);
			int b = Integer.parseInt(sec);
			ar1[i]=a;
			ar2[i]=b;
			//int sum = a+b;
			//num[i]=sum;
		}
		int[] car1=new int[t];
		int[] car2=new int[t];
		car1=g.cummulative(ar1);
		car2=g.cummulative(ar2);
		int[] dar=new int[t];
		dar=g.diff(car1,car2);
		int[] win=new int[t];
		win=g.win(car1,car2);
		int maxi=0;
		maxi=g.max(dar);
		String fnl=new String();
		fnl=win[maxi]+" "+dar[maxi];
		System.out.println(fnl);
		//find max element
		
		for(int i=0;i<t;i++){
			
			System.out.println(dar[i]);
		}
/*		
		for(int j=0;j<t;j++){
			System.out.println(num[j]);
		}	*/
	}
}