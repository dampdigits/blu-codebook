#include <stdlib.h>
#include <ctype.h>
#include <stdio.h>
#include <time.h>

#define COLOROFF "\e[m"
#define BOLD "\e[1m"
#define BLINK "\e[6m"
#define BLCKTXT "\e[30m"
#define REDTXT "\e[31m"
#define GRNTXT "\e[32m"
#define YLWTXT "\e[33m"
#define BLUTXT "\e[36m"
#define GREYBG "\e[47m"

// sw gs wg
char input, cpu;
char arr[]={'S', 'W', 'G'};
int found=0, result=0;

void check(int i)
{
	int index=i+1, tmp;	//right wins
	if(index>2)
	{
		index=0;
	}
	if(cpu==arr[index])
	{
		result=1;
	}
	else	//left loses
	{
		index=i-1;
		if(index<0)
			index=2;
		if(cpu==arr[index])
			result=-1;
	}
}

void find() //checks whether input is corect, if correct finds cpu's choice & decides result
{	
	for(int i=0; i<3; i++)
	{
		if(arr[i]==input)//input found
		{
			found=1;
			check(i);	//check cpu's choice wrt user input in circular queue
		}
	}
}

int main()
{
	system("cls");
	printf(GREYBG BOLD BLINK GRNTXT "\t     SNAKE " BLUTXT " WATER " REDTXT " GUN     \t\n" COLOROFF);
    
	//input character
	printf(YLWTXT "\nENTER:\t\tS->Snake    W->Water    G->Gun\n\nUSER- ");
	scanf("%c",&input);
	input=toupper(input);
	
	//cpu choosing random item
	srand(time(NULL));
	cpu=arr[rand()%3];
	
	find();	//check input in array
	
	if(found==1) //correct input
	{
		printf("CPU- %c \n",cpu);
		
		if(result==1)		//user won
			printf(BLINK GRNTXT "\n\nVICTORY !!\n"COLOROFF);
			
		else if(result==0)	//draw
			printf(BLINK BLUTXT "\n\nDRAW!\n"COLOROFF);
			
		else				//user lost
			printf(BLINK REDTXT "\n\nDEFEAT\n"COLOROFF);
	}
	else	//wrong input
	{
		printf(BOLD REDTXT"\n\nWRONG INPUT!!"COLOROFF);
	}
	
    return 0;
}