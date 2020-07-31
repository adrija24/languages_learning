#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		printf("A");
		printf("\n");
	}
	for(i=1;i<=4;i++)
	{
		for(j=4;j>=i;j--)
		{
			printf(" ");
		}
		printf("A");
		printf("\n");
	}
}
