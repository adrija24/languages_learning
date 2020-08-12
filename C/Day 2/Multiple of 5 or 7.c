#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0;
	for(i=1;i<=50;i++)
	{
		if(i%5==0||i%7==0)
			printf("\n%d",i);
	}
}
