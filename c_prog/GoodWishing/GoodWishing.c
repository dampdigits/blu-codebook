/*  Morning: 5am <= time <12pm

    Afternoon: 12pm <= time < 6pm

    Evening: 6pm <= time < 9pm

    Night: 9pm <= time < 3am

    Midnight: 3am <= time < 5am
*/
#include<stdio.h>

int hours, mins, meridiem;
float time;

void input();

int check();

void to24hrs();

void wish();

void goodMorning();
void goodAfternoon();
void goodEvening();
void goodNight();
void midNight();

void main()
{
    input();
    if (check() == 1)
    {
        to24hrs();
        wish();
    }
    else
    {
        printf("\n\033[0;31mWRONG INPUT!! Please tell me the time in 12 hours format\033[0m\n");
    }
    
}

void input()
{
    printf("Hey! What time is it? Enter '1' for am, '2' for pm.\n");
    scanf("%d", &meridiem);

    printf("What hour of the day is it?\n");
    scanf("%d", &hours);

    printf("How many minutes past the hour?\n");
    scanf("%d", &mins);
}

int check()
{
    if( (hours >= 1 && hours <= 12) && (mins >= 0 && mins <=60) && (meridiem == 1 || meridiem == 2))
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void to24hrs()
{
    float mins_in_hrs = mins / 60;

    if (meridiem == 1)
    {
        if (hours == 12)
        {
            time = mins_in_hrs;
        }
        else
        {
            time = hours + mins_in_hrs;
        }
    }
    else
    {
        if (hours == 12)
        {
            time = hours + mins_in_hrs;
        }
        else
        {
            time = hours + 12 + mins_in_hrs;
        }    
    }
    }

void wish()
{
    if (time >= 5 && time < 12)
    {
        goodMorning();
    }
    else if (time >= 12 && time < 18)
    {
        goodAfternoon();
    }
    else if (time >= 18 && time < 21)
    {
        goodEvening();
    }
    else if ( (time >= 21 && time <= 24) || (time >= 0 && time < 3) )
    {
        goodNight();
    }
    else
    {
        midNight();
    }
}

void goodMorning()
{
    printf("\n\033[0;33mGood Morning!!\033[0m\n\n");
}

void goodAfternoon()
{
    printf("\n\033[0;31mGood Afternoon!!\033[0m\n\n");
}

void goodEvening()
{
    printf("\n\033[0;34mGood Evening!!\033[0m\n\n");
}

void goodNight()
{
    printf("\n\033[0;35mGood Night!!\033[0m\n\n");
}

void midNight()
{
    printf("\n\033[0;30mHappy midght!!\033[0m\n\n");
}