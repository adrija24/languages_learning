#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,s=0,n=0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		s=s+i*i;
		if(i==n)
			printf(" %d*%d = ",n,n);
		else
			printf(" %d*%d +",i,i);
	}
	printf("%d",s);
}
