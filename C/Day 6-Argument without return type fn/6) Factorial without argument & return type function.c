#include<stdio.h>
#include<conio.h>
fact();
void main()
{
	fact();
}
fact()
{
	int i=0,f=1,n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	for (i=1;i<=n;i++)
	{
		f=f*i;
	}
	printf("%d! = %d",n,f);
}
