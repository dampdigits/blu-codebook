#include<stdio.h>
int main()
{
    printf("\nEnter the size of array\n");
    int n;
    scanf("%d",&n);
    int arr[n];
    printf("\nEnter integer elements\n");
    for(int i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }
    for(int i=0; i<n; i++)
    {
        printf("\nElement-%d = %d\n", i+1,arr[i]);
        printf("\nAddress = %p\n", &arr[i]);
        printf("\nAddress = %u\n", &arr[i]);
        printf("\nAddress = %d\n", &arr[i]);
    }
    return 0;
}