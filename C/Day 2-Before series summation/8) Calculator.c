#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0,d=0,e=0,i=0;
	float f=0.0;
	printf("Enter two numbers");
	scanf("%d %d",&a,&b);
	printf("Enter choice");
	scanf("%d",&i);
	switch(i)
	{
		case 1:c=a+b;
			 printf("%d",c);
			 break;
		case 2:d=a-b;
			 printf("%d",d);
			 break;
		case 3:e=a*b;
			 printf("%d",e);
			 break;
		case 4:f=a/b;
			 printf("%f",f);
			 break;
		default:printf("Invalid choice");
			 break;
	}
}
