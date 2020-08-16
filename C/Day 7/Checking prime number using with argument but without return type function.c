#include<stdio.h>
#include<conio.h>
check(int);
void main()
{
	int n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	check(n);
}
check(int n1)
{
	int i=0,flag=0;
	for(i=2;i<n1;i++)
	{
		if(n1%i==0)
			flag=1;
	}
	if(flag==0)
		printf("It is a prime number");
	else
		printf("It is not a prime number");
}
