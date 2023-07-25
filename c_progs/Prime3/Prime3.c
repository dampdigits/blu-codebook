#include<stdio.h>
int main()
{
    int num = 0, prime = 1, i = 2;

    printf("Enter a number to check whether its a prime or not\n");
    scanf("%d", &num);

    do
    {
        int remainder = num % i;

        if (remainder == 0)
        {
            prime = 0;
            break;
        }

        i++;
    }while(i <= num/2);

    if (prime == 1)
    {
        printf("Its a prime number\n");
    }
    else
    {
        printf("Its not a prime number\n");
    }

    return 0;
}