#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[]="ENCYCLOPEDIA";
	int i=0,j=0,space=0;
	for(i=0;str[i]!='\0';i++)
	{
		for(space=i;space<=strlen(str)-1;space--)
			printf(" ");
		for(j=i;j<=strlen(str)-1;j++)
		{
			printf("%c",str[j]);
		}
		
		printf("\n");	
	}
}
