#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5];
	int i=0,j=0,temp=0;
	for(i=0;i<5;i++)
	{
		printf("Enter a number");
		scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
	}
	for(i=0;i<5;i++)
	printf("\n%d",a[i]);
}
