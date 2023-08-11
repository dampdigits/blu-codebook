#include <stdio.h>
 int main(void)
 {
    //Declare integers
    float celcius, fahrenheit;

    // Prompt user to enter and input integers
    printf("\nTemperature: ");
    scanf("%f", &celcius);

    // Convert to fahrenheit
    fahrenheit = (1.8 * celcius) + 32;

    // Display temperature in fahrenheit
    printf("\n%.2f °C = %.2f °F\n", celcius, fahrenheit);

    return 0;
 }
