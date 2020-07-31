#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,m=0,n=0,o=0;
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
			if(a[i][j]>0)
				m=m+1;
			else
				if(a[i][j]<0)
					n=n+1;
				else
					o=o+1;
		}
		printf("\n");
	}
	printf("\nTotal positive numbers : %d\nTotal negative numbers : %d\nTotal zero : %d",m,n,o);
}  
