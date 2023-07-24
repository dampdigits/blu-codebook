import java.util.Scanner ;
public class StrArray
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  String arr1[]=new String[5];
  String arr2[]=new String[5];
  String temp="";
  int flag=0;
  System.out.println("Enter 5 names");
  for(int i=0;i<5;i++)
  {
    arr1[i]=sc.nextLine();
    arr2[i]=arr1[i].toUpperCase();
  }
  for(int j=0;j<4;j++)
  {
    flag=0;
    for(int k=0;k<4-j;k++)
    {
      if(arr2[k].compareTo(arr2[k+1])>0)
      {
        temp=arr1[k];
        arr1[k]=arr1[k+1];
        arr1[k+1]=temp;
        flag=1;
      }
    }
    if(flag==0)
    {
      break;
    }
  }
  System.out.println();
  for(int l=0;l<5;l++)
  {
    System.out.println(arr1[l]);
  }
  }
}