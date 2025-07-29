class Base
{
    Base(String name)
    {
        System.out.println("Inside the constructor of Base"+" "+name);
    }
}

class Derived extends Base
{
    
    Derived()
    {
        super("hello from child");
        System.out.println("Inside the constructor of Derived");
    }
}
class Program18
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();

    }
}