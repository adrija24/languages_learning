#include<stdio.h>
#include<conio.h>
perfect(int);
void main()
{
	int n=0,x=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	x=perfect(n);
	if(x==0)
		printf("It is a perfect number");
	else
		printf("It is not a perfect number");
}
perfect(int n1)
{
	int s=0,i=1,f=1,flag=0;
	while(i<n1)
	{
		if(n1%i==0)
		{
			s=s+i;
			f=f*i;
		}
		i++;
	}
	if(s==f)
		flag=0;
	else
		flag=1;
	if(flag==0)
		return 0;
	else
		return 1;
}
