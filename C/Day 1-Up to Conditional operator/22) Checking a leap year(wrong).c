#include<stdio.h>
#include<conio.h>
void main()
{
	int y=0;
	printf("Enter the year : ");
	scanf("%d",&y);
	if ((y%4==0)||(y%100==0&&y%400==0))
		printf("It is a leap year");
	else
		printf("It is not a leap year");
	
}
