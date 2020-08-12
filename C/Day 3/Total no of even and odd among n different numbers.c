#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,n=0,a=0,e=0,o=0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	printf("Enter the numbers ");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&a);
		if(a%2==0)
			e=e+1;
		else
			o=o+1;
	}
	printf("No of even=%d No of odd=%d",e,o);
}
