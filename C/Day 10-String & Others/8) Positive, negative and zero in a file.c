#include<stdio.h>
void main()
{
	FILE *f1,*f2,*f3,*f4;
	int i=0,n=0;
	f1=fopen("DATA","w");
	for(i=1;i<=10;i++)
	{
		printf("Enter a number : ");
		scanf("%d",&n);
		putw(n,f1);
	}
	fclose(f1);
	f1=fopen("DATA","r");
	f2=fopen("POSITIVE","w");
	f3=fopen("NEGATIVE","w");
	f4=fopen("ZERO","w");
	while((n=getw(f1))!=EOF)
	{
		if(n>0)
			putw(n,f2);
		else
		{
			if(n<0)
				putw(n,f3);
			else
				putw(n,f4);
		}
	}
	fclose(f1);
	fclose(f2);
	fclose(f3);
	fclose(f4);
	f2=fopen("POSITIVE","r");
	f3=fopen("NEGATIVE","r");
	f4=fopen("ZERO","r");
	printf("Positive numbers : ");
	while((n=getw(f2))!=EOF)
	{
		printf("\t%d",n);
	}
	printf("\n");
	printf("Negative numbers : ");
	while((n=getw(f3))!=EOF)
	{
		printf("\t%d",n);
	}
	printf("\n");
	printf("Zeros : ");
	while((n=getw(f4))!=EOF)
	{
		
		printf("\t%d",n);
	}
	fclose(f2);
	fclose(f3);
	fclose(f4);
}
