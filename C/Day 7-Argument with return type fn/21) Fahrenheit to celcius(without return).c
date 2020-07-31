#include<stdio.h>
#include<conio.h>
cecius(int);
void main()
{
	int f=0;
	float c=0.0;
	printf("Enter the temperature in degree fahrenheit : ");
	scanf("%d",&f);
	celcius(f);
}
celcius(int f)
{
	float c=0.0;
	c=(float)(5*f-160)/9;
	printf("Temerature in degree celcius : %f",c);
}
