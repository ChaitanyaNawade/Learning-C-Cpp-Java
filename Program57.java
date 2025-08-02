class Demo
{
    public int No1;
    public int No2;

    public Demo(int A, int B)
    {
        this.No1 = A;
        this.No2 = B;
    }

    public int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }
}


class Derived extends Demo
{

    public Derived()
    {
        super(10,11);
    }


    public void Display()
    {
        System.out.println("Inside the display of the Derived");
    }
}

class Program57
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
        int iRet = 0;

        iRet = dobj.Addition();
        System.out.println("Addition is : "+iRet);
    }
}