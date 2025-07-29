import java.util.*;

abstract class Pune
{
    public void DisplayWeather()
    {
        System.out.println("The weather is rainy in pune right now");
    }

    abstract public void DisplayYour();  
}

class Aurangabad extends Pune
{
    public void DisplayYour()
    {
        System.out.println("Our weather is not rainy today");
    }
}

class Beed extends Pune
{
    public void DisplayYour()
    {
        System.out.println("Our weather is humid today");
    }
}

class Program49
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter your district");

        System.out.println("01 : for Aurangabad :");
        System.out.println("02 : for Beed : ");
        int Option = sobj.nextInt();

        Pune pobj  = null;

        if(Option == 1)
        {
            pobj = new Aurangabad();
        }
        else
        {
            pobj = new Beed();
        }

        pobj.DisplayWeather();
        pobj.DisplayYour();
    }
}