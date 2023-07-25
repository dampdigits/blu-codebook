#include<stdio.h>
int n=0, num[1], times=0;
void input()
{
    printf("\nHow many mutliplication tables do u want?\n");
    scanf("%d", &n);

    num[n];
    printf("\nEnter the number(s) whose table u want\n");
    for(int i=0; i<n; i++)
    {
        printf("\nNumber-%d = ", i+1);
        scanf("%d", &num[i]);
    }

    printf("\nUpto which number do u want each table to be?\n");
    scanf("%d", &times);
}

void display()
{
    printf("\nThe tables:\n\n");

    for(int i=0; i<times; i++)
    {   
        for(int j=0; j<n; j++)
        {
            printf("%d x %d = %d\t", num[j], (i+1), num[j]*(i+1));
        }
        printf("\n");
    }
}

int main()
{
    input();
    display();
    return 0;
}