
class node 
{
    public int data;
    public node next;
}

class StackX
{
    private node first;
    private int iCount;

    public StackX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Push(int no)
    {
        node newn = null;
        newn = new node();
        newn.data = no;
        newn.next = null;

        newn.next = first;
        first = newn;
        iCount++;
    }

    public int Pop()
    {
        node temp = null;
        if(this.first == null)
        {
            System.out.println("unable to pop as stack is empty");
            return -1;
        }
        else
        {
        temp = first;
        first = first.next;
        iCount--;
        return temp.data;
        }
    }

    void Display()
    {
        node temp = null;
        temp = first;

        while(temp != null)
        {
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }
    }

    public int Count()
    {
        return iCount;
    }
}
class Program28
{
    public static void main(String A[])
    {
        StackX sobj = new StackX();
        int iRet = 0;
        sobj.Push(11);
        sobj.Push(21);
        sobj.Push(51);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("number of elements in stack is: "+iRet);

         iRet = sobj.Pop();
         System.out.println("poped elemets from the stack is"+iRet);

    }
}