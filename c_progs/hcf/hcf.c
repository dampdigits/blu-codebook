#include<stdio.h>

int gcd(int num1, int num2);

int main(void)
{
    int num1,num2;
	printf("\nEnter 2 numbers\nNumber-1: ");
	scanf("%d", &num1);
	printf("Number-2: ");
	scanf("%d", &num2);
	printf("GCD or HCF of %d & %d is %d\n", num1, num2, gcd(num1, num2));
    return 0;
}

int gcd(int num1, int num2)
{
	if (num1 == num2)
	{
		return num1;
	}
	else if (num1 == 0)
	{
		return num2;
	}
	else if (num2 == 0)
	{
		return num1;
	}
	else
	{
		if (num1 < num2)
		{
			return gcd(num1, num2 - num1);
		}
		else
		{
			return gcd(num1 - num2, num2);
		}
	}
}