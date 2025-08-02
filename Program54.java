import java.util.Scanner;

class Matrix
{
    public int Arr[][];

    public Matrix(int A, int B)
    {
        this.Arr = new int [A][B];
    }


    public void Accept()
    {
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);

        for(i = 0 ; i < Arr.length ; i++)
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

        for(i = 0; i < Arr.length ; i++)
        {
            for(j = 0; j < Arr[i].length ; j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public void Row()
    {
        int i = 0, j = 0;

        for(i = 0; i < Arr.length ; i++)
        {
            for(j = 0 ; j < Arr[i].length ; j++)
            {
                if(i == 0)
                {
                    System.out.print(Arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    

    public void col()
    {
        int i = 0, j = 0;

        for(i = 0; i < Arr.length ; i++)
        {
            for(j = 0 ; j < Arr[i].length ; j++)
            {
                if(i == 0)
                {
                    System.out.print(Arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}

class Program54
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of row ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the size of column");
        int iCol = sobj.nextInt();

        Matrix  mobj = new Matrix(iRow, iCol);

        mobj.Accept();
        mobj.Display();
        mobj.Row();
        mobj.col();
    }
}