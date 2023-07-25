#include<stdio.h>
int main()
{
    int n;
    printf("\nEnter a number\n");
    scanf("%d",&n);
    int *a=&n; // a will store the address of n
    printf("\nn = %d\n", n);
    printf("\nn = %d\n",*a);
    printf("\nn = %d\n",*(&n));
    
    printf("\nAddress of n = %p\n",&n);
    printf("\nAddress of n = %p\n", a);
    
    printf("\nAddress of a = %p\n",&a);
    printf("\nAddress of n = %p\n",&(*a));
    return 0;
}