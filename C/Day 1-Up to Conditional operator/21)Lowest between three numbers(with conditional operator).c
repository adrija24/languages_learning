#include<stdio.h>
#include<conio.h>
void main()
{
	int a=0,b=0,c=0,d=0;
	printf("Enter three numbers");
	scanf("%d %d %d",&a,&b,&c);
	d=(a<b&&a<c)?a:((b<a&&b<c)?b:c);
	printf("%d",d);
}
