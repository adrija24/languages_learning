#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int i=1,n=0;
	float s=0.0;
	printf("Enter the value of 'n' : ");
	scanf("%d",&n);
	while(i<=n)
	{
		s=s+(float)sqrt(i);
		if(i==n)
			printf(" (sqrt)%d = ",n);
		else
			printf(" (sqrt)%d +",i);
		i++;
	}
	printf("%f",s);
}
