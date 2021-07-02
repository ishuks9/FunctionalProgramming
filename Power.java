import java.util.Scanner;
	public class Power{
	public static void main(String args[]){
		int b = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power");
		int c = sc.nextInt();
		for(int i=0;i<c;i++){
			System.out.println("2^"+c+"="+Math.pow(b,i));
		}
	}
}
