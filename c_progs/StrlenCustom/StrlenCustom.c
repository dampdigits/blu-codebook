#include <stdio.h>
#include <string.h>

int main()
{
    char *str, c;
	int i=0;
	printf("\nEnter a string\n");
	gets(str);
	
	while(c!='\0')
	{
		str[i]=c;
		i++;
	}
	
	printf("\nThe length of the string is %d\n", i+1);
    return 0;
}