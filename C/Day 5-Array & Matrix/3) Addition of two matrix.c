#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0;
	int a[3][4],b[3][4],c[3][4];
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("Enter a number for 'a' matrix : ");
			scanf("%d",&a[i][j]);
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("Enter a number for 'b' matrix : ");
			scanf("%d",&b[i][j]);
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("\t%d",c[i][j]);
		}
	
	printf("\n");
	}
}
