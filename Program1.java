import java.util.*;

class Arithmetic
{
    public int iValue1;     //characteristics
    public int iValue2;     //characteristics

    public Arithmetic(int i,int j)  //paramitarised constructor
    {
        iValue1 =i;
        iValue2 =j;
    }
    public int Division()         //Behavior
    {
        int Div = 0;
        Div = iValue1 / iValue2;
        return Div;
    }
}

class Program1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1=0, iNo2=0, iAns=0;

        System.out.println("Enter first no : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second no : ");
        iNo2 = sobj.nextInt();

        Arithmetic aobj = new Arithmetic(iNo1,iNo2);
        iAns =aobj.Division();

        System.out.println("Division is :"+iAns);


    }
}