#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0;
	int a[3][4],b[4][3];
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
			b[i][j]=a[j][i];
		}
	}
	
	printf("\nThe new transposed matrix will be - \n");
	for(i=0;i<4;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\t%d",b[i][j]);
		}
		printf("\n");
	}
}
