#include<stdio.h>
#include<conio.h>
void main()
{
	int i=0,j=0,f=1,n=0;
	float s=0.0;
	printf("Enter the value of 'n' ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			f=f*j;
		}
		s=s+1/(float)f;
		f=1;
		if(i!=n)
			printf(" %d/%d! +",1,i);
		else
			printf(" %d/%d! = ",1,i);
	}
	printf("%f",s);
}
