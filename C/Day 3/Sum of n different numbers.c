#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,n=0,s=0,a=0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	printf("Enter the numbers ");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&a);
		s=s+a;
	}
	printf("%d",s);
}
