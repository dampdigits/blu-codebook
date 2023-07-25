#include<stdio.h>
int main()
{
    float principle,rate,time,interest;
    printf("Enter principal\n");
    scanf("%f",&principle);
    printf("Enter rate\n");
    scanf("%f",&rate);
    printf("Enter time in years\n");
    scanf("%f",&time);
    interest= (principle*rate*time)/100;
    printf("The simple interest is %f\n",interest);
    return 0;
}