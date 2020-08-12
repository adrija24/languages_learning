#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0,max=0,min=0;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	max=a[0];
	min=a[0];
	for(i=0;i<10;i++)
	{
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	printf("Max number = %d  Min number = %d",max,min);
	
}
