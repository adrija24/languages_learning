#include<stdio.h>
#include<conio.h>
void main()
{
	int r=0;
	float a=0.0,c=0.0;
	printf("Enter the radius of the circle");
	scanf("%d",&r);
	a=(float)(22*r*r)/7;
	c=(float)(2*22*r)/7;
	printf("%f %f",a,c);
}
