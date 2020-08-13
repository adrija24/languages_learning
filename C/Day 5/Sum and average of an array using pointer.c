#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5];
	int i=0,s=0,*ptr;
	float av=0.0;
	for(i=0;i<5;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++)
	{
		ptr=&a[i];
		s=s+*ptr;
	}
	av=(float)s/5;
	printf("\nSum of the numbers : %d\nAverage of the numbers : %f",s,av);
}
