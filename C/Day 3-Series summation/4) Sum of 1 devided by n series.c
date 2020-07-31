#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,n=0;
	float s=0.0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		s=s+(float)1/i;
		if(i==n)
			printf(" %d/%d = ",1,n);
		else
			printf(" %d/%d +",1,i);
	}
	printf("%f",s);
}
