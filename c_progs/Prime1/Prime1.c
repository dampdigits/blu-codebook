#include<stdio.h>
int main()
{
    int num = 0, prime = 0, remainder = 0; /* prime = 1 indicates the number is prime
                                              & prime = 0  indicated it isn't */

    printf("Enter a number to check whether it is prime or not\n");
    scanf("%d", &num);

    for (int i = 2; i <= num/2 ; i++)
    {
        prime = 1;  /* prime is not intialised as 1 in the beginning to avoid
                       num = 0 from being prime */

        remainder = num % i;

        if(remainder == 0)
        {
            prime = 0;
            break;
        }
    }

    if(prime == 1)
    {
        printf("It is a prime number\n");
    }
    else
    {
        printf("It is not a prime number\n");
    }
    
    return 0;
}