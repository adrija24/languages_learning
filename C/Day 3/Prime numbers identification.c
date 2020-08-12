#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,flag=0;
	for(i=1;i<=50;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
				flag=1;
		}
		if(flag==0)
			printf(" %d",i);
		flag=0;
	}
}
