class Demo
{
    int i,j;
    void fun()
    {
        System.out.println("Demo fun");
    }

    void gun()
    {
        System.out.println("Demo Gun");
    }

    void sun()
    {
        System.out.println("Demo Sun");
    }

    void run()
    {
        System.out.println("Demo Run");
    }
}

class Derive extends Demo
{
    void fun()
    {
        System.out.println("Derived Fun");
    }

    void gun()
    {
        System.out.println("Deirved Gun");
    }
    
    void mun()
    {
        System.out.println("derive Mun");
    }

    void run()
    {
        System.out.println("Deived Run");
    }
}

class Program12
{
    public static void main(String A[])
    {
        Demo d = new Derive();
        d.fun();
        d.gun();
        d.sun();
        d.run();
        //d.mun();
    }
}