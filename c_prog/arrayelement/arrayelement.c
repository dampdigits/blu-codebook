/* Program inserts or deletes an element in an array.
   Usage: ./<program_name> [-d|-i]
   -d: deletes an element
   -i: inserts an element
   */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// global variables
int *arr;
int num[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
int length = sizeof(num) / sizeof(int); // number of elements

// function prototypes
void insert(void);
void delete(void);
void display(void);
int input_idx(void);
int check_idx(int idx);

int main(int argc, char *argv[])
{
    // check for wrong usage
    if (argc != 2 || strlen(argv[1]) != 2)
    {
        printf("ERROR!\nUsage: %s [-d|-i]\n", argv[0]);
        return -1;
    }

    char option = '\0';

    // check for delete flag
    if (strcmp(argv[1], "-d") == 0)
    {
        option = 'd';
    }
    // check for insert flag
    else if (strcmp(argv[1], "-i") == 0)
    {
        option = 'i';
    }
    // terminate program if no valid flag found
    else
    {
        printf("\nInvalid option.\n\nValid options are:\n-d : to delete element\n-i : to insert element\n");
        return 1;
    }

    // allocate memory for array
    arr = (int *) malloc(length * sizeof(int));

    // check for memory allocation failure
    if (arr == NULL)
    {
        printf("\nOut of memory!\n");
        return 2;
    }

    // storing 10, 20, 30, ...., 100 in array as elements
    for (int i = 0; i < length; i++)
    {
        arr[i] = num[i];
    }

    // display elements before modification
    display();

    switch (option)
    {
        // delete element
        case 'd':

            delete();
            break;

        // insert element
        case 'i':

            insert();
            break;
    }

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

// delete element at given index
void delete(void)
{
    // input index
    int idx = input_idx();

    // shift elements to left
    for (int i = idx; i < length - 1; i++)
    {
        arr[i] = arr[i + 1];
    }
    // delete last element
    arr[length - 1] = 0;

    // re-allocate re-sized array
    int *tmp = realloc(arr, (--length) * sizeof(int));

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

    printf("\nDeleted element at index - %d\n", idx);
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
