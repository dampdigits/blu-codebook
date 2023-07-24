#include<stdio.h>
int main()
{
    float length,breadth,area;
    printf("Enter the length of rectangle\n");
    scanf("%f",&length);
    printf("Enter the breadth of rectangle\n");
    scanf("%f",&breadth);
    area=length*breadth;
    printf("Area of rectangle is %f sq. units\n",area);
    return 0;
}