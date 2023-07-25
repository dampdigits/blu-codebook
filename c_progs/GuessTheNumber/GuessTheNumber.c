#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int main()
{
    srand(time(0));
    int num = rand()%100 + 1;
    
    int guess = 0, guess_num = 0;
    
    printf("Guess the number\n");

    do
    {
        scanf("%d", &guess);
        guess_num ++;

        if (guess > num)
        {
            printf("Your guess is higher than the number. Guess a lower number again\n");

        }
        else if (guess < num)
        {
            printf("Your guess is lower than the number. Guess a higher number again\n");

        }
        else
        {
            printf("Your guess is correct & it took you %d guesses!!\n", guess_num);
        }
    }while(guess != num);

    return 0;
}