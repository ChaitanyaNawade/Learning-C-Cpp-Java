import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void FindPair(int Target)
    {
        int i =0 , j = 0;
        int temp = 0;

        for(i = 0 ; i < Arr.length - 1 ; i++)
        {
            for(j = 0 ; j < Arr.length - i- 1 ; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }

        int Left = 0;
        int Right = Arr.length -1;
        temp = 0;
        while(Left < Right)
        {
            if(Arr[Left] + Arr[Right] == Target)
            {
                System.out.println("pair found : "+Arr[Left]+" "+Arr[Right]);
                return;
            }
            else if(Arr[Left] + Arr[Right] < Target)
            {
                Left++;
            }
            else if(Arr[Left] + Arr[Right] > Target)
            {
                Right--;
            }
        }

        System.out.println("The addition of two element of the array is : "+Arr[Left]+" "+ Arr[Right]);
    
    }
}

class Program72 
{
    public static void main(String A[])
    {
        Scanner sobj  = new Scanner(System.in);

        int iSize = 0 ,iCnt = 0,Target = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the target");

        Target = sobj.nextInt();

        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.FindPair(Target);

    }
}