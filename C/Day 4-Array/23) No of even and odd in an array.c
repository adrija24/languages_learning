#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0,e=0,o=0;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	for(i=0;i<10;i++)
	{
		if(a[i]%2==0)
			e=e+1;
		else
			o=o+1;
	}
	printf("Even numbers = %d  Odd numbers = %d",e,o);
}
