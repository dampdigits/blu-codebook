#include <stdio.h>
#include <string.h>

int main()  //this program is an intro to how Strings work in C
{
    // method-1
    char s[]={'S','t','r','i','\0'};
    printf("\ns = %s", s);

    // method-2
    char str[]="Strin";
    printf("\nstr = %s", str);

    // method-3
    char *ptr="String";
    printf("\nptr = %s\n", ptr);

    // each character of *ptr is printed using %c
    while(*ptr!='\0')
    {
        printf("%c", *ptr);
        ptr++;
    }

    ptr=s;  // a pointer can be modified


    printf("\n%s", ptr);

    int l1 = strlen(s), l2= strlen(str), l3 = strlen(ptr);
	//stores the no. characters

    printf("\nsize of:\ns = %d, str = %d, ptr = %d", l1, l2, l3); //strlen() excludes the null character
    printf("\nptr[0] = %c\n", ptr[0]); // *ptr="String" works like an array
	
	//gets() & puts()
	printf("Enter something\n");
	char str1[20];
	gets(str1);
	puts(str1);
	printf("Enter something\n");
	char *str2;
	gets(str2);
	puts(str2);
	
	return 0;
}