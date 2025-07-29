class Base
{
    Base()
    {
        System.out.println("Inside base constructor");
    }
}

class Derived extends Base
{
    Derived()
    {
        this(10);  
    }

    Derived(int x)
    {
        super();
        System.out.println("The value of x is :"+ " "+x);
    }
}
class Program19
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

    }
}