import java.util.*;
import java.io.*;
class FileHandling1
{
    public static void main(String A[])
    {
        try
        {
        File fobj = new File("Marvellous.txt");

        fobj.createNewFile();
        }

        catch(IOException iobj)
        {
            
        }
    }
}