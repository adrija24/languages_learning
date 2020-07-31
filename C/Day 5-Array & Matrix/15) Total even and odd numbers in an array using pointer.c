#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0,even=0,odd=0,*ptr;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	for(i=0;i<10;i++)
	{
		ptr=&a[i];
		if(*ptr%2==0)
			even=even+1;
		else
			odd=odd+1;
	}
	printf("\nTotal even numbers : %d\nTotal odd numbers : %d",even,odd);
}
