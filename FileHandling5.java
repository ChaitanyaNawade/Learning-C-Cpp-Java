import java.util.*;
import java.io.*;

class FileHandling5
{
    public static void main(String A[]) throws Exception
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the file name that you want to create");

            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

           if(fobj.exists())
           {
              FileOutputStream foobj = new FileOutputStream(fobj);
              String str = "Jay Ganesh";

              byte Arr[] = str.getBytes();
              
              foobj.write(Arr);
           }
           else
           {
                fobj.createNewFile();
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh";

                byte Arr[] = str.getBytes();
                foobj.write(Arr);
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