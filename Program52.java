import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int A, int B)
    {
        this.Arr = new int[A][B];
    }

    public void Accept()
    {
        int i = 0 , j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Elements in the array");

        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0 ; j < Arr[i].length ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        for(i = 0 ; i < Arr.length ; i++)
        {
            for(j = 0 ; j < Arr[i].length ; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class Program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter the size of Row");
        iRow = sobj.nextInt();

        System.out.println("Enter the size of columns");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();
    }
}