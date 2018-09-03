class Primeno
{
public static void main(String args[])
{
int a=2;
int b=10;
while(a<b)
{
boolean flag=false;
for(i=2;i<=a/2;++i)
{
if(a%i==0)
{
flag=true;
break;
}
}
if(!flag)
{
System.out.println(a+"");
++a;
}
}
}
}
}
