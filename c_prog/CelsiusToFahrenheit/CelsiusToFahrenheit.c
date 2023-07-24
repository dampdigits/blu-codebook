#include<stdio.h>
int main()
{
    float celsius,fahrenheit;
    printf("Enter temperature in celsius\n");
    scanf("%f",&celsius);
    fahrenheit= (celsius*9)/5 +32;
    printf("The temperature in fahrenheit is %f\n",fahrenheit);
    return 0;
}