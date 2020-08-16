#include<stdio.h>
#include<conio.h>
fact(int);
void main()
{
	int n=0,f=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	f=fact(n);
	printf("%d! = %d",n,f);
}
fact(int n)
{
	if(n==0)
		return 1;
	else
		return (n*fact(n-1));
}
