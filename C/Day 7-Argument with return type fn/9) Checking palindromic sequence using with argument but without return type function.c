#include<stdio.h>
#include<conio.h>
palindrome(int);
void main()
{
	int n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	palindrome(n);
}
palindrome(int n1)
{
	int s=0,m=0,temp=0;
	temp=n1;
	while(n1!=0)
	{
		m=n1%10;
		n1=n1/10;
		s=s*10+m;
	}
	if(s==temp)
		printf("It is a palindromic number");
	else
		printf("It is not a palindromic number");
}
