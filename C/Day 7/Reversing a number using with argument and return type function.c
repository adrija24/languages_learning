#include<stdio.h>
#include<conio.h>
reverse(int);
void main()
{
	int n=0,s=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	s=reverse(n);
	printf("%d",s);
}
reverse(int n1)
{
	int s1=0,m=0;
	while(n1!=0)
	{
		m=n1%10;
		n1=n1/10;
		s1=s1*10+m;
	}
	return s1;
}
