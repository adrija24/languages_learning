#include<stdio.h>
#include<conio.h>
total(int,float,float,float,float);
void main()
{
	int basic=0;
	float da=0.0,hra=0.0,med=0.0,pf=0.0;
	printf("Enter the basic salary : ");
	scanf("%d",&basic);
	total(basic,da,hra,med,pf);
}
total(int basic,float da,float hra,float med,float pf)
{
	float total=0.0;
	da=(float)basic*0.20;
	hra=(float)basic*0.30;
	med=(float)basic*0.15;
	pf=(float)basic*0.40;
	total=basic+da+hra+med-pf;
	printf("Total salary : %f",total);
}
