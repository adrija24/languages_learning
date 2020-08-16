#include<stdio.h>
void main()
{
	FILE *f1,*f2,*f3;
	int i=0,n=0;
	f1=fopen("EVEN_ODD","w");
	for(i=1;i<=5;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&n);
		putw(n,f1);
	}
	fclose(f1);
	f1=fopen("EVEN_ODD","r");
	f2=fopen("EVEN","w");
	f3=fopen("ODD","w");
	while((n=getw(f1))!=EOF)
	{
		if(n%2==0)
			putw(n,f2);
		else
			putw(n,f3);
	}
	fclose(f1);
	fclose(f2);
	fclose(f3);
	f2=fopen("EVEN","r");
	f3=fopen("ODD","r");
	printf("Even numbers : ");
	while((n=getw(f2))!=EOF)
	{
		printf("\t%d",n);
	}
	printf("\n");
	printf("Odd numbers : ");
	while((n=getw(f3))!=EOF)
	{
		printf("\t%d",n);
	}
	fclose(f2);
	fclose(f3);
}
