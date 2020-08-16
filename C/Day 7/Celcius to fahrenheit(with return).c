#include<stdio.h>
#include<conio.h>
fahrenheit(int);
void main()
{
	int c=0;
	float f=0.0;
	printf("Enter the temperature in degree celcius : ");
	scanf("%d",&c);
	f=fahrenheit(c);
	printf("Temperature in degree fahrenheit : %f",f);
}
fahrenheit(int c)
{
	float f=0.0;
	f=(float)(9*c+160)/5;
	return f;
}
