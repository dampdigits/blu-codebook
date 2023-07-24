#include<stdio.h>
int main()
{
    int age,vip;
    printf("Enter age.\n");
    scanf("%d",&age);
    printf("Does the person have VIP pass? Enter 1 for yes or 0 for no.\n");
    scanf("%d",&vip);
    if(vip==1||vip==0)
    {
        if(age>17 && age<71)
        {
            printf("The person is eligible for driving liscence.");
        }
        else if(vip==1)
        {
            printf("The person is eligible for driving liscence.");
        }
        else
        {
            printf("The person is not eligible for driving liscence.");
        }
    }
    else
    {
        printf("Wrong input!!");
    }
    return 0;
}