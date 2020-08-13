#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,max=0,min=0;
	int a[3][4];
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{				printf("Enter a number : ");
			scanf("%d",&a[i][j]);
		}	
	}
	printf("\nThe matrix will be like - \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("\t%d",a[i][j]);
		}
		printf("\n");
	}
	max=a[0][0];
	min=a[0][0];
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			if(a[i][j]>max)
				max=a[i][j];
			if(a[i][j]<min)
				min=a[i][j];
		}
	}
	printf("\nMax number : %d\nMin number : %d",max,min);
}  
