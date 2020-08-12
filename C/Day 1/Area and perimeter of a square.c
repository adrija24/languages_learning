#include<stdio.h>
#include<conio.h>
void main()
{
	int l=0,a=0,p=0;
	printf("Enter the length(l) of the square : ");
	scanf("%d",&l);
	a=l*l;
	p=4*l;
	printf("Area = %d*%d = %d unit\nPerimeter = %d*%d = %d unit",l,l,a,4,l,p);
}
