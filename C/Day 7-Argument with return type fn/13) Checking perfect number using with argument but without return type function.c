#include<stdio.h>
#include<conio.h>
perfect(int);
void main()
{
	int n=0;
	printf("Enter the number : ");
	scanf("%d",&n);
	perfect(n);
}
perfect(int n1)
{
	int i=1,s=0,f=1;;
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
		printf("It is a perfect number");
	else
		printf("It is not a perfect number");
}
