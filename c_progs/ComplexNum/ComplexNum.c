#include <stdio.h>
#include <stdlib.h>

typedef struct complex{
	int real, img;
}com;

void display(com arr[])
{
	printf("\n\n----------------------------------------------\n\nThe 5 complex no.s are:\n");
	for(int i=0; i<5; i++)
	{
		printf("\n%d+i(%d)", arr[i].real, arr[i].img);
	}
	printf("\n----------------------------------------------\n");
}

int main()
{
	system("cls");
    com arr[5];
	printf("\nEnter 5 complex no.s:-\n\n----------------------------------------------\n");
	for(int i=0; i<5; i++)
	{
		printf("\nNum-%d:\nReal= ",i+1);
		scanf("%d", &arr[i].real);
		printf("Complex= ");
		scanf("%d", &arr[i].img);
	}

	display(arr);
	
    return 0;
}