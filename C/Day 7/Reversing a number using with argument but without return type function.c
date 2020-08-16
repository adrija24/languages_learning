#include<stdio.h>
#include<conio.h>
reverse(int);
void main()
{
	int n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	reverse(n);
}
reverse(int n1)
{
	int s=0,m=0;
	while(n1!=0)
	{
		m=n1%10;
		n1=n1/10;
		s=s*10+m;
	}
	printf("Reverse of the number is : %d",s);
}
