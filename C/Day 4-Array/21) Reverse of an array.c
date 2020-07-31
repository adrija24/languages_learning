#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0;
	for(i=1;i<=10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
		printf("The reverse arrangement will be like - ");
		for(i=10;i>0;i--)
	{
		printf("\n%d",a[i]);
	}
}
