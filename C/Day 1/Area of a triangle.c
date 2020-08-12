#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int a=0,b=0,c=0;
	float s=0.0,ar=0.0;
	printf("Enter the length of all three sides of the triangle");
	scanf("%d %d %d",&a,&b,&c);
	s=(float)(a+b+c)/2;
	ar=sqrt(s*(s-a)*(s-b)*(s-c));
	printf("%f",ar);
}
