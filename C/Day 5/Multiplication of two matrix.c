#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,k=0;
	int a[3][4],b[4][3],c[3][3];
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("Enter a number for 'a' matrix : ");
			scanf("%d",&a[i][j]);
		}
	}
	printf("\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("\t%d",a[i][j]);
		}
		printf("\n");
	}
	printf("\n");
	for(i=0;i<4;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("Enter a number for 'b' matrix : ");
			scanf("%d",&b[i][j]);
		}
	}
	for(i=0;i<4;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\t%d",a[i][j]);
		}
		printf("\n");
	}
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			c[i][j]=0;
			for(k=0;k<4;k++)
			{
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
			}
		}
	}
	printf("\nThe new matrix will be - \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\t%d",c[i][j]);
		}
		printf("\n");
	}
}
