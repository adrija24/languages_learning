#include<stdio.h>
#include<conio.h>
void main()
{
	int u=0;
	float a=0.0;
	printf("Enter number of units");
	scanf("%d",&u);
	if(u<100)
	    a=150;
	else
	{
		if(u<150)
		    a=150+(u-100)*1;
		else
		{
			if(u<200)
			    a=150+(u-100)*1.5;
			else
			    a=150+(u-100)*2;
		}
	}
	printf("%f",a);
}
