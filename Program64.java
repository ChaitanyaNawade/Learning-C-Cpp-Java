class BankAccount
{
    private int Balance = 1000;

    public synchronized void Withdraw(int Amount)
    {
        if(Amount <= Balance)
        {
            System.out.println(Thread.currentThread().getName()+" Successfully withdrawed the amount");
            Balance = Balance - Amount;
            System.out.println("The remaining amount is "+Balance);
        }
        else 
        {
            System.out.println(Thread.currentThread().getName()+" you cannot withdraw the amount");
        }
    }
}

class Customer extends Thread
{
    public BankAccount bobj;

    public Customer (BankAccount obj,String Name)
    {
        super(Name);
        this.bobj = obj;
    }

    public void run()
    {
        bobj.Withdraw(800);
    }
}


class Program64
{
    public static void main(String A[])
    {
        BankAccount bobj = new BankAccount();   

        Customer cobj1 = new Customer(bobj, "Chaitanya");   
        Customer cobj2 = new Customer(bobj, "Aniket");

        cobj1.start();
        cobj2.start();

        try
        {
            cobj1.join();
            cobj2.join();
        }
        catch(InterruptedException iobj)
        {

        }

        System.out.println("End of Bank application");
    }
}