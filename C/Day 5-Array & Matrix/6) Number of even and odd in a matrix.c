#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,e=0,o=0;
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
			if(a[i][j]%2==0)
				e=e+1;
			else
				o=o+1;
		}
		printf("\n");
	}
	printf("\nTotal even numbers : %d\nTotal odd numbers : %d",e,o);
}  
