class A
{
    public int i,j;
    public void base()
    {
        System.err.println("Inside the base of A");
    }
}

class B extends A
{
    public void Derived()
    {
        System.out.println("Inside the Deirved of B");
    }
}


class Program15
{
    public static void main(String A[]) 
    {
       B obj = new B();
       obj.Derived(); 
       obj.base();
    }
}