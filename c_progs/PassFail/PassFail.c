#include<stdio.h>
int main()
{
    float math,english,science;

    printf("Enter marks in maths\n");
    scanf("%f",&math);

    printf("Enter marks in english\n");
    scanf("%f",&english);

    printf("Enter marks in science\n");
    scanf("%f",&science);

    float avgmarks=(math + english + science)/3;

    if(avgmarks < 40 || math<33 || english<33 || science<33)
    {
        printf("The percentage is %f. And the student has failed.\n",avgmarks);
    }
    else
    {
        printf("The percentage is %f. And the student has passed.\n",avgmarks);
    }
    return 0;
}