#include<stdio.h>
#include<conio.h>
#include<math.h>
float sum(int);
void main()
{
	int n=0;
	float s=0.0;
	printf("Enter the range : ");
	scanf("%d",&n);
	s=sum(n);
	printf("Sum of the series : %f",s);
}
float sum(int n)
{
	int i=0;
	float s=0.0;
	for(i=i;i<=n;i++)
	{
		s=s+(float)sqrt(i);
	}
	return s;
}
