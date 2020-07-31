#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=0,n=0,x=0,s=1;
	printf("Enter the value of 'n' and 'x' respectively ");
	scanf("%d %d",&n,&x);
	for(i=1;i<=n;i++)
	{
		s=s+pow(x,i);
		if(i==n)
			printf(" %d(power)%d = ",x,n);
		if(i==1)
			printf(" 1 + %d(power)%d +",x,i);
		else
			printf(" %d(power)%d +",x,i);
	}
	printf("%d",s);
}
