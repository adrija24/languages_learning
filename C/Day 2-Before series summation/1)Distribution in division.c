#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0;
	float av=0.0;
	printf("Enter Marks");
	scanf("%d %d %d",&a,&b,&c);
	av=(float)(a+b+c)/3;
	if(av>=60.0)
	    printf("1st division");
	else
	{
		if(av=50.0)
		    printf("2nd division");
		else
		{
			if(av>=40.0)
			    printf("3rd division");
			else
			    printf("Failed");
		}
	}
}
