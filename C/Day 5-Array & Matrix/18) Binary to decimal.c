#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int a[10]={0,0,0,0,0,0,0,0,0,0};
	int n=0,m=0,s=0,i=0,j=0;
	printf("Enter the binary number : ");
	scanf("%d",&n);
	while(n!=0)
	{
		m=n%10;
		n=n/10;
		a[i]=m;
		i++;
	}
	for(j=0;j<=i;j++)
	{
		s=s+a[j]*pow(2,j);
	}
	printf("The decimal number will be : %d",s);
}
