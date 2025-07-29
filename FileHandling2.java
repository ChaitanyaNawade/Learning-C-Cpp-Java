import java.util.*;
import java.io.*;
class FileHandling2
{
    public static void main(String A[])
    {
        try
        {
        File fobj = new File("Marvellous.txt");

        if(fobj.exists())
        {
            System.out.println("File is already present");
        }
        else
        { 
            fobj.createNewFile();
            System.out.println("File successfully created");
        }
        }

        catch(IOException iobj)
        {
            
        }
    }
}