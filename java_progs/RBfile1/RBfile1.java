import java.util.*;
import java.io.*;
class RBfile1
{
    public static void msin(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        FileOutputStream fout=new FileOutputStream("Inventory.dat");
        DataOutputStream ffout=new DataOutputStream(fout);
        int n,i,q,pr;
        String str,pc;
        System.out.println("Enter number of products");
        n=Integer.parseInt(in.readLine());
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter product name");
            str=in.readLine();
            System.out.println("Enter product code");
            pc=in.readLine();
            System.out.println("Enter quantities of product");
            q=Integer.parseInt(in.readLine());
            System.out.println("Enter price of products");
            pr=Integer.parseInt(in.readLine());
            ffout.writeUTF(str);
            ffout.writeUTF(pc);
            ffout.writeInt(q);
            ffout.writeInt(pr);
        }
        fout.close();
        ffout.close();
        FileInputStream fin=new FileInputStream("Inventory.dat");
        DataInputStream ffin=new DataInputStream(fin);
        boolean eof=false;
        while(!eof)
        {
            try
            {
                str=ffin.readUTF();
                pc=ffin.readUTF();
                q=ffin.readInt();
                pr=ffin.readInt();
                System.out.println("\nProduct name: "+str);
                System.out.println("Product code: "+pc);
                System.out.println("Quantities of product: "+q);
                System.out.println("Price of products: "+pr+"\n");
            }
            catch(EOFException e)
            {
                System.out.println("End-of-file encountered");
                eof=true;
            }
        }
        ffin.close();
        fin.close();
    }
}