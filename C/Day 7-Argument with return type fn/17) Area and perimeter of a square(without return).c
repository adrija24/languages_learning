#include<stdio.h>
#include<conio.h>
arm(int);
void main()
{
	int a=0;
	printf("Enter the arm length of the square : ");
	scanf("%d",&a);
	arm(a);
}
arm(int a)
{
	int p=0,ar=0;
	p=4*a;
	ar=a*a;
	printf("Perimeter of the square : %d",p);
	printf("\nArea of the square : %d",ar);
}
