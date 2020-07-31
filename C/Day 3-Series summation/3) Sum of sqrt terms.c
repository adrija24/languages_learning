#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=0,n=0;
	float s=0.0;
	printf("Enter the value of n ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		s=s+(float)sqrt(i);
		if(i==n)
			printf(" sqrt(%d) = ",n);
		else
			printf(" sqrt(%d) +",i);
	}
	printf("%f",s);
}
