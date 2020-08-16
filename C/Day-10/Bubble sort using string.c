#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
	char str[5][81],temp[81];
	int i=0,j=0;
	for(i=0;i<5;i++)
	{
		printf("Enter string : ");
		gets(str[i]);
	}
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			if(strcmp(str[i],str[j])>0)
			{
				strcpy(temp,str[i]);
				strcpy(str[i],str[j]);
				strcpy(str[j],temp);
			}
		}
	}
	printf("\nAfter sorting : \n");
	for(i=0;i<5;i++)
	{
		puts(str[i]);
	}	
}
