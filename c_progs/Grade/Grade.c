//A for 91-100, B for 81-90, C for 71-80, D for 61-70, E for 50-60, F for below 50

#include<stdio.h>

int checkMarks(float);
char makeGrade(float marks);

int main()
{
    float math,english,science;

    printf("\nEnter marks in maths = ");
    scanf("%f", &math);

    if(checkMarks(math) == 1)
    {
        
        printf("Enter marks in english = ");
        scanf("%f", &english);

        if(checkMarks(english) == 1)
        {
            printf("Enter marks in science = ");
            scanf("%f", &science);

            if(checkMarks(science) == 1)
            {
                printf("\nGrade in mathematics - %c\n", makeGrade(math));

                printf("Grade in english - %c\n", makeGrade(english));

                printf("Grade in science - %c\n\n", makeGrade(science));
            }
        }

    }
    return 0;
}



int checkMarks(float marks)
{
    int valid;
    if(marks <= 100 && marks >= 0)
    {
        valid=1;
    }
    else
    {
        valid=0;
        printf("\n\n\033[0;31mWrong input! Marks has to be within 0 to 100\033[0m\n\n");
    }
    return valid;
}



char makeGrade(float marks)
{
    char grade;

    if(marks >= 90 )   //90-100
    {
        grade='A';
    }
    else if(marks >= 80 && marks < 90)   // 81-90
    {
        grade='B';
    }
    else if(marks >= 70 && marks < 80)   // 71-80
    {
        grade='C';
    }
    else if(marks >= 60 && marks < 70)   // 61-70
    {
        grade='D';
    }
    else if(marks >= 50 && marks < 60)   // 50-60
    {
        grade='E';
    }
    else                                // < 50
    {
        grade='F';
    }
    return grade;
}