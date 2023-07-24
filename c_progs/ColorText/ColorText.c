#include <stdio.h>

//#define COLOR_BOLD "\e[0m"
#define COLOR_OFF "\e[m"

int main(void)
{
    for(int i=0; i<=50; i++)
	{
		printf("\n\e[%dm\\e[%dm" COLOR_OFF, i,i);
    }
	for(int i=41; i<48; i++)
	{
		for(int j=0; j<6; j++)
		System.out.println("\033["+i+"m");
	}
	System.out.println("\033[0m");
    return 0;
} 