import java.util.*;
import java.io.*;
class FileHandling3
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the file name which you want :");

            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

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

        catch(Exception eobj)
        {
            
        }
    }
}