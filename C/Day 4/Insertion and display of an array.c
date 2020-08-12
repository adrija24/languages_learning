#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
		printf("The arrangement will be like - ");
		for(i=0;i<10;i++)
	{
		printf("\n%d",a[i]);
	}
}
