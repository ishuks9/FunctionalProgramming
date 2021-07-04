import java.util.Scanner;
      
  public class QuoRe {

    public static void main(String[] args)
    {
        
        int dvnd, dvsr;
       
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter dividend value: ");
        
        dvnd=sc.nextInt();

        System.out.println("Enter divisor value: ");
    
        dvsr=sc.nextInt();

        
        int quot = dvnd / dvsr;
       
        int rem = dvnd % dvsr;
        
        System.out.println("Quotient = " + quot);
       
        System.out.println("Remainder = " + rem);
    }
}
