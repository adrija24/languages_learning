#include<stdio.h>
#include<conio.h>
cecius(int);
void main()
{
	int f=0;
	float c=0.0;
	printf("Enter the temperature in degree celcius : ");
	scanf("%d",&f);
	c=cecius(f);
	printf("Temperature in degree fahrenheit : %f",c);
}
cecius(int f)
{
	float c=0.0;
	c=(float)(5*f-160)/9;
	return c;
}
