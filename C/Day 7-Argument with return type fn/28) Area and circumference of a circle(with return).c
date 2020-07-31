#include<stdio.h>
#include<conio.h>
float circumference(int);
float area(int);
void main()
{
	int r=0;
	float ar=0.0,c=0.0;
	printf("Enter the radius : ");
	scanf("%d",&r);
	c=circumference(r);
	printf("Circumference of the circle : %f",c);
	ar=area(r);
	printf("\nArea of the circle : %f",ar);
}
float circumference(int r)
{
	float c=0.0;
	c=(float)(2*22*r)/7;
	return c;
}
float area(int r)
{
	float ar=0.0;
	ar=(float)(22*r*r)/7;
	return ar;
}
