#include<stdio.h>
#include <stdlib.h>
#include <string.h>

// global variables
int *arr;
int num[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int length = sizeof(num) / sizeof(int);

void insert(void);
void display(void);
int input_idx(void);
int check_idx(int idx);

int main(void)
{
    // allocate memory for array
    arr = (int *) malloc(length * sizeof(int));

    // check for memory allocation failure
    if (arr == NULL)
    {
        printf("\nOut of memory!\n");
        return 2;
    }

    // storing array elements
    for (int i = 0; i < length; i++)
    {
        arr[i] = num[i];
    }

    // display elements before modification
    display();
	
	insert();
	
	// display elements after modification
    display();
    // free allocated memory
    free(arr);
	
    return 0;
}

// display elements in array
void display(void)
{
    printf("\nElements in array:\n");
    for (int i = 0; i < length; i++)
    {
        printf("%d\t", arr[i]);
    }
    printf("\n");
}

// inserts number at location
void insert(void)
{
    // increasing array size
    ++length;

    // input index
    int idx = input_idx();

    // input number to be inserted
    printf("\nEnter number to be inserted: ");
    int num;
    scanf("%d", &num);

    // re-allocate re-sized array
    int *tmp = realloc(arr, length * sizeof(int));

	// check for memory allocation failure
    if (tmp == NULL)
    {
        printf("\nOut of memory!\n");
		// free previously allocated memory
        free(arr);
		// terminate program
        exit(3);
    }

    arr = tmp;

    // shift elements
    for (int i = length - 2; i >= idx; i--)
    {
        arr[i + 1] = arr[i];
    }
    // insert number at index
    arr[idx] = num;

    printf("\nInserted %d at index - %d\n", num, idx);
}

// input index
int input_idx(void)
{
    int idx;
    do
    {
        // prompt to input index
        printf("\nEnter index: ");
        scanf("%d", &idx);

    } // repeat if index not valid
    while (!check_idx(idx));

    return idx;
}

// check for wrong index
int check_idx(int idx)
{
    if (idx < 0 || idx >= length)
    {
        // print error message
        printf("\nError:\n0 <= element_index <= %d\n", length - 1);
        return 0;
    }

    return 1;
}
