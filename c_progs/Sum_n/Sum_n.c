#include<stdio.h>   //Sum of first n natural no.s using recursion

int sum(int);

int main()
{
    printf("Enter the number upto which u want the sum of natural numbers\n");
    int n;
    scanf("%d", &n);

    printf("Sum of first %d natural numbers are %d", n, sum(n));
    return 0;
}

int sum(int n)
{
    if(n==1)
    return 1;
    else
    return n + sum(n-1);
}