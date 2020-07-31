#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0,max=0,min=0,*ptr;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	max=a[0];
	min=a[0];
	for(i=0;i<10;i++)
	{
		ptr=&a[i];
		if(max<*ptr)
			max=*ptr;
		if(min>*ptr)
			min=*ptr;
	}
	printf("\nMaximum number : %d\nMinimum number : %d",max,min);
}
