#include <stdio.h>
#include <string.h>

int chTimes(char* str, char ch)
{
	int count=0;
	for(int i=0; i<strlen(str); i++)
		if(str[i]==ch)
			count++;
	return count;
}

int main()
{
	char str[30],ch;
    printf("\nEnter a string\n");
	fgets(str,30,stdin);
    printf("\nEnter a character to find it's no. of occurrences\n");
	scanf("%c",&ch);
	int count=chTimes(str,ch);
	printf("No. of occurrences of '%c' is %d\n",ch,count);
    return 0;
}