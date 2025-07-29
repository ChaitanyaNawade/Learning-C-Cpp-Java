//this program is illustrate the concept of constructor calling by using super keyword
class Base
{
    Base(String name)
    {
        System.out.println("Inside base the string is :"+name);
    }
}

class Derived extends Base
{
    Derived()
    {
        super("Chaitanya");
        System.out.println("Inside the Derived constructor");
    }
}
class Program20
{
    public static void main(String A[])
    {
        Derived dobj = new Derived();
    }
}