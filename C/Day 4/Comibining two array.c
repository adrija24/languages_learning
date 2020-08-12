#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10],b[10],c[20];
	int i=0,j=0;
	for(i=0;i<5;i++)
	{
		printf("Enter a number for array 'a' : ");
		scanf("%d",&a[i]);
	}
	printf("\n");
	for(i=0;i<5;i++)
	{
		printf("Enter a number for array 'b' = ");
		scanf("%d",&b[i]);
	}
	for(i=0;i<5;i++)
	{
		c[i]=a[i];
	}
	for(j=0;j<5;j++)
	{
		c[i+j]=b[j];
	}
	for(i=0;i<10;i++)
	{
		printf("\n%d",c[i]);
	}
}
