#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0;
	int a[3][4];
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("Enter a number : ");
			scanf("%d",&a[i][j]);
		}
	}
	printf("The matrix form will be like - ");
	for(i=0;i<3;i++)
	{
		printf("\n");
		for(j=0;j<4;j++)
		{
			printf("\t%d",a[i][j]);
		}
		printf("\n");
	}
}
