#include<stdio.h>
#include<conio.h>
void main()
{
	int x=0,y=0;
	printf("Enter value of x");
	scanf("%d",&x);
	y=(x>0)?1:((x==0)?0:-1);
	printf("%d",y);
}
