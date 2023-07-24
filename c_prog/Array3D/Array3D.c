#include<stdio.h>
int main()
{
    int x,y,z;
    printf("\n\nValue of x-dimension = ");
    scanf("%d", &x);
    printf("\nVlue of y-dimension = ");
    scanf("%d", &y);
    printf("\nValue of z-dimension = ");
    scanf("%d", &z);

    int arr[x][y][z];
    printf("\nEnter integer elemnts:\n");
    for(int i=0; i<x; i++)
    {
        for(int j=0; j<y; j++)
        {
            for(int k=0; k<z; k++)
            {
                scanf("%d", &arr[i][j][k]);
            }
        }
    }

    printf("\nThe 3D matrix:\n\n");

    for(int i=0; i<x; i++)
    {
        for(int j=0; j<y; j++)
        {
            for(int k=0; k<z; k++)
            {
                printf("%d ", arr[i][j][k]);
            }
            printf("\n");
        }
        printf("\n\n");
    }

    printf("\nThe address of elements:\n\n");

    for(int k=0; k<z; k++)
    {
        for(int j=0; j<y; j++)
        {
            for(int i=0; i<x; i++)
            {
                printf("%d ", &arr[i][j][k]);
            }
            printf("\n");
        }
        printf("\n\n");
    }
    
    return 0;
}