#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5];
	int i=0,s=0;
	float av=0.0;
	for(i=0;i<5;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++)
	{
		s=s+a[i];
	}
		av=(float)s/5;
		printf("Sum of the array = %d",s);
	 	printf("\nAverage of the array = %f",av);
}
