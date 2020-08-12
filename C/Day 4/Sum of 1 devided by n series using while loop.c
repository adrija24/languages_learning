#include<stdio.h>
#include<conio.h>
void main()
{
	int i=1,n=0;
	float s=0.0;
	printf("Enter the value of 'n' : ");
	scanf("%d",&n);
	while(i<=n)
	{
		s=s+(float)1/i;
		if(i==n)
			printf(" %d/%d = ",1,n);
		else
			printf(" %d/%d +",1,i);
		i++;
	}
	printf("%f",s);
}
