#include <stdio.h>
#include <math.h>
#include <ctype.h>
#include <string.h>

int main(void)
{
	char hex[20];
	printf("\nHexadecimal: ");
	gets(hex);
	int len = strlen(hex), dec = 0;
	
	for (int i = 0, p = len - 1; i < len; i ++, p --)
	{
		if (isdigit(hex[i]))
		{
			hex[i] -= '0';
			dec = dec + (hex[i] * pow(16, p));
		}
		else
		{
			int ascii = hex[i];
			if (ascii > 64 && ascii < 71)
			{
				int val = ascii - 55;
				dec = dec + (val * pow(16, p));
			}
			else
			{
				printf("WRONG INPUT!\n");
				return 1;
			}
		}
	}
	printf("Decimal: %d", dec);
	
    return 0;
}