#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,s=0;
	int a[3][3];
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{				
			printf("Enter a number : ");
			scanf("%d",&a[i][j]);
		}	
	}
	printf("\nThe matrix will be like - \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("\t%d",a[i][j]);
			if(i+j==2)
			{
				s=s+a[i][j];
			}
		}
		printf("\n");
	}
	printf("\nSum of the diagonal numbers : %d",s);
}  
