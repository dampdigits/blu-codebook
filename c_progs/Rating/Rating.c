#include<stdio.h>
int main()
{
    int n;
    printf("Enter the no. of stars for rating\n");
    scanf("%d",&n);
    switch(n)
    {
        case 1:
        printf("* Very bad\n");
        break;
        case 2:
        printf("** Bad\n");
        break;
        case 3:
        printf("*** Moderate\n");
        break;
        case 4:
        printf("**** Good\n");
        break;
        case 5:
        printf("***** Very good\n");
        break;
        default:
        printf("Wrong input!\n");
    }
    return 0;
}