#include<stdio.h>
void main()
{
	FILE *f1;
	int i=0,n=0;
	f1=fopen("NUMBER","w");
	for(i=1;i<=5;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&n);
		putw(n,f1);
	}
	fclose(f1);
	f1=fopen("NUMBER","r");
	while((n=getw(f1))!=EOF)
	{
		printf("\n%d",n);
	}
	fclose(f1);
}
