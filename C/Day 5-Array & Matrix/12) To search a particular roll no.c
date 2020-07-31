#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
	char name[20];
	int roll;
	float marks;
};
void main()
{
	struct student s[10];
	int i=0,r=0,flag=0;
	for(i=0;i<10;i++)
	{
		printf("Enter name : ");
		gets(s[i].name);
		printf("Enter roll : ");
		scanf("%d",&s[i].roll);
		printf("Enter marks : ");
		scanf("%f",&s[i].marks);
	}
	printf("Enter roll to find : ");
	scanf("%d",&r);
	for(i=0;i<10;i++)
	{
		if(s[i].roll==r)
			printf("%s %d %f",s[i].name,s[i].roll,s[i].marks);
	}
	if(flag==0)
		printf("Not found");
}
