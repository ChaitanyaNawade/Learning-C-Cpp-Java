import java.util.*;

class Demo
{
    public int No1;
    public int No2;
    public int Balance;c

    public Demo(int A, int B,int C)
    {
        this.No1 = A;
        this.No2 = B;
        this.Balance = C;
    }

   
    public int Addition()
    {
        int Ans = 0;

        Ans = No1 + No2;
        return Ans;
    }


    public void Withdraw(int Amount)
    {
        Balance = Balance - Amount;
        System.out.println("The ramaining balance is : "+Balance);
    }

}

class Program56
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;

        System.out.println("Enter the first Number");
        int ivalue1 = sobj.nextInt();

        System.out.println("Enter the second number:");
        int ivalue2 = sobj.nextInt();

        System.out.println("Enetr youe total Balance");
        int iBalance = sobj.nextInt();


        Demo dobj = new Demo(ivalue1, ivalue2, iBalance);

        System.out.println("Enter the amount you want to  withdraw");
        int iAmount = sobj.nextInt();

        dobj.Withdraw(iAmount);
        iRet = dobj.Addition();
        System.out.println("the Addition two number is : "+iRet);
    }
}