#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0,p=0,n=0,z=0;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	for(i=0;i<10;i++)
	{
		if(a[i]>0)
			p=p+1;
		else
		{
			if(a[i]<0)
				n=n+1;
			else
				z=z+1;
		}
	}
	printf("Positive numbers = %d  Negative numbers = %d  No of zero = %d",p,n,z);
}
