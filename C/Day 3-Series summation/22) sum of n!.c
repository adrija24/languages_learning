#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,s=0,f=1,n=0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			f=f*j;
		}
		s=s+f;
		f=1;
		if(i!=n)
			printf(" %d! +",i);
		else
			printf(" %d! = ",i);
	}
	printf("%d",s);
}
