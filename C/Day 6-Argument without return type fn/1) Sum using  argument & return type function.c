#include<stdio.h>
#include<conio.h>
sum(int,int);
void main()
{
	int a=0,b=0,c=0;
	printf("Enter two numbers : ");
	scanf("%d %d",&a,&b);
	c=sum(a,b);
	printf("Sum = %d",c);
}
sum(int a1,int b1)
{
	int c1=0;
	c1=a1+b1;
	return c1;
}
