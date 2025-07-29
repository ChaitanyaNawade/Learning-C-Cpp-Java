import java.util.*;
import java.io.*;

class FileHandling4
{
    public static void main(String A[]) throws Exception
    {   
            File fobj = new File("Marvellous.txt");
            System.out.println("The file size is : "+fobj.length());
            System.out.println("The file name is :"+fobj.getName());       
    }
}