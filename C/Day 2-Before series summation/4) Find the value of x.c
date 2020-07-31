#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0;
	float x=0.0;
	printf("Enter the values of a, b and c");
	scanf("%d %d %d",&a,&b,&c);
	if(b==c)
	    printf("Math error");
	else
		x=(float)(a/(b-c));
		printf("%f",x);
}
