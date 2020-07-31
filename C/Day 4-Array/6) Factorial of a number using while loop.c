#include<stdio.h>
#include<conio.h>
void main()
{
	int i=1,f=1,n=0;
	printf("Enter the value of 'n' : ");
	scanf("%d",&n);
	while(i<=n)
	{
		f=f*i;
		i++;
	}
	printf("%d! = %d",n,f);
}
