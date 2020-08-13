#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
	char name[30];
	int age;
	float marks;
};
void main()
{
	struct student s;
	printf("Enter name : ");
	gets(s.name);
	printf("Enter age : ");
	scanf("%d",&s.age);
	printf("Enter marks : ");
	scanf("%f",&s.marks);
	printf("\nName - %s\nAge - %d\nMarks - %f/10",s.name,s.age,s.marks);
}
