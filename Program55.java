class Demo implements Runnable
{
    public int i;
    public int iNo;

    public Demo()
    {
        this.i = 0;
        this.iNo = 10;
    }

    public void run()
    {
        try
        {
        for(i = 1 ; i < iNo ; i++)
        {
            System.out.println(i+" ");
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException iobj)
        {

        }
    }
}

class DemoX implements Runnable
{
    char ch ;
    
    public DemoX()
    {
        ch = ' ';
    }

    public void run()
    {
        try
        {
       for(ch = 'A' ; ch <= 'E' ; ch++)
        {
           System.out.print(ch + " ");
           Thread.sleep(1000);
        }
        }
        catch(InterruptedException iobj)
        {
             
        }
    }
}

class Program55
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);

        DemoX dobj1 = new DemoX();
        Thread tobj1 = new Thread(dobj1);
        tobj.start();
        tobj1.start();
    }
}