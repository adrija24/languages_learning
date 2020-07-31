#include<stdio.h>
#include<conio.h>
swap(int*,int*);
void main()
{
	int a=10,b=20;
	printf("\na=%d  b=%d",a,b);
	swap(&a,&b);
	printf("\nAfter swapping : a=%d  b=%d",a,b);
}
swap(int *a,int *b)
{
	int c=0;
	c=*a;
	*a=*b;
	*b=c;
	return 0;
}
