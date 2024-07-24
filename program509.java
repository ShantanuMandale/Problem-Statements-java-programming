//  accept folder name from user and display total number file in that folder

import java.util.*;
import java.io.*;

class program509
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
                File list[] = fobj.listFiles();

                System.out.println("Number of files in that directory are : "+list.length);

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