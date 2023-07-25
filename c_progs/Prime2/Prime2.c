#include<stdio.h>
int main()
{
    int num = 0, prime = 0, i = 2;

    printf("Enter a number to check whether its a prime or not\n");
    scanf("%d", &num);

    while(i <= num/2)
    {
        prime = 1;
        int remainder = num % i;

        if (remainder == 0)
        {
            prime = 0;
            break;
        }

        i++;
    }

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