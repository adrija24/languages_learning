#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[81],str1[81];
	int i=0;
	printf("Enter string : ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		str1[i]=str[i];
	}
	str1[i]='\0';
	puts(str1);
}
