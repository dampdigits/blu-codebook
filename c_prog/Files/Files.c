#include <stdio.h>

int main()
{
    FILE *fptr, *ptr;
	fptr=fopen("Sample.txt", "r");
	ptr=fopen("Sample1.txt", "w");
	char ch;
	ch=fgetc(fptr);
	
	while(ch!=EOF)
	{
		fprintf(ptr, "%c", ch);
		ch=fgetc(fptr);
	}
	fclose(fptr);
	
	
	//fscanf(fptr, "%s", &ch);
	
	//printf("\n%s", ch);
	
	// if(fptr==NULL)
		// printf("File doesn't exist");
	// else
		// printf("File does exist");
	fclose(ptr);
	
    return 0;
}