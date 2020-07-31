#include<stdio.h>
#include<conio.h>
void main()
{
	int i=1,s=0,n=0;
	printf("Enter the value of 'n' : ");
	scanf("%d",&n);
	while(i<=n)
	{
		s=s+i;
		if(i==n)
			printf(" %d = ",n);
		else
			printf(" %d +",i);
		i++;
	}
	printf("%d",s);
}
