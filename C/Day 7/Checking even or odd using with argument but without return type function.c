#include<stdio.h>
#include<conio.h>
check(int);
void main()
{
	int n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	check(n);
}
check(int n1)
{
	if(n1%2==0)
		printf("It is an even number");
	else
		printf("It is an odd number");
}
