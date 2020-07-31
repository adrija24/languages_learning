#include<stdio.h>
#include<conio.h>
void main()
{
	char str[81];
	int i=0;
	printf("Enter string : ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if((int)str[i]>=65&&(int)str[i]<=90)
			str[i]=(char)((int)str[i]+32);
		else
			if((int)str[i]>=97&&(int)str[i]<=122)
				str[i]=(char)((int)str[i]-32);
	}
	puts(str);
}
