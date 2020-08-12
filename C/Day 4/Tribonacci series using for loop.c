#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0,d=0,i=0,n=0;
	printf("Enter the first three numbers of the series : ");
	scanf("%d %d %d",&a,&b,&c);
	printf("Enter the range : ");
	scanf("%d",&n);
	printf("The Tribonacci series will be - \n");
	printf("%d %d %d",a,b,c);
	for(i=4;i<=n;i++)
	{
		d=a+b+c;
		printf(" %d",d);
		a=b;
		b=c;
		c=d;
	}
}
