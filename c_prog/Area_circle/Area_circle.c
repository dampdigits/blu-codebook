#include<stdio.h>
#include<math.h>

int main(void)
{
    float radius,height,area,volume;
	
    printf("Enter radius\n");
    scanf("%f",&radius);
	
    area= M_PI * pow(radius,2);
    printf("Area of circle is %f sq. units\n",area);
	
    printf("Enter height\n");
    scanf("%f",&height);
	
    volume=area*height;
    printf("Volume of circle is %f cube. units\n",volume);
	
    return 0;
}