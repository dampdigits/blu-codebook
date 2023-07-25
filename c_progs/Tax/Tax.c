#include <stdio.h>

void main()
{
    float salary, tax;

    printf("Enter annual salary\n");
    scanf("%f", &salary);

    if(salary < 250000)
    {
        tax = 0;
    }

    else if(salary >= 250000 && salary < 500000)
    {
        tax = (0.5) * salary;
    }

    else if(salary >= 500000 && salary < 1000000)
    {
        tax = (0.1) * salary;
    }

    else
    {
        tax = (0.15) * salary;
    }
    
    printf("Tax = %f\n", tax);

}