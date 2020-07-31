#include<stdio.h>
#include<conio.h>
void main()
{
	int C=0;
	float F=0.0;
	printf("Enter the temperature in calcius : ");
	scanf("%d",&C);
	F=(float)(9*C+160)/5;
	printf("%d degree celcius = %f degree fahrenheit",C,F);
}
