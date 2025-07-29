import java.util.Scanner;

abstract class RBI
{
    public void DisplayKYC()
    {
        System.out.println("please submit your id proof");
    }

    abstract void DisplayROI();
}
class SBI extends RBI
{
    public void DisplayROI()
    {
        System.out.println("Our rate for fd is 7 %");
    }
}

class BOM extends RBI
{
   public void DisplayROI()
   {
    System.out.println("Our rate for fd is 8.5%");
   } 
}
class Program22 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        RBI robj = null;            
        System.out.println("please select  one option");
        System.out.println("1 : State Bank Of India");
        System.out.println("2 : Bank of maharashtra");
        int Option = sobj.nextInt();
 
        if(Option == 1)
        {
            robj = new SBI();
        }
        else
        {
            robj = new BOM();
        }
        
      robj.DisplayKYC();
      robj.DisplayROI();
    }    
}