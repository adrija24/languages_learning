#include<stdio.h>
#include<conio.h>
armstrong(int);
void main()
{
	int n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	armstrong(n);
}
armstrong(int n1)
{
	int s=0,m=0,temp=0;
	temp=n1;
	while(n1!=0)
	{
		m=n1%10;
		n1=n1/10;
		s=s+m*m*m;
	}
	if(s==temp)
		printf("It is an Armstrong number");
	else
		printf("It is not an Armstrong number");
}
