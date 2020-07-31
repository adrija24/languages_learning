#include<stdio.h>
#include<conio.h>
perimeter(int,int);
area(int,int);
void main()
{
	int a=0,b=0,p=0,ar=0;
	printf("Enter the length : ");
	scanf("%d",&a);
	printf("Enter the breadth : ");
	scanf("%d",&b);
	p=perimeter(a,b);
	printf("Perimeter of the rectangle : %d",p);
	ar=area(a,b);
	printf("\nArea of the rectangle : %d",ar);
}
perimeter(int a,int b)
{
	int p=0;
	p=2*(a+b);
	return p;
	
}
area(int a,int b)
{
	int ar=0;
	ar=a*b;
	return ar;	
}
