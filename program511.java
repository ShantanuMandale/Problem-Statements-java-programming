

import java.util.*;
import java.io.*;

class program511
{
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter the file name of folder :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);
        String Header = null;
        
        try
        {
            boolean bRet = fobj.isDirectory();
            if(bRet == true)
            {
                File list[] = fobj.listFiles();
                for(int i = 0; i < list.length; i++)
                {
                   Header = list[i].getName() +" " + list[i].length();
                   System.out.println(Header);
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