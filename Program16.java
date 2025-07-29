class A
{
    public void show()
    {
        System.err.println("Inside the show of A");
    }
}

class B extends A
{
    public void show1()
    {
        System.out.println("Inside the show1 of B");
    }
}

class C extends B
{
    public void show2()
    {
        System.out.println("Inside the show 2 of C");
    }
}

class Program16
{
    public static void main(String A[])
    {
        C obj = new C();
        obj.show();
        obj.show1();
        obj.show2();
    }
}