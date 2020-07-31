#include<stdio.h>
#include<conio.h>
#include<math.h>
sum(int,int);
void main()
{
	int n=0,x=0;
	printf("Enter the range : ");
	scanf("%d",&n);
	printf("Enter the value of x : ");
	scanf("%d",&x);
	sum(n,x);
}
sum(int n,int x)
{
	int i=0;
	float s=0.0;
	for(i=1;i<=n;i++)
	{
		s=s+(float)1/pow(x,i);
	}
	printf("Sum of the series : %f",s);
}
