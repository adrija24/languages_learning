#include<stdio.h>
#include<conio.h>
sum(int);
void main()
{
	int n=0;
	printf("Enter the range : ");
	scanf("%d",&n);
	sum(n);
}
sum(int n)
{
	int i=0,s=0;
	for(i=0;i<=n;i++)
	{
		s=s+i*i;
	}
	printf("Sum of the series : %d",s);
}
