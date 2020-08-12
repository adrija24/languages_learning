#include<stdio.h>
#include<conio.h>
void main()
{
	int b=0;
	float d=0.0,h=0.0,m=0.0,p=0.0,t=0.0;
	printf("Enter the amount of basic salary");
	scanf("%d",&b);
	d=(float)b*0.20;
	h=(float)b*0.30;
	m=(float)b*0.15;
	p=(float)b*0.40;
	t=b+d+h+m-p;
	printf("%f",t);
}
