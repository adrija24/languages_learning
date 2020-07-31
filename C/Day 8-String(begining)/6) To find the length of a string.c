#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[81];
	int i=0,j=0;
	printf("Enter string : ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		j++;
	}
	printf("%d",j);
}
