import java.util.*;
import java.io.*;

class program519
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

            String Tokens[];
            Tokens = HeaderStr.split(" ");

            System.out.println("File name :"+Tokens[0]);
            System.out.println("File length :"+Tokens[1]);

            File newfileobj = new File(Tokens[0]);
            newfileobj.createNewFile();
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured :"+obj);
        }
    }
}