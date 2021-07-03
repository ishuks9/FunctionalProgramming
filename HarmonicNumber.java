
public class HarmonicNumber
{
	int a =1;
	int b = 1/2;
	int c;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number: ");

	int number = sc.nextInt();
	public int harmonic(){
	for(int i=3;i<number;i++){
			c = 1/i;
			int ans = a+b;
			a = b;
			b = c;
			return ans;
		}
	}
}
