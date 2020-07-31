#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=1,s=0,n=0,x=0;
	printf("Enter the value of 'n' and 'x' respectively : ");
	scanf("%d %d",&n,&x);
	while(i<=n)
	{
		s=s+pow(x,i);
		if(i==n)
			printf(" %d(pow)%d = ",x,n);
		else
			printf(" %d(pow)%d +",x,i);
		i++;
	}
	printf("%d",s);
}
