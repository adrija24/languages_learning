#include<stdio.h>
#include<conio.h>
void main()
{
	int m=0,n=0,s=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	while(n!=0)
	{
		m=n%10;
		n=n/10;
		s=s+m;
	}
	printf("Sum of the digits = %d",s);
}
