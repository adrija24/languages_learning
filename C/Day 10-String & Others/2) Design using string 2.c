#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[]="ENCYCLOPEDIA";
	int i=0,j=0,k=0;
	
	for(i=0;str[i]!='\0';i++)
	{
		for(j=strlen(str)-1;j>=i;j--)
		{			
			printf("%c",str[k]);
			k++;
		}
		printf("\n");
		k=0;	
	}
}
