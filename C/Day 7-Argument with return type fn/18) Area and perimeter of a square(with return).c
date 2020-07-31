#include<stdio.h>
#include<conio.h>
perimeter(int);
area(int);
void main()
{
	int a=0,p=0,ar=0;
	printf("Enter the arm length of the square : ");
	scanf("%d",&a);
	p=perimeter(a);
	printf("Perimeter of the square : %d",p);
	ar=area(a);
	printf("\nArea of the square : %d",ar);
}
perimeter(int a)
{
	int p=0;
	p=4*a;
	return p;
	
}
area(int a)
{
	int ar=0;
	ar=a*a;
	return ar;	
}
