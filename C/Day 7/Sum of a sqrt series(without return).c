#include<stdio.h>
#include<conio.h>
#include<math.h>
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
	int i=0;
	float s=0.0;
	for(i=0;i<=n;i++)
	{
		s=s+sqrt(i);
	}
	printf("Sum of the series : %f",s);
}
