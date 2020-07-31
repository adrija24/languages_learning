#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0;
	printf("Enter two numbers : ");
	scanf("%d %d",&a,&b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("Swapping of the numbers : %d %d",a,b);
}
