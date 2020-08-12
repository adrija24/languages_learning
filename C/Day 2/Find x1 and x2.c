#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0,d=0,m=0,n=0;
	float x1=0.0,x2=0.0;
	printf("Enter values of a,b,c,d,m and n respectively");
	scanf("%d %d %d %d %d %d",&a,&b,&c,&d,&m,&n);
	{
		if((a*d-c*b)==0)
			printf("Math error");
		else
			x1=(float)((m*d)-(b*n))/((a*d)-(c*d));
			x2=(float)((n*a)-(m*c))/((a*d)-(c*d));
			printf("%f %f",x1,x2);
	}
}
