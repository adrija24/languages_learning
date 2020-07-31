#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0,i=0,n=0;
	printf("Enter the first two numbers of the series : ");
	scanf("%d %d",&a,&b);
	printf("Enter the range : ");
	scanf("%d",&n);
	printf("The Fibonacci series will be - \n");
	printf("%d %d",a,b);
	for(i=3;i<=n;i++)
	{
		c=a+b;
		printf(" %d",c);
		a=b;
		b=c;
	}
}
