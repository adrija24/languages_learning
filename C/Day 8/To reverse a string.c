#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[81],str1[81];
	int i=0,j=0;
	printf("Enter string : ");
	gets(str);
	for(i=strlen(str)-1,j=0;i>=0;i--,j++)
	{
		str1[j]=str[i];
	}
	str1[j]='\0';
	puts(str1);
}
