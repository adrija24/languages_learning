#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0;
	printf("Enter two numbers");
	scanf("%d %d",&a,&b);
	c=(a>b)?a:b;
	printf("%d",c);
}
