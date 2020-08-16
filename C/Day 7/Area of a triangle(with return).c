#include<stdio.h>
#include<conio.h>
#include<math.h>
float area(int,int,int);
void main()
{
	int a=0,b=0,c=0;
	float ar=0.0;
	printf("Enter the length of arm 'a' : ");
	scanf("%d",&a);
	printf("Enter the length of arm 'b' : ");
	scanf("%d",&b);
	printf("Enter the length of arm 'c' : ");
	scanf("%d",&c);
	ar=area(a,b,c);
	printf("Area of the triangle : %f",ar);
}
float area(int a,int b,int c)
{
	float s=0.0,ar=0.0;
	s=(float)(a+b+c)/2;
	ar=sqrt(s*(s-a)*(s-b)*(s-c));
	return ar;
}
