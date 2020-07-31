#include<stdio.h>
#include<conio.h>
void main()
{
	int m=0,n=0,s=0,temp=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	temp=n;
	while(n!=0)
	{
		m=n%10;
		n=n/10;
		s=s*10+m;
	}
	if(temp==s)
		printf("It is an palindromic number");
		
	else
		printf("It is not an palindromic number");
}
