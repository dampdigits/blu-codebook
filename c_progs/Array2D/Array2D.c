
#include<stdio.h>


void display(int *ptr, int r, int c)
{
    printf("\nThe elements of the matrix(array) are:\n\n");

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            printf("%d ", *ptr++);
        }
        printf("\n");
    }
}

int main()
{
    int r,c;
    printf("\nEnter the no. of rows\n");
    scanf("%d", &r);
    printf("\nEnter the no. of columns\n");
    scanf("%d", &c);

    int arr[r][c];
    printf("\nEnter the elements\n");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    display(&arr[0][0],r,c);
    return 0;
}