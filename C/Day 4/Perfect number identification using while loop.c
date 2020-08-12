#include<stdio.h>
#include<conio.h>
void main()
{
	int n=0,s=0,f=1,i=1;
	printf("Enter the number : ");
	scanf("%d",&n);
	while(i<n)
	{
		if(n%i==0)
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
