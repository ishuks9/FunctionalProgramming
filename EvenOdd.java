import java.util.Scanner;

public class EvenOdd{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;

		
	        System.out.print("Enter an integer number: ");
		num=sc.nextInt();

		if(num%2 ==0)
		{
			System.out.println(num +" is an EVEN number.");
		}
		else
		{
			System.out.println(num +" is an ODD number.");
		}
	}
}
