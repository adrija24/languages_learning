#include<stdio.h>
#include<conio.h>
void main()
{
	char str[]="ENCYCLOPEDIA";
	int i=0,j=0;
	for(i=0;str[i]!='\0';i++)
	{
		for(j=0;j<=i;j++)
		{
			printf("%c",str[j]);
		}
		printf("\n");
	}
}
