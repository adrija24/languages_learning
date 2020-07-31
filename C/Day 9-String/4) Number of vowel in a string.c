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
		if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
			j++;
	}
	printf("Total number of vowel : %d",j);
}
