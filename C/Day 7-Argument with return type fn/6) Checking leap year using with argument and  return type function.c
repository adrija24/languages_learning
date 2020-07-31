#include<stdio.h>
#include<conio.h>
check(int);
void main()
{
	int y=0,x=0;
	printf("Enter the year : ");
	scanf("%d",&y);
	x=check(y);
	if (x==0)
		printf("It is a leap year");
	else
		printf("It is not a leap year");
}
check(int y1)
{
	if((y1%4==0)||(y1%100==0&&y1%400==0))
		return 0;
	else
		return 1;
}
