#include<stdio.h>
#include<conio.h>
void main()
{
	int x=0,y=0;
	printf("Enter value of x");
	scanf("%d",&x);
	if(x>0)
		y=1;
	else if(x==0)
		y=0;
	else
		y=-1;
	printf("%d",y);
}
