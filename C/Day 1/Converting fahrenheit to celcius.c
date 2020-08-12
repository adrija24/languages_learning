#include<stdio.h>
#include<conio.h>
void main()
{
	int F=0;
	float C=0.0;
	printf("Enter the temperature in fahrenheit : ");
	scanf("%d",&F);
	C=(float)(5*F-160)/9;
	printf("%d degree in fahrenheit = %f degree in celcius",F,C);
}
