#include<stdio.h>
#include<conio.h>
fact(int);
void main()
{
	int n=0,f=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	f=fact(n);
	printf("Factorial of the number = %d",f);
}
fact(int n1)
{
	int i=0,f=1;
	for(i=1;i<=n1;i++)
	{
		f=f*i;
	}
	return f;
}
