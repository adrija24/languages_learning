#include<stdio.h>
#include<conio.h>
void main()
{
	int i=1,e=0,o=0;
	printf("Range => 1 to 10 :");
	while(i<=10)
	{
		if(i%2==0)
			e=e+1;
		else
			o=o+1;
		i++;
	}
	printf("\n");
	printf("Total even numbers = %d   Total odd numbers = %d",e,o);
}
