class Linear_Search
{
    public static void main(double n)
    {
        int array[]=new int[]{45,62,17,39,58},flag=0,i;
        for(i=0;i<5;i++)
        {
            if(n==array[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("\nThe no. is present at position: "+(i+1));
        }
        else
        {
            System.out.println("\nThe no. is not present");    
        }
    }
}