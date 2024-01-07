import java.util.Scanner;

public class Program36 {
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the no of test cases: ");
       int n = sc.nextInt();

       for( int i=1; i<=n; i++)
       {
        System.out.print("\nTest case : "+i+"\n");
         System.out.print("Enter 1st no : ");
         int n1 = sc.nextInt();

         System.out.print("Enter 2nd no : ");
         int n2 = sc.nextInt();

         int Sum = n1+n2;

         System.out.print("Sum is : "+ Sum);
        
       }
       sc.close();
    }
}
