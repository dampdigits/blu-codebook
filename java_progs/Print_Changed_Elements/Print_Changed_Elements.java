class Print_Changed_Elements
{
    public static void main(int array[])
    {
        int n=array.length;
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==0)
            {
                array[i]+=10;
            }
            else
            {
                array[i]+=15;
            }
            System.out.print(array[i]);
            if(i<n-1)
            {
                System.out.print(",");
            }
        }
    }
}
