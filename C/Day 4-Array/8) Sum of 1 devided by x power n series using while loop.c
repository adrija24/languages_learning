#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=1,n=0,x=0;
	float s=0.0;
	printf("Enter the value of 'n' and 'x' respectively : ");
	scanf("%d %d",&n,&x);
	while(i<=n)
	{
		s=s+(float)1/pow(x,i);
		if(i==n)
			printf(" %d/%d(pow)%d = ",1,x,n);
		else
			printf(" %d/%d(pow)%d +",1,x,i);
		i++;
	}
	printf("%f",s);
}
