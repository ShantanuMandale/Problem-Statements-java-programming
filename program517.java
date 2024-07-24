import java.util.*;
import java.io.*;

class program517
{
    public static void main(String arg[])
    {
        System.out.println("----------- Marvellous Packer Unpacker ----------- ");
        
        System.out.println("Unpacking Actvity of the appication is started...");

        Scanner sobj = new Scanner(System.in);
        byte Header[] = new byte[100];

        System.out.println("Enter the file name which contain Packed data :");
        String PackFile = sobj.nextLine();

        try
        {
            File Packobj = new File(PackFile);

            FileInputStream inobj = new FileInputStream(Packobj);

            inobj.read(Header,0,100);

            String HeaderStr = new String(Header);

            System.out.println(HeaderStr);
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured :"+obj);
        }
    }
}