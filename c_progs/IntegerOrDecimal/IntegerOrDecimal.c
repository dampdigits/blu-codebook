#include<stdio.h>
#include<math.h>
int main()
{
    //Take input from user

    printf("Enter any number\n");
    float num;            //declaring a variable
    scanf("%f",&num);     //storing number in variable

    int roundNum=round(num);    //rounding off to nearest integer

    roundNum == num? printf("%d is an integer.\n", roundNum) : printf("%f is a decimal number.\n", num);
    //if the rounded figure is equal to the input then it means it is an integer

    return 0;
}