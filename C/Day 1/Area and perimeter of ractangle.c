#include<stdio.h>
#include<conio.h>
void main()
{
	int l=0,b=0,a=0,p=0;
	printf("Enter length(l) and breadth(b) of the rectangle respectively : ");
	scanf("%d %d",&l,&b);
	a=l*b;
	p=2*(l+b);
	printf("Area = %d*%d = %d unit\nPerimeter = 2*(%d+%d) = %d unit",l,b,a,l,b,p);
	
}
