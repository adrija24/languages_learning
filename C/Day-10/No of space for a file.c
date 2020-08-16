#include<stdio.h>
#include<conio.h>
void main()
{
	FILE *f1;
	int i=0;
	char c;
	f1=fopen("SPACE.txt","w");
	while(c=getchar()!=EOF)
		putc(c,f1);
	fclose(f1);
	f1=fopen("SPACE.txt","r");
	while(c=getc(f1)!=EOF)
	{
		if(c==' ')
		i++;
	}
	fclose(f1);
	printf("%d",i);
	
}
