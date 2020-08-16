#include<stdio.h>
#include<conio.h>
#include<math.h>
area(float,int,int,int);
void main()
{
	int a=0,b=0,c=0;
	float s=0.0;
	printf("Enter the length of arm 'a' : ");
	scanf("%d",&a);
	printf("Enter the length of arm 'b' : ");
	scanf("%d",&b);
	printf("Enter the length of arm 'c' : ");
	scanf("%d",&c);
	area(s,a,b,c);
}
area(float s,int a,int b,int c)
{
	float area=0.0;
	s=(float)(a+b+c)/2;
	area=sqrt(s*(s-a)*(s-b)*(s-c));
	printf("Area of the triangle : %f",area);
}
