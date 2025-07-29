// this program illustrate the concept of hierarchical inheritance from java where more  than one classes are inherited from parent class or super class
class  Base
{
    public int i,j;
     
    Base()
    {
        this.i = 10;
        this.j = 20;
    }

    public void show()
    {
        System.out.println("Inside the Base the value of i and j is :"+i +" "+ j);
    }
}

class Derived extends Base
{
    public int x,y;

    Derived()
    {
        this.x = 30;
        this.y = 40;
    }

    public void display()
    {
        System.out.println("The value of x and y in Derived is :"+x +" "+y);
    }
}

class DerivedX extends Base
{
    public int m;
    DerivedX()
    {
        this.m = 50;
    }

    public void get()
    {
        System.out.println("Inside DerivedX the value of m is"+m);
    }
}
class Program17 
{
    public static void main(String A[])
    {
        DerivedX dobj = new DerivedX();
        Derived dobj2 = new Derived();
        dobj.show();
        dobj.get();
        dobj2.display();
        dobj2.show();

    }
}