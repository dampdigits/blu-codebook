#include <stdio.h>

typedef struct employee	//global structure
	{
		char name[20];
		int code;
		float salary;
	}emp;
	
void show(emp arr[])
{
	for(int i=0; i<3; i++)
	{
		printf("\n\nEmployee - %d :\n\n",i+1);
		printf("Name - %s",arr[i].name);
		printf("\nCode - %d",arr[i].code);
		printf("\nSalary - %.2f\n\n",arr[i].salary);
	}
}

int main()
{
	emp arr[3];
	
	for(int i=0; i<3; i++)
	{
		printf("\nEmployee - %d :\n\n",i+1);
		printf("Name - ");
		scanf("%s",arr[i].name);
		printf("Code - ");
		scanf("%d",&arr[i].code);
		printf("Salary - ");
		scanf("%f",&arr[i].salary);
	}
	
	show(arr);
	
    return 0;
}

//----------------------------------------------------------------
//CODE BY CHAT GPT

// #include <stdio.h>

// struct employee {
    // char name[100];
    // int code;
    // float salary;
// };

// int main() {
    // struct employee emp[3];

    // for (int i = 0; i < 3; i++) {
        // printf("Enter the name of employee %d: ", i+1);
        // scanf("%s",emp[i].name);
        // printf("Enter the code of employee %d: ", i+1);
        // scanf("%d", &emp[i].code);
        // printf("Enter the salary of employee %d: ", i+1);
        // scanf("%f", &emp[i].salary);
    // }

    // printf("\n\nEmployee Details:\n");
    // for (int i = 0; i < 3; i++) {
        // printf("Name: %s\nCode: %d\nSalary: %.2f\n\n", emp[i].name, emp[i].code, emp[i].salary);
    // }
    // return 0;
// }