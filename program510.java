//  accept folder name from user and display name of file in that folder

import java.util.*;
import java.io.*;

class program510
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
                for(int i = 0; i < list.length; i++)
                {
                    System.out.println("File Name : "+list[i].getName()+"File size :"+list[i].length());
                }
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