import java.util.*;


class Arithmetic
{

    public int Addition(int i, int j)
    {
        int iSum =0;
        iSum = i+j;
        return iSum;
    }

}

public class Program29
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1=0, iNo2=0;
        int iAns= 0;

        System.out.println("Enter 1 no : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter 2 no : ");
        iNo2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic();

        iAns = aobj.Addition(iNo1,iNo2);

        System.out.print("Add is : "+iAns);



    }
}