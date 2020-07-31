#include<stdio.h>
#include<conio.h>
void main()
{
	char str[81];
	int i=0,j=0;
	printf("Enter string : ");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]==' ')
			j++;
	}
	printf("Total number of space : %d",j);
}
