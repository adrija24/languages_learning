#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
	char name[20];
	int age;
	int marks;
};
void main()
{
	struct student s[10];
	int i=0;
	for(i=0;i<10;i++)
	{
		printf("Enter name : ");
		gets(s[i].name);
		printf("Enter age : ");
		scanf("%d",&s[i].age);
		printf("Enter marks : ");
		scanf("%d",&s[i].marks);
	}
	for(i=0;i<10;i++)
	{
		printf("\nName : %s\tAge : %d\tMarks : %d",s[i].name,s[i].age,s[i].marks);
	}
}
