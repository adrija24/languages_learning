#include<stdio.h>
#include<conio.h>
#include<math.h>
sum(int);
void main()
{
	int n=0,i=0,s=0;
	printf("Enter the range : ");
	scanf("%d",&n);
	s=sum(n);
	printf("Sum of the series : %d",s);
}
sum(int n)
{
	int i=0,s=0;
	for(i=0;i<=n;i++)
	{
		s=s+i*i;
	}
	return s;
}
