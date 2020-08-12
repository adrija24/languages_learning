#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,n=0,flag=0;
	printf("Enter the number ");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
			flag=1;
	}
	if(flag==0)
		printf("%d = It is a prime number",n);
	else
		printf("%d = It is not a prime number",n);
}
