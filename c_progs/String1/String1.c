#include <stdio.h>
#include <string.h>	 //demonstration of some String functions

int main()
{
	char str1[20]="Sameer", str2[20]="Salam", *str3="Sk.";
	printf("\nstr1[] = %s, str2[] = %s, *str3 = %s\n\n", str1, str2, str3);
	
	//strlen()
	printf("strlen() :\n");
	int l1=strlen(str1), l2=strlen(str2);
	printf("strlen(str1) = %d, strlen(str2) = %d\n\n", l1, l2);
	
	//strcpy()
	printf("strcpy() :\n");
	strcpy(str1,str2);
	printf("strcpy(str1,str2)---> str1 = %s\n\n",str1);
	
	//strcat()
	printf("strcat() :\n");
	strcat(str1,str2);
	printf("strcat(str1,str2)--> str1 = %s\n\n",str1);
	
	//strcmp()
	printf("strcmp() :\n");
	int val1 = strcmp(str1,str2);
	printf("strcmp(str1,str2) = %d\n",val1);
	int val2 = strcmp(str1,str3);
	printf("strcmp(str1,str3) = %d\n",val2);
	int val3 = strcmp("gfg","gfg");
	printf("strcmp(\"gfg\",\"gfg\") = %d",val3);
    return 0;
}