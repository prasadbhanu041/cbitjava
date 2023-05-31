import java.util.Scanner;
class main
{
public static void main(String args [])
{
int a=6;
int b=4;
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
switch(i)
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a%b);
break;
default:
System.out.println("wrong input");
}
}
}