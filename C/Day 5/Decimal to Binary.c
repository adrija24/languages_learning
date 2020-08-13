#include<stdio.h>
#include<conio.h>
#include<math.h>
void main()
{
	int a[10]={0,0,0,0,0,0,0,0,0,0};
	int n=0,m=0,s=0,i=0,j=0;
	printf("Enter a number : ");
	scanf("%d",&n);
	while(n!=0)
	{
		m=n%2;
		n=n/2;
		a[i]=m;
		i++;
	}
	for(j=0;j<=i;j++)
	{
		s=s+a[j]*pow(10,j);
	}
	printf("The binary number will be : %d",s);
}
