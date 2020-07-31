#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10];
	int i=0,p=0,n=0,z=0,*ptr;
	for(i=0;i<10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&a[i]);
	}
	for(i=0;i<10;i++)
	{
		ptr=&a[i];
		if(*ptr>0)
			p=p+1;
		else
		{
			if(*ptr<0)
				n=n+1;
			else
				z=z+1;
		}
	}
	printf("\nTotal positive numbers : %d\nTotal negative numbers : %d\nTotal zero : %d",p,n,z);
}
