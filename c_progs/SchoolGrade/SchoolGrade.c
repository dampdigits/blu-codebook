#include <stdio.h>
#include <stdlib.h>

int main()
{
    system("cls");
	
	int marks; char ch;
	printf("\nEnter marks- ");
	scanf("%d", &marks);
	
	if(marks>-1 && marks<101)
	{
		switch(marks/10)
		{
			case 10:
			ch='E';
			break;
			case 9:
			ch='E';
			break;
			case 8:
			ch='A';
			break;
			case 7:
			ch='B';
			break;
			case 6:
			ch='C';
			break;
			case 5:
			ch='D';
			break;
			default:
			ch='F';
			break;
		}
		printf("Grade - %c", ch);
	}
	else
		printf("\nWRONG INPUT!");
	
    return 0;
}