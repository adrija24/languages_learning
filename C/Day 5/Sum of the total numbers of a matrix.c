#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,s=0;
	float av=0.0;
	int a[3][4];
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{			
			printf("Enter a number : ");
			scanf("%d",&a[i][j]);
		}	
	}
	printf("\nThe matrix will be like - \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("\t%d",a[i][j]);
			s=s+a[i][j];
			av=(float)s/12;
		}
		printf("\n");
	}
	printf("\nSum of the numbers : %d\nAverage of the total numbers : %f",s,av);
}  
