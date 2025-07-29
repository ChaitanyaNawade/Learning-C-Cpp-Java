class Demo implements Runnable 
{
    public int iNo ;

    public Demo(int A)
    {
        this.iNo = A;
    }

    public  void run()
    {
        if(iNo % 2 == 0)
        {
            System.out.println("The no is even");
        }
        else 
        {
            System.out.println("The no is not even");
        }
    }
}

class Demo1 implements Runnable 
{
    public int iNo;

    public Demo1(int B)
    {
        this.iNo = B;
    }

    public void run()
    {
        if(iNo % 2 != 0)
        {
            System.out.println("The no is not even");
        }
        else 
        {
            System.out.println("The number is even");
        }
    }
}
public class Program51 
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(40);

        Demo1 dobj1 = new Demo1(50);

        Thread tobj1 = new Thread(dobj);

        Thread tobj2 = new Thread(dobj1);
         

        tobj1.start();

        tobj2.start();
    }
}
