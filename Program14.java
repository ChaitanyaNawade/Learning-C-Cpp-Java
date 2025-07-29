//this program is written to illustrate the concept of method overriding in java
class Base
{
    public int i,j;
    public void show()
    {
        System.out.println("Inside the Base show");
    }

    public void Display()
    {
        System.out.println("inside the Base Display");
    }
}

class Derived extends Base
{
    public int x,y;
    public void show()
    {
        System.out.println("Inside the Derived show");
    }

    public void Display()
    {
        System.out.println("Inside the Derived Display");
    }
    
    public void Run()
    {
        System.out.println("Inside the Derived run");
    }
}
class Program14
{
    public static void main(String A[])
    {
        Base b = new Derived();

        b.show();         // Derived show
        b.Display();      // Derived Display
        //b.Run();          //error
    }
}