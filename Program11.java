class Demo
{
    int i,j;

    void fun()
    {
        System.out.println("Demo Fun");
    }

    void gun()
    {
        System.out.println("Demo Gun");
    }
}

class Derived extends Demo
{
    int x,y;
    
    @Override
    void fun()
    {
        System.out.println("Derived Fun");
    }

    @Override
    void gun()
    {
        System.out.println("Derived Gun");
    }

    void mun()
    {
        System.out.println("Derived MUN");
    }
}

class Program11
{
    public static void main(String A[])
    {
        Demo d = new Derived();

        d.fun();
        d.gun();
        //d.mun();
        //((Derived)d).mun(); we can do downcasting and access the mehtod mun 
    }
}