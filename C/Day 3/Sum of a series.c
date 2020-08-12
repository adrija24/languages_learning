#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,n=0,s=0;
	printf("Enter value of n ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		s=s+i;
		if(i==n)
			printf(" %d = ",n);
		else
			printf(" %d +",i);
	}
	printf("%d",s);
	
}
