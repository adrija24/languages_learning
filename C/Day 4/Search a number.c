#include<stdio.h>
#include<conio.h>
void main()
{
	int a[5];
	int i=0,flag=0,n=0;
	for(i=0;i<5;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	printf("Enter the number of searching : ");
	scanf("%d",&n);
	for(i=0;i<5;i++)
	{
		if(a[i]==n)
			flag=1;
	}
	printf("\n");
	if(flag==0)
		printf("Number not found");
	else
		printf("Number found");
}
