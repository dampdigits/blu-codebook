#include<stdio.h>

void reverseArray(int *arr, int n)
{
    for(int i=0; i<n/2; i++) //swaps elements
    {
        int temp = arr[i];
        arr[i] = arr[n-(i+1)];
        arr[n-(i+1)] = temp;
    }
}
void display(int *ptr,int n)
{
    printf("\nThe reversed elements are:\n\n");
    for(int i=0; i<n; i++)
    {
        printf("%d ", ptr[i]);
    }
}
int main()
{
    int n;
    printf("\nEnter the array length\n");
    scanf("%d", &n);

    int arr[n];
    printf("\nEnter integer elements\n");
    for(int i=0; i<n; i++)
    {
        scanf("%d",&arr[i]);
    }

    reverseArray(arr,n);
    display(arr,n);

    return 0;
}