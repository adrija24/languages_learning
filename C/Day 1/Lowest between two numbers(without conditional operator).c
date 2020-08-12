#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0;
	printf("Enter two numbers");
	scanf("%d %d",&a,&b);
	if (a>b)
	    printf("%d",b);
	else
	    printf("%d",a);
}
