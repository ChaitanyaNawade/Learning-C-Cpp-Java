class Demo extends Thread
{
    public int iNo ;

    public Demo(int iNo)
    {
        this.iNo = iNo;
    }

    public void run()
    {
        int iFactSum = 0 , i = 0;
        for(i = 1  ; i < iNo ; i++)
        {
            if(iNo % i == 0)
            {
                iFactSum = iFactSum + i;
            }
        }

        System.out.println("Sum of the factors is : "+iFactSum);
    }
}

class Program50
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(15);
        
        dobj.start();  
    }
}