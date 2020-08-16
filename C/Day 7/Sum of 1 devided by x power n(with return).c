#include<stdio.h>
#include<conio.h>
#include<math.h>
float sum(int,int);
void main()
{
	int n=0,x=0;
	float s=0.0;
	printf("Enter the range : ");
	scanf("%d",&n);
	printf("Enter the value of 'x' : ");
	scanf("%d",&x);
	s=sum(n,x);
	printf("Sum of the series : %f",s);
}
float sum(int n,int x)
{
	int i=0;
	float s=0.0;
	for(i=i;i<=n;i++)
	{
		s=s+(float)sqrt(i);
	}
	return s;
}
