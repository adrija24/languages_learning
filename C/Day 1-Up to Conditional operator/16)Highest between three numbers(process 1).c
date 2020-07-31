#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0;
	printf("Enter three numbers");
	scanf("%d %d %d",&a,&b,&c);
	if(a>b)
	{
		if (a>c)
		printf("%d",a);
		else
		printf("%d",c);
	}
	else
	{
		if (b>c)
		printf("%d",b);
		else
		printf("%d",c);
	}
}
