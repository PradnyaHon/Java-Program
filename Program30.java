import java.util.*;
//reverse no
class Reverse
    {
        public void Display(int iNo)
        {
            int iDigit=0;

            while(iNo!=0)
            {
                iDigit = iNo % 10;
                System.out.print(iDigit+ "\t");
                iNo= iNo/10;
            }
            System.out.println();
        }
    }
public class Program30
{
    
    public static void main(String ar [])
    {
        Reverse robj = new Reverse();
        Scanner sobj = new Scanner(System.in);
        

        System.out.println("Enter no : ");
        int i = sobj.nextInt();

        robj.Display(i);

    }
}