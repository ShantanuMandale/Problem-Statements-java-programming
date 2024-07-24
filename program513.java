// header file la 100 byte kara (Header formation)
import java.util.*;
import java.io.*;

class program513
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
                    if((list[i].getName()).endsWith(".txt")) //Filter
                    {
                        Header = list[i].getName() +" " + list[i].length();
                        for(int j = Header.length(); j < 100;j++)
                        {
                            Header = Header + " ";
                        }
                         System.out.println(Header);
                        System.out.println(Header.length());
                    }
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