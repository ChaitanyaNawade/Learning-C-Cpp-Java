//Write the program which i used to print only first column
import java.util.Scanner;

class Program53
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the size of Row");
        int iRow = sobj.nextInt();

        System.out.println("Enter the size of Column");
        int iCol = sobj.nextInt();

        int Arr [][] = new int[iRow][iCol];

        System.out.println("Enter the elements in the array");

        int i = 0;
        int j = 0;

        for(i = 0; i < Arr.length ; i++)
        {
            for(j = 0 ; j < Arr[i].length ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Elements from the array are");

        for(i = 0; i < Arr.length ; i++)
        {
            for(j = 0 ; j < Arr[i].length ; j++)
            {
                if(j == 0)
                {
                    System.out.print(Arr[i][j]+" ");  //i want to printf only first column 
                }  
            }
            System.out.println();
        }
    }
}