#include<stdio.h>
                    /*
                        *
                        * * *
                        * * * * *
                        * * * * * * *  using recursion  1 3 5 7 9 11 --> 2n-1
                    */

void stars(int);

int main()
{
    printf("How many lines of star pattern do u want?\n");
    int n;
    scanf("%d", &n);

    printf("\n");

    for(int i=1; i<=n; i++)
    {
        int j = (2*i) - 1;
        stars(j);
        printf("\n");
    }
    
    return 0;
}

void stars(int j)
{
    if(j==0)
    printf("");
    else
    {
        printf("* ");
        stars(--j);
    }
    
}