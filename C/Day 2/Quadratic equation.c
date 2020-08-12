#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int a=0,b=0,c=0,d=0;
	float x1=0.0,x2=0.0;
	printf("Entervalues of a, b and c");
	scanf("%d %d %d",&a,&b,&c);
	d=b*b-4*a*c;
	if(d<0)
	    printf("Math error");
	else
	{
		x1=(float)(-b+sqrt(d))/(2*a);
		x2=(float)(-b-sqrt(d))/(2*a);
		printf("%f %f",x1,x2);
	}
}
