#include <stdio.h>
#include <string.h>

void slice(char *str, int a, int b)
{
	int i;
	for(i=0; (i+a)<b; i++)
	{
		str[i]=str[i+a];
	}
	str[i]='\0';
}

int main()
{
	char str[20];
	int a,b;
	
	fgets(str,20,stdin);
	printf("SLICE:\n\nfrom: ");
	scanf("%d",&a);
	printf("to: ");	
	scanf("%d",&b);
	
	slice(str,a,b);
	printf("\nsliced = %s\n", str);
	
	return 0;
}