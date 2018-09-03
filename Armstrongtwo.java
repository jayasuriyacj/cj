class Armstrongtwo
{
public static void main(String args[])
{
int a,b,c=160,d=0,i;
for(i=150;i<=c;i++)
{
a=i;
while(a>0)
{
b=a%10;
d=d+(b*b*b);
a=a/10;
}
if(d==i)
{
System.out.print(i+" ");
}
d=0;
}
}
}
