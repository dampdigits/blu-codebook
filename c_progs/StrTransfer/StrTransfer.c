#include <stdio.h>
#include <string.h>

void strtransfer(char* str1, char* str2)
{
	int i, len=strlen(str2);
	for(i=0; i<len; i++)
	{
		str1[i]=str2[i];
	}
	str1[i]='\0';
	
}

int main()
{
    char str1[20], str2[20];
	
	printf("\nEnter first string\n");
	fgets(str1,20,stdin);
    printf("\nEnter second string\n");
	fgets(str2,20,stdin);
	
	strtransfer(str1,str2);
	
	printf("\nstr1= %s",str1);
	printf("\nstr2= %s",str2);
	
    return 0;
}