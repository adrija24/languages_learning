#include<stdio.h>
#include<conio.h>
check(int);
void main()
{
	int y=0;
	printf("Enter the year : ");
	scanf("%d",&y);
	check(y);
}
check(int y1)
{
	if(y1%4==0||y1%100==0&&y1%400==0)
		printf("It is a leap year");
	else
		printf("It is not a leap year");
}
