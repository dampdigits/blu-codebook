#include<stdio.h>
int main()
{
    //Take input from user

    printf("Enter any number\n");
    float f;                //declaring a variable
    scanf("%f", &f);         //storing number in variable

    f<0 ? printf("The number is negative.\n") : printf("The number is positive.\n");

    //if number is less than zero first command will execute, otherwise the second one.

    return 0;
}