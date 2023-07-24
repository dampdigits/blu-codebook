#include<stdio.h>   //using loop

void fibo(int);

int main()
{
    printf("Enter the limit of fibonacci series\n");
    int n;
    scanf("%d", &n);

    fibo(n);
    return 0;
}

void fibo(int n)
{
    if(n == 0)
    {
        printf("0\n");
    }
    else
    {
        printf("0, 1");
        int a=0, b=1, sum=0;

        while(sum<n)
        {
            sum=a+b;
            if(sum<=n)
            {
                printf(", %d", sum);
            }
            a=b;
            b=sum;
        }
    }
}