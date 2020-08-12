#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=0,n=0,s=0;
	printf("Enter the value of 'n'= ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		s=s+pow(-1,i+1)*i;
		if(i==n)
			printf(" %d = ",n);
		else
			{
				if(i%2==0)
					printf(" %d +",i);
				else
					printf(" %d -",i);
			}
	}
	printf("%d",s);
}
