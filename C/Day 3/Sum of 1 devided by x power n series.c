#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=0,n=0,x=0;
	float s=0.0;
	printf("Enter the value of 'n' and 'x' respectively ");
	scanf("%d %d",&n,&x);
	for(i=1;i<=n;i++)
	{
		s=s+(float)1/pow(x,i);
		if(i==n)
			printf(" %d/(power)%d = ",1,n);
		else
			printf(" %d/(power)%d +",1,i);
	}
	printf("%f",s);
}
