#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,n=0,a=0,p=0,q=0,r=0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	printf("Enter the numbers ");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&a);
		if(a>0)
			p=p+1;
		else
			{
				if(a<0)
					q=q+1;
				else
					r=r+1;
			}
	}
	printf("No of +Ve number=%d  No of -Ve number=%d  No of zero=%d",p,q,r);
}
