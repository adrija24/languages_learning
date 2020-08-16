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
		if((int)str[i]>=97&&(int)str[i]<=122)
			j++;
	}
	printf("Total number of lower case : %d",j);
}
