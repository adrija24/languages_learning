#include<stdio.h>
#include<conio.h>
void main()
{
	int i=1;
	printf("Multiples of 5 between 1 to 50 :");
	while(i<=50)
	{
		if(i%5==0)
		printf("\n%d",i);
		i++;
	}
}
