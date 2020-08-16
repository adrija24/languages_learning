#include<stdio.h>
#include<conio.h>
check(int);
void main()
{
	int n=0,x=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	x=check(n);
	if (x==0)
		printf("It is an even number");
	else
		printf("It is a odd number");
}
check(int n1)
{
	if(n1%2==0)
		return 0;
	else
		return 1;
}
