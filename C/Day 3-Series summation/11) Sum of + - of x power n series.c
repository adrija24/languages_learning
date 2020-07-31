#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=0,x=0,n=0,s=0;
	printf("Enter the value of 'n' and 'x' respectively ");
	scanf("%d %d",&n,&x);
	for(i=1;i<=n;i++)
	{
		s=s+pow(-1,i+1)*pow(x,i);
		if(i!=n)
		{
			if(i%2==0)
				printf(" %d(pow)%d +",x,i);
			else
				printf(" %d(pow)%d -",x,i);
		}
		else
			printf(" %d(pow)%d = ",x,i);
	}
	printf("%d",s);
}
