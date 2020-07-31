#include<stdio.h>
#include<conio.h>
void main()
{
	int m=0,p=0,c=0,t=0,mp=0;
	printf("Enter marks in Math, Phys and Chem respectively : ");
	scanf("%d %d %d",&m,&p,&c);
	t=m+p+c;
	mp=m+p;
	if((t>=200||mp>=150)&&(m>=60&&p>=50&&c>=40))
		printf("Selected");
	else
		printf("Not selected");
}
