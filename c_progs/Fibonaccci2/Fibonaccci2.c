#include<stdio.h>   //using recursion

int fibo(int);

int main()
{
    printf("Enter the limit of fibonacci series\n");
    int n;
    scanf("%d", &n);

    printf("The fibonacci series is:\n");

    for(int i=1; i<=n; i++)
    {
        printf("%d\n", fibo(i));
    }
    
    return 0;
}

int fibo(int n)
{
    if(n==1)
    return 0;

    else if(n==2)
    return 1;

    else
    return fibo(n-1)+fibo(n-2);
}