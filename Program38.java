import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the n natural no : ");
      int n = sc.nextInt();
       
        
        int Sum = (n * (n+1))/ 2;

        System.out.print("total sum : "+ Sum*10); // for 10 +20+30.....

      
    }
}
