#include<stdio.h>
#include<conio.h>
sum(int);
void main()
{
	int n=0,f=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	f=sum(n);
	printf("Sum = %d",f);
}
sum(int n)
{
	if(n==1)
		return 1;
	else
		return (n+sum(n-1));
}
