// Accepting 'n' number of elements from the user and displaying them using an array

import java.util.*;

class Array3
{
    public static void main(String A[]) 
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array");
        for(i = 0 ; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Elements from the array are");
        for(i = 0 ; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
        System.out.println();
    }
}