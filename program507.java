// length of file in byte

import java.util.*;
import java.io.*;

class program507
{
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in); 

        System.out.println("Enter the file name that you want to create :");
        String FileName = sobj.nextLine();
        
        try
        {

            File fobj = new File(FileName);

            System.out.println("File name is :"+fobj.length());
      
        }
        catch(Exception iobj)
        {
            System.out.println("Exception Occured :"+iobj);
        }    
    }
}