#include <stdio.h>
#include <string.h>

void encrypt(char* str)
{
	int i;
	for(i=0; i<strlen(str); i++)
		str[i]+=1;
	str[i-1]='\0';
}

int main()
{
	char str[30];
	printf("\nEnter a string to encrypt\n");
    fgets(str,30,stdin);
	
	encrypt(str);
	printf("\nAfter encryption:\n\n%s",str);
    return 0;
}