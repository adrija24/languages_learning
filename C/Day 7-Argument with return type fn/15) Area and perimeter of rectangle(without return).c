#include<stdio.h>
#include<conio.h>
arm(int,int);
void main()
{
	int a=0,b=0;
	printf("Enter the length : ");
	scanf("%d",&a);
	printf("Enter the breadth : ");
	scanf("%d",&b);
	arm(a,b);
}
arm(int a,int b)
{
	int p=0,ar=0;
	p=2*(a+b);
	ar=a*b;
	printf("Perimeter of the rectangle : %d",p);
	printf("\nArea of the rectangle : %d",ar);
}
