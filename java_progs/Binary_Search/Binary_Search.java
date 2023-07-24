class Binary_Search//Binary search works only for sorted arrays
{
    public static void main(int n)
    {
        int array[]=new int[]{26,35,48,59,66},L=0,U=4,M=0,flag=0;
        while(L<=U)
        {
            M=(L+U)/2;
            if(n<array[M])
            {
                U=M-1;
            }
            else if(n>array[M])
            {
                L=M+1;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("\nThe no. is present at position: "+(M+1));
        }
        else
        {
            System.out.println("\nThe no. is not present");
        }
    }
}