#include<stdio.h>
void main()
{
	FILE *f1;
	int i=0,x=0,p=0,n=0,z=0;
	f1=fopen("NUMBER","w");
	for(i=1;i<=5;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&x);
		putw(x,f1);
	}
	fclose(f1);
	f1=fopen("NUMBER","r");
	while((x=getw(f1))!=EOF)
	{
		if(x>0)
			p=p+1;
		else
		{
			if(x<0)
				n=n+1;
			else
				z=z+1;
		}
	}
	fclose(f1);
	printf("\nNo of positive numbers : %d\nNo of negative numbers : %d\nNo of zeros : %d",p,n,z);
}
