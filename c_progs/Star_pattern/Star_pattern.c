#include<stdio.h>   /*  
                        *
                        * *
                        * * *
                        * * * *    using recursion
                    */

void stars(int);

int main()
{
    printf("How many lines of pattern do u want?\n");
    int n;
    scanf("%d", &n);

    printf("\n");

    for(int i=1; i<=n; i++)
    {
        stars(i);
        printf("\n");
    }
    
    return 0;
}

void stars(int n)
{
    if(n==0)
    printf("");
    else
    {
        printf("* ");
        stars(--n);
    }
    
}