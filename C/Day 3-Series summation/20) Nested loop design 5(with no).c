#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,k=1;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d",k);
			k++;
		}
		printf("\n");
	}
}
