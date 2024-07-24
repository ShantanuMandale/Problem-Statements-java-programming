// accept folder name from user and check it is directory or not

import java.util.*;
import java.io.*;

class program508
{
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter the file name of folder :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);
        
        try
        {
            boolean bRet = fobj.isDirectory();
            if(bRet == true)
            {
                System.out.println("Its a directory");
            }
            else
            { 
                System.out.println("Its not directory");
            }
      
        }
        catch(Exception iobj)
        {
            System.out.println("Exception Occured :"+iobj);
        }    
    }
}