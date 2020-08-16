#include<stdio.h>
#include<conio.h>
radius(int);
void main()
{
	int r=0;
	printf("Enter the radius : ");
	scanf("%d",&r);
	radius(r);
}
radius(int r)
{
	 float c=0.0,ar=0.0;
	c=(float)(2*22*r)/7;
	ar=(float)(22*r*r)/7;
	printf("Circumference of the circle : %f\nArea of the circle : %f",c,ar);
}
