//Create new file

import java.util.*;
import java.io.*;

class program503
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter the file name that you want to create :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        boolean bRet = fobj.createNewFile();

        if(bRet == true)
        {
            System.out.println("File successfully created");
        }
        else
        {
            System.out.println("Unable to create file");
        }
    }
}